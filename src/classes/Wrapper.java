package classes;

import interfaces.WrapperInterface;

import java.util.HashMap;
import java.util.Map;

public class Wrapper<K, V> implements WrapperInterface<K, V> {
    Map<K, V> map = new HashMap<>();

    @Override
    public void add(K key, V value) {
        map.put(key, value);
    }

    @Override
    public V remove(K key) {
        return map.remove(key);
    }

    @Override
    public V getValue(K key) {
        return map.get(key);
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
