import java.util.*;;
public class Modulo {
    public static void main(String[] args) {

        int k,n;
        Scanner scan=new Scanner(System.in);
        n = scan.nextInt();
        k = scan.nextInt();
        
        
        scan.close();
        if(k<0) System.out.println("false");
        else if(n<=k) System.out.println("false");
        else System.out.println("true");
    }
}
