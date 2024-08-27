import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = scan.nextInt();
        if (age >= 1 && age <= 120) {

            int age_after_5yrs = age + 5;

            if (age_after_5yrs + 5 >= 18) {
                System.out.println("He is eligible to vote in next Election");
            } else {
                System.out.println("He is not eligible to vote in next Election");

            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}
