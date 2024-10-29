package org.example.ListExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
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

    public static void main(String[] args) {
/**
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("Bob", "Carl", "Dave", "Earl"));
        System.out.println(friendsArrayList);
        System.out.println(friendsArrayList.get(0) + " is the 0th element in the ArrayList");
        System.out.println("The size of the ArrayList is " + friendsArrayList.size());
**/
        ArrayListDemo demo = new ArrayListDemo();
        printArrayList(demo.friendsArrayList);
        demo.addToArrayList(demo.friendsArrayList, "Test");
        demo.addToArrayList(demo.friendsArrayList, 10);
        demo.addToArrayList(demo.friendsArrayList, 5.7777);
        printArrayList(demo.friendsArrayList);
        demo.printElementType(demo.friendsArrayList);
//        demo.clearList(demo.friendsArrayList);
//        System.out.println("Clearing ArrayList...");
        demo.replaceAll(demo.friendsArrayList, "Dean");
        printArrayList(demo.friendsArrayList);

    }

    public static void printArrayList(ArrayList someArray){
        System.out.println(someArray);
    }

    public static void printElementType(ArrayList someArray){
        for(Object element: someArray){
            System.out.println("Element " + element + " is of type: " + element.getClass().getSimpleName());
        }
    }

    public <T>  void addToArrayList(ArrayList<Object> list, T element){
        list.add(element);
    }

    public <T> void clearList(ArrayList<Object> list){
        list.clear();
    }

    public <T> void replaceAll(ArrayList<Object> list, T element){
        list.replaceAll(e -> element); //same as saying: For each element 'e' in the list, replace with 'element'
    }

}
