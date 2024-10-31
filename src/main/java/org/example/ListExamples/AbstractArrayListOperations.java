package org.example.ListExamples;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class AbstractArrayListOperations<T> implements ArrayListOperations<T> {

    protected ArrayList<T> friendsArrayList;

    public AbstractArrayListOperations() {
        //Constructor to initialize friendsArrayList
        this.friendsArrayList = new ArrayList<>(Arrays.asList(
                (T) "Anastasia",
                (T) "Andre",
                (T) "Andrew",
                (T) "Castro",
                (T) "Dean",
                (T) "Jake",
                (T) "Leon",
                (T) "Nez"
        ));

    }

    @Override
    public ArrayList<T> getList(){
        return friendsArrayList;
    }
}
