package Volatile;

public class SharedObject {

    volatile boolean flag = false;
    void setFlagTrue() {
        flag = true;
    }

    void  printFlag(){
        while(flag == false) {
            // Busy wait until flag is true
        }
        System.out.println("Reader read Flag as true");
    }
}