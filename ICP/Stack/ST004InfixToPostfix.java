import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ST004InfixToPostfix{
    public static boolean isPrecidenceHigher(String a, String b){
        String[] precidenceArray={"/","*","+","-"};
        if(Arrays.binarySearch(precidenceArray, a)<Arrays.binarySearch(precidenceArray, b)){
            return true;
        }
        return false;
    }
    
    
    public static ArrayList<String> solve(ArrayList<String> expression){
        Stack<String> st=new Stack<>();
        ArrayList<String> postFixExpression=new ArrayList<String>();

        for(int i=0;i<expression.size();i++){
            String o=expression.get(i);
            if(o.matches("\\d+")){ // Matches one or more digits
                postFixExpression.add(o);
            } else {
                while (!st.isEmpty() && !isPrecidenceHigher(o, st.peek())) {
                    postFixExpression.add(st.pop());
                }
                st.push(o);
            }
        }
        while (!st.empty()) {
            postFixExpression.add(st.pop());
        }
        return postFixExpression;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String exp=sc.next();
        // String exp = "10+3*4";
        ArrayList<String> arr = new ArrayList<>();
        StringBuilder num = new StringBuilder();
        for (char c : exp.toCharArray()) {
            if (Character.isDigit(c)) {
            num.append(c);
            } else {
            if (num.length() > 0) {
                arr.add(num.toString());
                num.setLength(0);
            }
            arr.add(String.valueOf(c));
            }
        }
        if (num.length() > 0) {
            arr.add(num.toString());
        }
        sc.close();
        
        
        System.out.println(solve(arr));
    }
}