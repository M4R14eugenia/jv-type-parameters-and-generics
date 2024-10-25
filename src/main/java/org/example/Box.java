package org.example;

public class Box <T, V extends Number> implements BoxOperations<V> {

    private String name;
    private T genericAttribute;
    private V largestValue;

    public String getName() {
        return name;
    }

    public Box(String name) {
        this.name = name;
    }
    public boolean hasSameName(Box <?, ?> box){
        return this.name.equals(box.getName());
    }

    public T getGenericAttribute() {
        return genericAttribute;
    }

    @Override
    public V getLargestValue() {
        return largestValue;
    }

    public void setGenericAttribute(T genericAttribute) {
        this.genericAttribute = genericAttribute;
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
