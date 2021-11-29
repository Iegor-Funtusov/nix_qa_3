package ua.com.alevel.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CustomMapImpl<K, V> implements CustomMap<K, V> {

    private List<Node<K, V>> nodes = new ArrayList<>();

    @Override
    public void put(K key, V value) {
        for (Node<K, V> node : nodes) {
            if (key.hashCode() != node.key.hashCode()) {
                // ...
                nodes.add(new Node<>(key, value));
            } else {
                // value merge
            }
        }
    }

    @Override
    public Set<K> setKeys() {
        return null;
    }

    @Override
    public List<V> listValues() {
        return null;
    }

    @Override
    public V get(K key) {
        return null;
    }

    private static class Node<K, V> {

        private K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
