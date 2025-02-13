public class Rc001GrayCode{
    public static void main(String[] args){
        int n=3;
        grayCode(n);
    }
    public static void grayCode(int n){
        if(n==0){
            System.out.println(0);
            return;
        }
        grayCode(n-1);
        int num=(int)Math.pow(2,n-1);
        for(int i=num-1;i>=0;i--){
            System.out.println(i+num);
        }
    }
}