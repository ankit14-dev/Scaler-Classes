import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input 1: ");
        int x = sc.nextInt();
        System.out.print("Enter input 2: ");
        int y = sc.nextInt();
        boolean result=((x>y) && ((2*y)>x));
        // System.out.println(x + " > " + y + " is " + result);
        System.out.println(result);
        sc.close();
    }
}
