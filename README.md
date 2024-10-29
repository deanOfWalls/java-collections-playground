/*
### When to Use an Array vs. ArrayList

#### Arrays
- Arrays are **immutable**; they must be declared/initialized with a size as they cannot resize.
- Arrays are **not part of the Collections Framework**.
- They can store **primitive types** (e.g., `int`, `long`, `boolean`) as well as **objects**.

Examples:
```java
String[] friendsArray = new String[5]; // Declaration with size allocation
friendsArray[0] = "Bob"; // Assignment after declaration

String[] friendArray2 = {"Bob", "Carl", "Dave", "Earl", "Frank"}; // Initialization
```

#### ArrayLists
- Dynamic sizing: No fixed size needed; ArrayLists auto-resize.
- Can only store objects (no primitives), but primitives can be stored using wrapper classes (e.g., Integer for int).

```java
ArrayList<String> friendsArrayList = new ArrayList<>(); // Declaration
friendsArrayList.add("Bob"); // Assignment after declaration
friendsArrayList.addAll(Arrays.asList("Carl", "Dave", "Earl"));

ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("Bob", "Carl", "Dave", "Earl", "Frank")); // Initialization
```
#### Creating an Immutable List
To make a list immutable:
- Use Collections.unmodifiableList() or List.of() (Java 9+).
- List.of() is simpler and preferred in Java 9 and later. */