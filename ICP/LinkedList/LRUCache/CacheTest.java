package LRUCache;
public class CacheTest {
    public static void main(String[] args) {
        LinkedListCache cache = new LinkedListCache(3);
        cache.addNode(1);
        cache.addNode(2);
        cache.addNode(3);
        cache.addNode(4);
        cache.addNode(5);

        System.out.println((cache.isPresent(1)));
        System.out.println(cache.isPresent(3));

        cache.print();

        cache.add(6);
        cache.add(7);
        cache.add(8);

        System.out.println(cache.isPresent(1));

        cache.print();






    }
}
