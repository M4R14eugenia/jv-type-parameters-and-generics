package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BoxCache<K, V extends Box<?, ?>> extends HashMap<K, V> {

    public List<Box<?, ? extends Number>> getAll() {
        // TODO: fix it later
        return new ArrayList<>();
    }
}
