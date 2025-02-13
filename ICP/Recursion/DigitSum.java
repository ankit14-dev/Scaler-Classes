package Recursion;

public class DigitSum {
    public static void main(String[] args) {
        int n=1546;
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n/10==0) return n;
        return n%10+sum(n/10);
    }
}
