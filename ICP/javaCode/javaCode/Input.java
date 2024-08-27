package javaCode;

import javaCode.Sum;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Input 1: ");
        String num1=sc.nextLine();
        System.out.print("Enter Input 2: ");
        String num2=sc.nextLine();

        System.out.print("Sum of "+num1+"+"+num2+"=");
        int ai=Integer.parseInt(num1);
        int bi=Integer.parseInt(num2);
        System.out.println(Sum.sum(ai,bi));



    }
}
