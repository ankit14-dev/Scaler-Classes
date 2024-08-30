import java.util.Scanner;

public class Dog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String option;
        System.out.println("Do want ot adopt a Dog");
        System.out.println("Enter Yes or no [Y/n]");
        option = scan.nextLine();
        if (!choice(option)) {
            System.out.println("Thank you :)");
            return;

        } else {
            System.out.println("Do you prefer a large Dog or Small Dog ");
            boolean choice;
            option = scan.nextLine();
            if (option.equalsIgnoreCase("large"))
                choice = true;
            else
                choice = false;

            if (choice) {
                // for large dog
                System.out.println("Do you live in cold Climate");
                option = scan.nextLine();
                if (!choice(option)) {
                    //warm climate
                    System.out.println("You can Buy Doberman Pinscher ");
                } else {
                    // for cold climate
                    System.out.println("You can Buy  Alaskan Malamute");

                }


                

            } else {
                // for small dog

                System.out.println("Do you live in cold Climate");
                    option = scan.nextLine();

                    if (choice(option)) {
                        // for warm climate
                        System.out.println("You can Buy Chihuahua");
                    } else {
                        // for cold climate
                        System.out.println("You can Buy Pomeranian");
                        System.out.println();

                    }

            }
        }

        scan.close();
    }

    static boolean choice(String choice) {
        choice=choice.toLowerCase();

        if (choice.equals("no")) {
            return false;
        }

        return true;

    }
}
