package Recursion;

public class PalinDrome {
    public static void main(String[] args) {
        // String s="aefsdgf";
        // System.out.println(s.substring(1,s.length()-1));
        String s="madam";
        int n=s.length();
        System.out.println(isPalinDrome(s,0,n-1));
    }
    public static boolean isPalinDrome(String s,int start,int end){
        if(start>=end) return true;
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return isPalinDrome(s,start+1, end-1);
    }
}
