package org.example.ListExamples;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class AbstractArrayListOperations implements ArrayListOperations {
    ArrayList<Object> friendsArrayList = new ArrayList<>(Arrays.asList(
            "Anastasia",
            "Andre",
            "Andrew",
            "Castro",
            "Dean",
            "Jake",
            "Leon",
            "Nez"
    ));

    @Override
    public <T> void replaceAll(ArrayList<Object> list, T element) {
        list.replaceAll(e -> element); //same as saying: For each element 'e' in the list, replace with 'element'
    }

    @Override
    public <T> void clearList(ArrayList<Object> list) {
        list.clear();

    }

    @Override
    public <T> void addToArrayList(ArrayList<Object> list, T element) {
        list.add(element);
    }

    @Override
    public void printArrayList(ArrayList someArray) {
        System.out.println(someArray);
    }

    @Override
    public void printElementType(ArrayList someArray) {
        for (Object element : someArray) {
            System.out.println("Element " + element + " is of type: " + element.getClass().getSimpleName());
        }
    }
}
