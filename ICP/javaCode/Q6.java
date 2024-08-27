import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        int counter=0;
        if(M%2==0){
            counter+=M/2;
            counter*=N;
        }
        else{
            counter+=M/2;
            counter*=N;
            counter+=N/2;
        }
        System.out.println(counter);
        
        scan.close();
    }
}
