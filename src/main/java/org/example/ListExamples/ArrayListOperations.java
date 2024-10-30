package org.example.ListExamples;

import java.util.ArrayList;

public interface ArrayListOperations<T> {


    default void replaceAll(ArrayList<T> list, T element) {
        list.replaceAll(e -> element); //same as saying: For each element 'e' in the list, replace with 'element'
    }
    default void clearList(ArrayList<T> list) {
        list.clear();

    }
    default void addToArrayList(ArrayList<T> list, T element) {
        list.add(element);
    }
    default void printArrayList(ArrayList someArray) {
        System.out.println(someArray);
    }
    default void printElementType(ArrayList<T> someArray) {
        for (T element : someArray) {
            System.out.println("Element " + element + " is of type: " + element.getClass().getSimpleName());
        }
    }

}
