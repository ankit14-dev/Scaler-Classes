import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int steps = 0;
        if(x<=5){
            steps+=1;
        }
        else{
            steps+=x/5;
            x=x%5;
            if(x>0&&x<5) steps+=1;
        }
        
        System.out.println(steps);

    }
}
