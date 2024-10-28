package org.example.ListExamples;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

    /*
    A forward: when to use an Array or ArrayList?

    Arrays must be declared/initialized with a value as they are immutable. Arrays are not part of the Collection framework
    Arrays can hold anything (primitives like int, long, bool, but can also hold objects)
       String[] friendsArray = new String[5]; //Here is an example of declaration with size allocation (which is mandatory)
       friendsArray[0] = "Bob"; //Here is an example of assignment after declaration

       String[] friendArray2 = {"Bob", "Carl", "Dave", "Earl", "Frank"}; //Here is an example of initialization

   When/why would we use an ArrayList over an Array?
   ArrayLists don't have a fixed size so no size must be specified. They auto-resize
   ArrayLists can only hold objects (no primitives) but you can get around this by using wrapper classes, e.g., Int instead of int.

   ArrayList<String> friendsArrayList = new ArrayList<>(); //Declaration
   friendsArrayList.add("Bob"); //Assignment after declaration
   friendsArrayList.addAll(Arrays.asList("Carl","Dave","Earl"));

   ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("Bob", "Carl", "Dave", "Earl", "Frank")); //Initialization
    */


    public static void main(String[] args) {
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("Nastya", "Leon", "Andrew", "Nez"));
        System.out.println(friendsArrayList);
        System.out.println(friendsArrayList.get(0) + " is the 0th element in the ArrayList");
        System.out.println("The size of the ArrayList is " + friendsArrayList.size());
    }










}
