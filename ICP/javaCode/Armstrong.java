import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i))
                System.out.println(i);
        }

    }

    static boolean isArmstrong(int n) {
        int num = n;
        int finalNo = 0;
        int lastNo;
        while (n > 0) {
            lastNo = n % 10;
            finalNo += lastNo * lastNo * lastNo;
            n = n / 10;
        }
        return ((finalNo == num) ? true : false);
    }
}
