package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Box<T, V extends Number & Comparable<V>> implements BoxOperations<V> {

    private String name;
    private T genericAttribute;
    private V largestValue;

    public Box(String name) {
        this.name = name;
    }

    public void setLargestValueFromList(List<V> list) {
        largestValue = Collections.max(list);
    }

    public String getName() {
        return name;
    }


    public boolean hasSameName(Box <?, ?> box){
        return this.name.equals(box.getName());
    }

    // TODO: fix it later
    public T castValue(T value) {
        return (T) value;
    }

    public T getGenericAttribute() {
        return genericAttribute;
    }

    public void setGenericAttribute(T genericAttribute) {
        this.genericAttribute = genericAttribute;
    }

    @Override
    public V getLargestValue() {
        return largestValue;
    }

    @Override
    public void setLargestValue(V one, V two){

        if (one instanceof Integer && two instanceof Integer) {
            this.largestValue = (one.intValue() > two.intValue()) ? one : two;
        } else if (one instanceof Double && two instanceof Double) {
            this.largestValue = (one.doubleValue() > two.doubleValue()) ? one : two;
        } else if (one instanceof Float && two instanceof Float) {
            this.largestValue = (one.floatValue() > two.floatValue()) ? one : two;
        }

    }




}
