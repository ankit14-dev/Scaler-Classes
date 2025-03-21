import java.util.Stack;

public class StackPracticeGetMin extends Stack<Integer> {
    Stack<Integer> minstack=new Stack<>();

    public void push(int val){
        super.push(val);
        if(minstack.size()==0){
            minstack.push(val);
        }
        else if(minstack.peek()>val){
            minstack.push(val);
        }
    }
    public Integer pop(){
            int temp=super.pop();
            if(minstack.peek()==temp){
                minstack.pop();
            }
            return temp;
    
        }
    public int getMin(){
        return minstack.peek();
    }
    
}
