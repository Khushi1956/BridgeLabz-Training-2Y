public class Q9_CustomHashMap<K, V> {

    private static class Node<K, V> {
        K key; V value; Node<K, V> next;
        Node(K k, V v) { key = k; value = v; }
    }

    private Node<K, V>[] buckets;
    private int size, capacity = 16;

    @SuppressWarnings("unchecked")
    public Q9_CustomHashMap() { buckets = new Node[capacity]; }

    private int idx(K key) { return (key.hashCode() & 0x7fffffff) % capacity; }

    public void put(K key, V value) {
        int i = idx(key);
        for (Node<K, V> n = buckets[i]; n != null; n = n.next)
            if (n.key.equals(key)) { n.value = value; return; }
        Node<K, V> node = new Node<>(key, value);
        node.next = buckets[i]; buckets[i] = node; size++;
    }

    public V get(K key) {
        for (Node<K, V> n = buckets[idx(key)]; n != null; n = n.next)
            if (n.key.equals(key)) return n.value;
        return null;
    }

    public boolean remove(K key) {
        int i = idx(key); Node<K, V> prev = null, cur = buckets[i];
        while (cur != null) {
            if (cur.key.equals(key)) {
                if (prev == null) buckets[i] = cur.next; else prev.next = cur.next;
                size--; return true;
            }
            prev = cur; cur = cur.next;
        }
        return false;
    }

    public int size() { return size; }

    public static void main(String[] args) {
        Q9_CustomHashMap<String, Integer> map = new Q9_CustomHashMap<>();
        map.put("apple", 1); map.put("banana", 2); map.put("apple", 10);
        System.out.println("apple: "  + map.get("apple"));
        System.out.println("banana: " + map.get("banana"));
        map.remove("banana");
        System.out.println("banana after remove: " + map.get("banana"));
        System.out.println("size: " + map.size());
    }
}
