package com.kbtomlinson;

import java.util.ArrayList;

public interface IStorage {
    // Create a simple interface that allows an object to be saved to some sort of storage medium.
    // The exact type of medium is not known to the interface (nor to the classes that implement it).
    // The interface will just specify 2 methods, one to return an ArrayList of values to be saved
    // and the other to populate the object's fields from an ArrayList.

    // Interface
    // 2 Methods


    // one to return an ArrayList of values
    // populate the object's field from an ArrayList

    ArrayList<String> write();
    void read(ArrayList<String> savedValues);
}
