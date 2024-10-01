import java.util.Scanner;
public class HCF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int a=Math.max(num1,num2);
        int b=Math.min(num1,num2);

        while(a%b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        System.out.println(b);
        
    }
}
