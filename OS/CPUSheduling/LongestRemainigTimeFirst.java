import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class LongestRemainigTimeFirst {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        String[] s1=sc.nextLine().split(" ");
        String[] s2=sc.nextLine().split(" ");
        sc.close();
        int timeQuantum=1;
        int n=s1.length;
        int[] burst_times=new int[n];
        int[] arrival_times=new int[n];
        for(int i=0;i<n;i++){
            arrival_times[i]=Integer.parseInt(s1[i]);
            burst_times[i]=Integer.parseInt(s2[i]);
        }
        Process[] jobs=new Process[n];
        for(int i=0;i<n;i++){
            jobs[i]=new Process(arrival_times[i],burst_times[i]);
        }
        Arrays.sort(jobs,Comparator.comparingInt(p->p.arrival));
        int idx=0;
        int totalTAT=0;
        int totalWait=0;
        int end=0;
        int time=0;

        // Queue<Process> q=new LinkedList<>();
        PriorityQueue<Process> q = new PriorityQueue<>(
            (x, y) -> x.remainingTime != y.remainingTime ? y.remainingTime - x.remainingTime : x.arrival - y.arrival
        );

        while(idx<n|| q.size()>0){
            //insert all the jobs in Queue
            while(idx<n && jobs[idx].arrival<=time){
                q.add(jobs[idx]);
                idx++;
            }
            if(q.size()>0){
                Process curr=q.remove();
                int executionTime=Math.min(curr.remainingTime,timeQuantum);
                curr.remainingTime-=executionTime;
                time+=executionTime;

                while(idx<n && jobs[idx].arrival<=time){
                    q.add(jobs[idx]);
                    idx++;
                }
                if(curr.remainingTime>0) q.add(curr);
                else{
                    int tat=time-curr.arrival;
                    int wait=tat-curr.burst;
                    System.out.println("Process: "+curr.arrival+" "+curr.burst+" "+tat+" "+wait);
                    totalTAT+=tat;
                    totalWait+=wait;
                }                
            }
            else{
                time=jobs[idx].arrival;
            }
        }
        System.out.println((double)totalWait/n);
        System.out.println((double)totalTAT/n);
    }
}
class Process{
    int burst;
    int arrival;
    int remainingTime;
    Process(int arrival,int burst){
        this.arrival=arrival;
        this.burst=burst;
        this.remainingTime=burst;
    }
}