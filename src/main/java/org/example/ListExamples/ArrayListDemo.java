package org.example.ListExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo extends AbstractArrayListOperations{
    public static void main(String[] args) {
        new ArrayListDemo().runDemo();
    }

    public void runDemo(){
        printArrayList(friendsArrayList);
        addToArrayList(friendsArrayList, "Test");
        addToArrayList(friendsArrayList, 10);
        addToArrayList(friendsArrayList, 5.7777);
        printArrayList(friendsArrayList);
        printElementType(friendsArrayList);
        replaceAll(friendsArrayList, "Dean");
        printArrayList(friendsArrayList);
        clearList(friendsArrayList);
        System.out.println("Clearing ArrayList...");
        printArrayList(friendsArrayList);
        System.out.println("The size of the ArrayList is " + friendsArrayList.size());
    }

}
