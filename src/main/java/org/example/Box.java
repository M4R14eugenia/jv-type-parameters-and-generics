package org.example;

public class Box <T, V extends Number>{

    private T genericAttribute;
    private V largestValue;

    public T getGenericAttribute() {
        return genericAttribute;
    }

    public V getLargestValue() {
        return largestValue;
    }

    public void setGenericAttribute(T genericAttribute) {
        this.genericAttribute = genericAttribute;
    }
    public void setLargestValue (V one, V two){
      //  largestValue= Math.max((one, two);

    }
}
