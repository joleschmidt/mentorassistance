package de.thm.mni.oopfq.storage;

import java.util.HashSet;
import java.util.Set;

/**
 * Creates a java set as an in-memory store.
 */
public class Store implements IStore {

    /**
     * @param <T> Type of the elements to store.
     * @return Java Set
     */
    public <T> Set<T> newStore() {
        return new HashSet<>();
    }
}
