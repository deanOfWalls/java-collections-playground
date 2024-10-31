package org.example.ListExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo extends AbstractArrayListOperations<String>{
    public static void main(String[] args) {
        ArrayListDemo demo = new ArrayListDemo();
        demo.runDemo();

    }

    public void runDemo(){
        printArrayList();
        addToArrayList("Test");
        addToArrayList("10");
        addToArrayList("5.7777");
        printArrayList();
        printElementType(friendsArrayList);
        replaceAll("Dean");
        printArrayList();
        clearList();
        System.out.println("Clearing ArrayList...");
        printArrayList();
        System.out.println("The size of the ArrayList is " + friendsArrayList.size());
    }

}
