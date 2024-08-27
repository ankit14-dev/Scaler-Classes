import java.util.Scanner;

public class Compare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input 1: ");
        int input1 = sc.nextInt();
        System.out.print("Enter input 2: ");
        int input2 = sc.nextInt();
        if (input1>input2){
            System.out.println(input1+"is gerater");
        }
        else{
            System.out.println(input1+"is not gerater");

        }
        sc.close();
    }
}
