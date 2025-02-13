public class ArrayList {
    private int[] array;
    private int INITIAL_CAPACITY = 10;
    private int currentIndex;
    private int size;
    ArrayList(){
        this.size=0;
        array=new int[INITIAL_CAPACITY];
        currentIndex=0;
    }
    void add(int value){
        if(this.array.length > size){
            this.array[currentIndex++]=value;
        }else{
            int[] newArray=new int[this.array.length];
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

    }
    void sort(){

    }
    int size(){
        return this.currentIndex;
    }
}
