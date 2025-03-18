import java.util.HashMap;

class Node{
    int value;
    Node next;
    Node prev;
    
    public Node(int value){
        this.value = value;
    }
}
public class LinkedListCache {

    Node head;
    Node tail;
    int capacity;
    int size;
    HashMap<Integer, Node> map;

    public LinkedListCache(int capacity){
        this.capacity = capacity;
        this.size = 0;
        map = new HashMap<>();
    }

    public Node isPresent(int value){
        if(map.containsKey(value)){
            return map.get(value);
        }
        return null;
    }
    private void removeTail(){
        if(size == 0){
            return;
        }
        map.remove(tail.value);
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    private void reOrder(Node node){
        if(node == head){
            return;
        }
        else if(node == tail){
            removeTail();
        }
        else{
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.next = head;
            head.prev = node;
            node.prev = null;
            head = node;
        }
    }
    private void addNode(int value){
        Node node = new Node(value);
        map.put(value, node);
        if(size == 0){
            head = node;
            tail = node;
            size++;
        }else{
            if(size == capacity){
                removeTail();
            }
            node.next = head;
            head.prev = node;
            head = node;
            size++;
        }
    }

    public void add(int value){
        // check if the value is already present
        Node node = isPresent(value);
        if(node !=null){
            reOrder(node);

        }
        else{
            addNode(value);
        }
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}