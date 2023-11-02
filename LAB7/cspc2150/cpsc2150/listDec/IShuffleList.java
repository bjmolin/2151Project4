package cpsc2150.listDec;

import java.util.Random;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public interface IShuffleList<T> extends List<T> {

    default void shuffle(int swaps) {
        int pos1;
        int pos2;

        for (int i = 0; i < swaps; ++i) {
            pos1 = rand(size());
            pos2 = rand(size());

            T temp = get(pos1);

            set(pos1 , get(pos2));
            set(pos2 , temp);

        }

    }

    default void swap(int i, int j) {

        T temp = get(i);

        set(i , get(j));
        set(j , temp);

    }

}