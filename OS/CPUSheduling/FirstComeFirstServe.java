import java.util.Arrays;

class FirstComeFirstServe{
    public static void main(String[] args) {
        int n=4;
        int[] arrival_times={0,1,2,3}; //new int[n];
        int[] burst_times={4,3,1,2}; //new int[n];
        Process[] processes=new Process[n];
        for(int i=0;i<n;i++){            
            processes[i]=new Process(arrival_times[i],burst_times[i]);
        }
        Arrays.sort(processes,(a, b) -> Integer.compare(a.arrival, b.arrival));
        fcfs(processes);
    }
    public static void fcfs(Process[] processes){
        int end=0;
        int totalTAT=0;
        int totalWT=0;
        for(Process p: processes){
            int arrival=p.arrival;
            int burst=p.burst;
            int start=Math.max(end, arrival);
            int completion=start+burst;
            end=completion;
            int tat=completion-arrival;
            int wt=tat-burst;
            totalTAT+=tat;
            totalWT+=wt;
        }
        System.out.println("Average Turnaround Time: "+(double)totalTAT/processes.length);
        System.out.println("Average Waiting Time: "+(double)totalWT/processes.length);
            

    }
}
