import java.util.Scanner;

public class _Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double t=scan.nextInt();
        double n=scan.nextInt();
        double attPercentage;
        attPercentage=(n/t)*100;
        System.out.println(attPercentage);
        if(attPercentage>=75.0) System.out.println("YES");
        else System.out.println("NO");
    }
}
