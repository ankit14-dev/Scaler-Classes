import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3, x4, y3, y4;

        if (x1 == x2) {
            int diff = Math.abs(y2 - y1);
            y3 = y2;
            x3 = diff + x2;
            x4 = x1 + diff;
            y4 = y1;
            System.out.println(x4 + " " + y4 + " " + x3 + " " + y3);

        } else if (y1 == y2) {
            int diff = Math.abs(x2 - x1);
            x3 = x2;
            y3 = y1 + diff;
            x4 = x1;
            y4 = y1 + diff;
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);

        } else if((Math.abs(x1-x2)==Math.abs(y1-y2) )){
            int diff = x2 - x1;
            x3 = x2;
            y3 = y1;
            x4 = x1;
            y4 = y2;
            System.out.println(x4 + " " + y4 + " " + x3 + " " + y3);

        }
        else{
            System.out.println(-1);
        }
    }
}
