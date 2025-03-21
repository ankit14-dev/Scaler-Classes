package LRUCache;
import java.util.HashMap;
import java.util.Map;

class Node {
    int key;
    int value;
    Node next;
    Node prev;
    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class NewLinkedCache {
    Node head;
    Node tail;
    int capacity;
    int size;

    HashMap<Integer, Node> map;
    public NewLinkedCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        map = new HashMap<>();
    }
    

}
