import java.util.*;

class MyHashMap<K, V> {

    class Node {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity = 10;
    private LinkedList<Node>[] buckets;

    MyHashMap() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    public int getBucketIndex(K key){
        int index=Math.abs(key.hashCode())%capacity;
        return index;
    }
    public void put(K key,V value){
        int index=getBucketIndex(key);
        LinkedList<Node> bucket= buckets[index];

        for(Node node: bucket){
            if(node.key.equals(key)){
                node.value=value;
            }
        }
        bucket.add(new Node(key, value));
    }
    public V get(K key){
        int index=getBucketIndex(key);
        LinkedList<Node> bucket=buckets[index];
        for(Node node:bucket){
            if(node.key.equals(key)){
                return node.value;
            }
        }
        return null;
    }
    public boolean containskey(K key) {
        int index = getBucketIndex(key);
        LinkedList<Node> bucket = buckets[index];
        for (Node node : bucket) {
            if (node.key.equals(key)){
                return true;
            }
        }
        return false;
    }


}

public class HashMapImplementation {
    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<>();
        map.put(1,"one");
        map.put(11,"eleven");
        System.out.println("value :"+map.get(1));
        if(map.containskey(1)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}