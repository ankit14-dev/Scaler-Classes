import java.util.Arrays;
public class Oops3{
    public static void main(String[] args){
        ArrayList list=new ArrayList();
        list.add(10);
        list.add(30);
        list.add(110);
        list.add(60);
        list.add(50);
        list.add(100);
        list.add(70);
        list.add(120);
        list.add(20);
        list.add(90);
        list.add(40);
        list.add(80);
        list.add(130);
    
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        list.set(2,600);
        System.out.println();
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        list.sort();
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(list.size());
    }
}
class ArrayList {
    private int[] array;
    private int INITIAL_CAPACITY = 10;
    private int currentIndex;
    ArrayList(){
        this.array=new int[INITIAL_CAPACITY];
        this.currentIndex=0;
    }
    void add(int value){
        if(this.array.length > currentIndex){
            this.array[currentIndex++]=value;
        }else{
            int[] newArray=new int[this.array.length*2];
            for(int i=0;i<array.length;i++){
                newArray[i]=array[i];
            }
            this.array=newArray;
            this.array[currentIndex++]=value;
        }

    }
    int get(int index){
        return this.array[index];
    }
    void set(int index, int value){
        if(index>=0 && index<currentIndex){
            this.array[index]=value;
        } else{
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

    }
    void sort(){
        Arrays.sort(this.array,0,currentIndex);
    }
    int size(){
        return this.currentIndex;
    }
}
