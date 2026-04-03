/**
 * Q9. Implement a Custom HashMap
 * 
 * Design and implement a basic HashMap with insertion, deletion, and retrieval.
 * 
 * Approach: Separate Chaining
 * - Use an array of linked lists (buckets).
 * - Each bucket holds key-value pairs that hash to the same index.
 * - Hash function: index = key.hashCode() % capacity (handle negatives too).
 * - On collision, append to the linked list at that bucket.
 * - Dynamic resizing when load factor exceeds threshold.
 * 
 * Time Complexity: O(1) average for put/get/remove; O(n) worst case (all in one bucket)
 * Space Complexity: O(n)
 */
public class Q9_CustomHashMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR_THRESHOLD = 0.75;

    private Node<K, V>[] buckets;
    private int size;
    private int capacity;

    // Node for separate chaining linked list
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    @SuppressWarnings("unchecked")
    public Q9_CustomHashMap() {
        this.capacity = DEFAULT_CAPACITY;
        this.buckets = new Node[capacity];
        this.size = 0;
    }

    // Hash function: map key to bucket index
    private int getBucketIndex(K key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    // Insert or update a key-value pair
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        Node<K, V> head = buckets[index];

        // Check if key already exists — update value
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Key not found — insert at the front of the chain
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;

        // Resize if load factor exceeded
        if ((double) size / capacity > LOAD_FACTOR_THRESHOLD) {
            resize();
        }
    }

    // Retrieve value by key; returns null if not found
    public V get(K key) {
        int index = getBucketIndex(key);
        Node<K, V> head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) return head.value;
            head = head.next;
        }

        return null; // key not found
    }

    // Remove a key-value pair; returns true if removed
    public boolean remove(K key) {
        int index = getBucketIndex(key);
        Node<K, V> head = buckets[index];
        Node<K, V> prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = head.next; // remove head of chain
                } else {
                    prev.next = head.next;
                }
                size--;
                return true;
            }
            prev = head;
            head = head.next;
        }

        return false; // key not found
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Resize buckets array when load factor threshold is exceeded
    @SuppressWarnings("unchecked")
    private void resize() {
        capacity *= 2;
        Node<K, V>[] newBuckets = new Node[capacity];

        for (Node<K, V> head : buckets) {
            while (head != null) {
                Node<K, V> next = head.next;
                int newIndex = (head.key.hashCode() & 0x7fffffff) % capacity;
                head.next = newBuckets[newIndex];
                newBuckets[newIndex] = head;
                head = next;
            }
        }

        buckets = newBuckets;
    }

    public static void main(String[] args) {
        Q9_CustomHashMap<String, Integer> map = new Q9_CustomHashMap<>();

        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);
        map.put("apple", 10); // update existing key

        System.out.println("get(apple): " + map.get("apple"));   // 10 (updated)
        System.out.println("get(banana): " + map.get("banana")); // 2
        System.out.println("get(cherry): " + map.get("cherry")); // 3
        System.out.println("get(mango): " + map.get("mango"));   // null

        System.out.println("Size: " + map.size()); // 3

        map.remove("banana");
        System.out.println("After removing banana, get(banana): " + map.get("banana")); // null
        System.out.println("Size after removal: " + map.size()); // 2

        System.out.println("containsKey(cherry): " + map.containsKey("cherry")); // true
        System.out.println("containsKey(banana): " + map.containsKey("banana")); // false

        // Test with integer keys
        Q9_CustomHashMap<Integer, String> intMap = new Q9_CustomHashMap<>();
        for (int i = 1; i <= 20; i++) intMap.put(i, "val_" + i); // triggers resize
        System.out.println("\nInteger map - get(15): " + intMap.get(15)); // val_15
        System.out.println("Integer map size: " + intMap.size());         // 20
    }
}
