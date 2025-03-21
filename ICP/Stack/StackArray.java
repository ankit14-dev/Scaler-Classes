class StackArray{

    int[] arr;
    int size;
    int index;
    StackArray(int size){
        arr=new int[size];
        this.size=size;
        index=0;
    }

    void push(int x) throws Exception{
        if(index==size){
            System.out.println("Stack is full Cannot Push");
            throw new Exception("Stack OverFlow");
        }
        arr[index]=x;
        index++;
    }
    int pop() throws Exception{
        if(index==-1){
            throw new Exception("Stack UnderFlow");
        }
        return arr[index--];
    }
}