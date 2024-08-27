import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str = scan.nextLine();
        String hstr="",mstr="";
        String hs,ms;
        int a=scan.nextInt();
        for(int i=0;i<2;i++){
            hstr+=str.charAt(i);
        }
        int hour=Integer.parseInt(hstr);
        for(int i=3;i<5;i++){
            mstr+=str.charAt(i);
        }
        int min=Integer.parseInt(mstr);
        min+=a;
        if(min>59){
            hour+=(min/60);
            min=min-60*(min/60);
        }
        // System.out.println(hour);
        // System.out.println(min);
        if(hour>23){
            hour=hour-24*(hour/24);
        }
        // System.out.println(hour);
        // System.out.println(min);

        if(hour<10){
            hs="0"+hour;
        }
        else{
            hs=Integer.toString(hour);
        }
        // System.out.println(hs);
        if(min<10) ms="0"+min;
        else ms=Integer.toString(min);
        // System.out.println(ms);
        // formattedStr=(String)hour+":"+
        System.out.println(hs+":"+ms);
    }
}
