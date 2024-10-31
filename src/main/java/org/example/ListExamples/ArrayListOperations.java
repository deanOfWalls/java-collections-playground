package org.example.ListExamples;

import java.util.ArrayList;

public interface ArrayListOperations<T> {

    ArrayList<T> getList();

    default void replaceAll(T element) {
        getList().replaceAll(e -> element); //same as saying: For each element 'e' in the list, replace with 'element'
    }
    default void clearList() {
        getList().clear();

    }
    default void addToArrayList(T element) {
        getList().add(element);
    }

    default void printArrayList() {
        System.out.println(getList());
    }

    default void printElementType(ArrayList<T> someArray) {
        for (T element : someArray) {
            System.out.println("Element " + element + " is of type: " + element.getClass().getSimpleName());
        }
    }
}
