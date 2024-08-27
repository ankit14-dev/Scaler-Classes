import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Uncle = scan.nextLine();
        String Matroskin = scan.nextLine();
        String Sharic = scan.nextLine();

        if (Uncle.equals(Matroskin)) {
            if (Uncle.equals(Sharic)) {
                System.out.println("?");
                return;
            }
            if (whoIsWinning(Uncle, Sharic).equals(Sharic)) {
                System.out.println("S");
                return;
            }

        } else if (Matroskin.equals(Sharic)) {
            if (Matroskin.equals(Uncle)) {
                System.out.println("?");
                return;                
            }
            // System.out.println(whoIsWinning(Matroskin, Uncle));
            if (whoIsWinning(Matroskin, Uncle).equals(Uncle)) {
                System.out.println("F   ");
                return;
            }
        } else if (Uncle.equals(Sharic)) {
            if (Matroskin.equals(Uncle)) {
                System.out.println("?");
                return;
            }
            // System.out.println(whoIsWinning(Matroskin, Sharic));
            if (whoIsWinning(Matroskin, Sharic).equals(Matroskin)) {
                System.out.println("M");
                return;
            }
            
        }
        System.out.println("?");
        return;

    }

    static String whoIsWinning(String option1, String option2) {
        if (option1.equals("rock")) {
            if (option2.equals("scissors"))
                return "rock";
            else
                return "paper";
        } else if (option1.equals("paper")) {
            if (option2.equals("scissors"))
                return "scissors";
            else
                return "paper";
        } else {
            if (option2.equals("rock"))
                return "rock";
            else
                return "scissors";
        }

    }
}
