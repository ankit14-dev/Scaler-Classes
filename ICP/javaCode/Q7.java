import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        if((a+b+1)<n){
            System.out.println(b+1);
            return;
        }
        int no=n-a;
        System.out.println(no);;
        scan.close();
    }
}
