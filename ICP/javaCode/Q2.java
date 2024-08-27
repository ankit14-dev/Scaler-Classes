import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int d=scanner.nextInt();
        //1,3,5,7,8,10,12
        //2469,11
        if (m==2) {
            if(d==1)System.out.println(4);
            else System.out.println(5);

        }
        else if(m==4||m==6||m==9 || m==11){
            // totaldays=30;
            if(d<=6) System.out.println(5);
            else System.out.println(6);
        }
        else{
            if(d<=5) System.out.println(5);
            else System.out.println(6);
        }
    }
}
