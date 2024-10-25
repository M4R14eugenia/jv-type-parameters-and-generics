package org.example;

public interface BoxOperations<V> {
    public abstract V getLargestValue();
    public abstract void setLargestValue(V one, V two);
}
