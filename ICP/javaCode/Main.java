import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        for (int i = 0; i < 4; i++) {
            if (i == 1 || i == 2) {
                System.out.print("*");
                for (int j = 0; j < 8; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");

            } else {
                for (int j = 0; j < 10; j++) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }
}