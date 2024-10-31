package org.example.ListExamples;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractArrayListOperations<T> implements ArrayListOperations<T> {

    protected List<T> friendsArrayList;

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
    public List<T> getList(){
        return friendsArrayList;
    }
}
