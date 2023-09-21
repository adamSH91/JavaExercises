package interfaces;

public interface WrapperInterface<K, V> {
    V getValue(K key);

    void add(K key, V value);

    V remove(K key);
}
