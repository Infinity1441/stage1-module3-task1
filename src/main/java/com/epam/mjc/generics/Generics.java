package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1
    public List boxingMethod(String name) {
        List firstList = new ArrayList<>();
        firstList.add(name);
        List secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    //TODO: Refactor Method-2
    public Object genericMethod(Object data) {
        return data;
    }

    //TODO: Refactor Method-3
    public void cloneMethod(List consumer, List producer) {
        consumer.addAll(producer);
    }

}
