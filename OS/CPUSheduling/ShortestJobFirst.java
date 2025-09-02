import java.util.Arrays;

public class ShortestJobFirst {
    public static void main(String[] args) {
        int n=4;
        int[] arrival_times={1,2,1,4}; //new int[n];
        int[] burst_times={3,4,2,4}; //new int[n];
        Process[] processes=new Process[n];
        for(int i=0;i<n;i++){            
            processes[i]=new Process(arrival_times[i],burst_times[i]);
        }
        Arrays.sort(processes,(a, b) ->{
            if(a.arrival==b.arrival){
                return Integer.compare(a.burst, b.burst);
            }
            return Integer.compare(a.arrival, b.arrival);
        });
        SJF(processes);
    }
    public static void SJF(Process[] processes){
        int end=0;
        int totalTAT=0;
        int totalWT=0;
        for(Process p: processes){
            int arrival=p.arrival;
            int burst=p.burst;
            int start=Math.max(arrival,end);
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
