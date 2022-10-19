package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1
    public List<List<String>> boxingMethod(String name) {
        List<String> firstList = new ArrayList<>();
        firstList.add(name);
        List<List<String>> secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    //TODO: Refactor Method-2
    public <T> T genericMethod(T data) {
        return (T) data;
    }

    //TODO: Refactor Method-3
    public <T> void cloneMethod(List<? super T> consumer, List<? extends T> producer) {
        consumer.addAll(producer);
    }

}
