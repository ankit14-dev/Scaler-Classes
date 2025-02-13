package Recursion;

public class TowerOfHanoi{
    public static void main(String[] args){
        int n=4;
        towerofHanoi(n,'A','C','B');

    }
    public static void towerofHanoi(int n,char source,char destination,char helper){
        if (n==0){
            // System.out.println("Move "+n+" from "+source+" to "+destination);
            return;
        }
        towerofHanoi(n-1,source,helper,destination);
        System.out.println("Move "+n+" from "+source+" to "+destination);
        towerofHanoi(n-1,helper,destination,source);

    }
}