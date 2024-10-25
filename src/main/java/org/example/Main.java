package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BoxCache<Integer, Box<?, ?>> boxCache = new BoxCache<>();

        Box<String, Integer> box = new Box<>("IntegerBox");
        Box<String, Float> box2 = new Box<>("FloatBox");
        Box<String, Double> box3 = new Box<>("DoubleBox");

        box.setLargestValue(51, 61);
        box2.setLargestValue(52F, 62F);
        box3.setLargestValue(51.35637D, 52D);

        List<Integer> largestIntegers = new ArrayList<>();
        List<Float> largestFloats = new ArrayList<>();
        List<Double> largestDoubles = new ArrayList<>();

        boxCache.put(1, box);
        boxCache.put(2, box2);
        boxCache.put(3, box3);

        for (Box<?, ? extends Number> cachedBox : boxCache.getAll()) {
            switch (cachedBox.getLargestValue().getClass()) {
                case (Integer.class) -> largestIntegers.add(cachedBox.getLargestValue());
                case (Float.class) -> largestFloats.add(cachedBox.getLargestValue());
                case (Double.class) -> largestDoubles.add(cachedBox.getLargestValue());
            }
        }

        System.out.println("Largest Integers: " + largestIntegers);
        System.out.println("Largest Floats: " + largestFloats);
        System.out.println("Largest Doubles: " + largestDoubles);

    }
}