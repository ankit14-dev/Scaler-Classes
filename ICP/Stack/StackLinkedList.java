class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class StackLinkedList {
    Node head;

    public void push(int val){
        Node node =new Node(val);
        node.next=head;
        head=node;
    }
    public int pop(){
        
    }
}
