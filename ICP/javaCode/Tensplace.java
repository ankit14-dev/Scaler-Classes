import java.util.Scanner;
public class Tensplace {
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        while (true) {
            
            n = scan.nextInt();
            int r=n%100;
            System.out.println(Math.abs(r/10));
    
    
        }
        // scan.close();
    }
}

