import java.util.Scanner;
public class LagestNo {
    public static void main(String[] args) {
        int k,n;
        Scanner scan=new Scanner(System.in);
        n = scan.nextInt();
        k = scan.nextInt();

        
        if(n%k!=0){
            int q=n/k;
            System.out.println(k*q);
        }

        else System.out.println(n);


        scan.close();
    }
}
