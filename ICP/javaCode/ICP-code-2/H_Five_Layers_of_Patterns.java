import java.util.Scanner;

public class H_Five_Layers_of_Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print((char)(65+i));
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}