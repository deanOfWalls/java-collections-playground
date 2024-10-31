package org.example.ListExamples;

public class ArrayListDemo {

    // Composition: Use AbstractArrayListOperations as a field instead of inheritance
    private final AbstractArrayListOperations<String> operations;

    public ArrayListDemo() {
        // Instantiate AbstractArrayListOperations with an anonymous class
        this.operations = new AbstractArrayListOperations<String>() {};
    }

    public static void main(String[] args) {
        ArrayListDemo demo = new ArrayListDemo();
        demo.runDemo();
    }

    public void runDemo() {
        // Delegate calls to the operations instance
        operations.printArrayList();
        operations.addToArrayList("Test");
        operations.addToArrayList("10");
        operations.addToArrayList("5.7777");
        operations.printArrayList();
        operations.printElementType();
        operations.replaceAll("Dean");
        operations.printArrayList();
        operations.clearList();
        System.out.println("Clearing ArrayList...");
        operations.printArrayList();
        System.out.println("The size of the ArrayList is " + operations.getList().size());
    }
}
