package de.thm.mni.oopfq.storage;

import java.util.Set;

/**
 * A store creator that creates collections to store and read data.
 */
public interface IStore {
    /**
     * Creates a set store.
     * @param <T> The type of the elements to store in the store.
     * @return A set.
     */
    public <T> Set<T> newStore();
}
