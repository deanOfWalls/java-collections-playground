package org.example.ListExamples;

import java.util.ArrayList;

public interface ArrayListOperations {


    <T> void replaceAll(ArrayList<Object> list, T element);

    <T> void clearList(ArrayList<Object> list);

    <T>  void addToArrayList(ArrayList<Object> list, T element);

    void printArrayList(ArrayList someArray);

    void printElementType(ArrayList someArray);


}
