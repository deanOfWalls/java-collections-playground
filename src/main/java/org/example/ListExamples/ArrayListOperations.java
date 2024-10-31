package org.example.ListExamples;

import java.util.List;

public interface ArrayListOperations<T> {

    // Getter stub for list (now returns List<T> instead of ArrayList<T>)
    List<T> getList();

    default void replaceAll(T element) {
        getList().replaceAll(e -> element);
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

    default void printElementType() {
        for (T element : getList()) {
            System.out.println("Element " + element + " is of type: " + element.getClass().getSimpleName());
        }
    }
}
