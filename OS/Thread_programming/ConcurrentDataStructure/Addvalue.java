package ConcurrentDataStructure;

import java.util.ArrayList;

public class Addvalue implements Runnable {
    ArrayList<Integer> list;
    int startIndex;
    public Addvalue(ArrayList<Integer> list,int startIndex) {
        this.list = list;
        this.startIndex = startIndex;
    }
    @Override
    public void run() {
        for (int i = startIndex; i < startIndex + 1000; i++) {
            list.add(i,i+1);
        }
    }
}
