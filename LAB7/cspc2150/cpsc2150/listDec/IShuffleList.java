package cpsc2150.listDec;

import java.util.Random;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @initialization Ensures:
 *  [an empty list is created]
 */

public interface IShuffleList<T> extends List<T> {


    /**
     * shuffles random index's of self swaps times
     *
     * @param swaps represents the number of shuffles of list
     *
     * @pre swaps >= 0
     *
     * @post [shuffle calls function swaps(int , int)] AND
     * [random elements in self are displaced to different locations but the values are preserved swaps times]
     */
    default void shuffle(int swaps) {
        int pos1;
        int pos2;

        Random rand = new Random();

        for (int i = 0; i < swaps; ++i) {
            pos1 = rand.nextInt(size());
            pos2 = rand.nextInt(size());

            swap(pos1 , pos2);

        }

    }

    /**
     * swap flips the location of one element with another
     *
     * @param i represents the index of an element in self
     * @param j represents the index of an element in self
     *
     * @pre i >= 0 AND i <= |self| - 1 AND j >= 0 AND j <= |self| - 1
     *
     * @post
     * [swap calls primary functions get(int) and set(int , T) AND
     * [elements in self are displaced to different locations but the values are preserved]
     */
    default void swap(int i, int j) {

        T temp = get(i);

        set(i , get(j));
        set(j , temp);

    }

}