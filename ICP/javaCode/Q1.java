import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        // int q=n/k;
        // System.out.println(k*(q+1));
        System.out.println((n-(n%k))+k);
    }
}