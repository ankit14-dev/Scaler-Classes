import java.util.LinkedList;
import java.util.Queue;

public class RoundRobin {
    public static void RR(Process[] processes, int quantum) {
        int n=processes.length;
        int idx=0;
        int totalTAT=0;
        int totalWait=0;
        int end=0;
        int time=0;

        Queue<Process> q=new LinkedList<>();

        while(idx<n|| q.size()>0){
            //insert all the jobs in Queue
            while(idx<n && processes[idx].arrival<=time){
                q.add(processes[idx]);
                idx++;
            }
            if(q.size()>0){
                Process curr=q.remove();
                int executionTime=Math.min(curr.remainingTime,quantum);
                curr.remainingTime-=executionTime;
                time+=executionTime;

                while(idx<n && processes[idx].arrival<=time){
                    q.add(processes[idx]);
                    idx++;
                }
                if(curr.remainingTime>0) q.add(curr);
                else{
                    int tat=time-curr.arrival;
                    int wait=tat-curr.burst;
                    totalTAT+=tat;
                    totalWait+=wait;
                }                
            }
            else{
                time=processes[idx].arrival;
            }
        }
        System.out.println(totalWait/n);
        System.out.println(totalTAT/n);
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