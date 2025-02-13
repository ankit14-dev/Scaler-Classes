package Recursion;

public class APowerN {
    public static void main(String[] args) {
        int n=10;
        int a=2;
        System.out.println(power(a,n));
    }
    public static int power(int a,int n){
        if(n<=1) return a;
        if(n%2==0){
            int x=power(a,n/2);
            return x*x;

        }
        else{
            int x=power(a,n/2);
            return a*x*x;
        }
    }
}
