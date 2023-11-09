package cpsc2150.listDec;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @invariant myList is an instance of a List<T>
 *
 * @correspondence self = myList
 */
public class ShuffleList<T> implements IShuffleList<T> {

    // ===========================================================
    // Member Fields
    // ===========================================================

    private List<T> myList;

    // ===========================================================
    // Constructors
    // ===========================================================

    /**
     * <p>
     * This creates a list implementation that includes the shuffle and swap functionality.
     * </p>
     *
     * @param l
     *            An existing implementation of {@link List}.
     * 
     * @pre l != null
     * 
     * @post myList = l
     */
    public ShuffleList(List<T> l) {
        myList = l;
    }

    // ===========================================================
    // Public Methods
    // ===========================================================

    /**
     * adds an element to myList
     *
     * @return True IFF element e is added correctly
     *
     * @param e element whose presence in this collection is to be ensured
     *
     * @post
     *  [this.add calls List.add(T)] AND
     *  this.add(T) = List.add(T) AND
     *  mylist = [myList after adding an element to the list]
     */
    @Override
    public boolean add(T e) {
        // complete this method
        return myList.add(e);
    }

    /**
     * this  function gets the element at an index
     *
     * @param i index of the element to return
     *
     * @return the element at index i
     *
     * @post
     * this.get(int) calls List.get(int)] AND
     * this.get(int) = List.get(int) AND
     * myList = #myList
     */
    @Override
    public T get(int i) {
        // complete this method
       return myList.get(i);
    }

    /**
     * adds an element an a specific index and pushs other elements back
     *
     * @param index index at which the specified element is to be inserted
     * @param e element to be inserted
     *
     * @post
     * [this.add(int , T) calls List.add(int , T)] AND
     * this.add(int , T) = List.add(int , T) AND
     * myList = [myList with an added element]
     */
    @Override
    public void add(int index, T e) {
        // complete this method
        myList.add(index, e);
    }

    /**
     * gets the size of myList
     *
     * @return int representing the size of myList
     *
     * @post
     * this.size() = List.size() AND
     * myList = #myList
     */
    @Override
    public int size() {
        // complete this method
        return myList.size();
    }

    /**
     * empties myList
     *
     * @post
     * [this.clear() calls List.clear()] AND
     * myList = [an empty List]
     */
    @Override
    public void clear() {
        // complete this method
       myList.clear();
    }

    /**
     * reassigns the element at an index with a different value
     *
     * @param i index of the element to replace
     * @param x element to be stored at the specified position
     *
     * @return the element that was located at index i before replaced
     *
     * @post
     * this.set(int , T) = List.set(int , T) AND
     * myList = [myList with an updated element at index i]
     */
    @Override
    public T set(int i, T x) {
        // complete this method
        return myList.set(i, x);
    }

    @Override
    public List<T> subList(int i, int j) {
        return myList.subList(i, j);
    }

    @Override
    public ListIterator<T> listIterator() {
        return myList.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int i) {
        return myList.listIterator(i);
    }

    @Override
    public int lastIndexOf(Object o) {
        return myList.lastIndexOf(o);
    }

    @Override
    public int indexOf(Object o) {
        return myList.indexOf(o);
    }

    @Override
    public int hashCode() {
        return myList.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return myList.equals(o);
    }

    @Override
    public String toString() {
        return myList.toString();
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return myList.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return myList.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return myList.retainAll(c);
    }

    @Override
    public boolean addAll(int i, Collection<? extends T> c) {
        return myList.addAll(i, c);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return myList.containsAll(c);
    }

    @Override
    public T remove(int index) {
        return myList.remove(index);
    }

    @Override
    public boolean remove(Object o) {
        return myList.remove(o);
    }

    @Override
    public boolean isEmpty() {
        return myList.isEmpty();
    }

    @Override
    public boolean contains(Object obj) {
        return myList.contains(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return myList.iterator();
    }

    @Override
    public Object[] toArray() {
        return myList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return myList.toArray(ts);
    }
}