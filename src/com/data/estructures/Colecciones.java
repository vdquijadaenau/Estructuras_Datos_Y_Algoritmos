package com.data.estructures;

import java.util.Collection;
import java.util.Iterator;

/**
 * Methods
 * int size();
 * boolean validIndex(int index);
 * boolean isEmpty();
 * boolean Contains(Object o);
 * T get(int index);
 * T set(int index, T element)
 * int indexOf(Object o);
 * int lastIndexOf(Object o)
 * String toString();
 * Iterator<T> iterator();
 * Object[] toArray();
 * boolean add(T e);
 * boolean remove(Object o);
 * T remove(int index);
 * boolean containsAll(Collection<?> c);
 * boolean addAll(Collection<? extends T> c);
 * boolean removeAll(Collection<?> c);
 * boolean retainAll(Collection<?> c);
 * void clear();
 * String toString();
 * */

public interface Colecciones<T> {

    /**
    *    @return the number of elements in this collection. If this collection contains more than Integer.MAX_VALUE
    *        elements, returns Integer.MAX_VALUE.
    **/
    int size();

    /**
    *   @return  true if this collection contains no elements.
    **/
    boolean isEmpty();

    /**
    * Returns true if this collection contains the specified element. More formally, returns true if and only if this
    * collection contains at least one element e such that (o==null ? e==null : o.equals(e)).
    *@param o - element whose presence in this collection is to be tested
    *@return true if this collection contains the specified element
    *@exception ClassCastException - if the type of the specified element is incompatible with this collection (optional)
    *@exception NullPointerException - if the specified element is null and this collection does not permit null elements (optional)
    **/
    boolean contains(Object o);

    /**
     * Returns the element at the specified position in this list
     * @param index of the element
     * @return element at index position
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
     */
     T get(int index);


    /**
     * Replaces the element at the specified position in this list with the specified element.
     * @param index - index of the element to replace
     * @param element - index of the element to replace
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
     */
    T set(int index, T element);

    /**
     * Evaluate if the index is valid in the collection
     * @param index - index to validate
     * @return true is the index is <= the size of collection or index >= 0
     */
    boolean validIndex(int index);


    /**
     *  Returns an iterator over the elements in this collection. There are no guarantees concerning the order in which
     *  the elements are returned (unless this collection is an instance of some class that provides a guarantee).
     *Specified by:
     *iterator in interface Iterable<E>
     *@return an Iterator over the elements in this collection
     **/
   // Iterator<T> iterator();

    /**
    Returns an array containing all of the elements in this collection. If this collection makes any guarantees as to
    what order its elements are returned by its iterator, this method must return the elements in the same order.
    The returned array will be "safe" in that no references to it are maintained by this collection. (In other words,
    this method must allocate a new array even if this collection is backed by an array).
    The caller is thus free to modify the returned array.
    This method acts as bridge between array-based and collection-based APIs.
    @return an array containing all of the elements in this collection
     **/
    Object[] toArray();

    /**
    Returns an array containing all of the elements in this collection; the runtime type of the returned array is that
    of the specified array. If the collection fits in the specified array, it is returned therein.
    Otherwise, a new array is allocated with the runtime type of the specified array and the size of this collection.

    If this collection fits in the specified array with room to spare (i.e., the array has more elements than this
    collection), the element in the array immediately following the end of the collection is set to null.
    (This is useful in determining the length of this collection only if the caller knows that this collection does not
    contain any null elements.)

    If this collection makes any guarantees as to what order its elements are returned by its iterator,
    this method must return the elements in the same order.
    Like the toArray() method, this method acts as bridge between array-based and collection-based APIs.
    Further, this method allows precise control over the runtime type of the output array, and may,
    under certain circumstances, be used to save allocation costs.

    Suppose x is a collection known to contain only strings.
    The following code can be used to dump the collection into a newly allocated array of String:

    String[] y = x.toArray(new String[0]);
    Note that toArray(new Object[0]) is identical in function to toArray().
    Type Parameters:
    A - the runtime type of the array to contain the collection
    Parameters:
    @param a - the array into which the elements of this collection are to be stored, if it is big enough; otherwise,
    a new array of the same runtime type is allocated for this purpose.
    @return an array containing all of the elements in this collection
    @throws ArrayStoreException
    if the runtime type of the specified array is not a supertype of the runtime type of every element in this collection
    @throws NullPointerException
    if the specified array is null
    **/
    <A> A[] toArray(A[] a);

    /**
    Ensures that this collection contains the specified element (optional operation).
    Returns true if this collection changed as a result of the call. (Returns false if this collection does not
    permit duplicates and already contains the specified element.)
    Collections that support this operation may place limitations on what elements may be added to this collection.
    In particular, some collections will refuse to add null elements, and others will impose restrictions on the type of
    elements that may be added. Collection classes should clearly specify in their documentation any restrictions on
    what elements may be added.

    If a collection refuses to add a particular element for any reason other than that it already contains the element,
    it must throw an exception (rather than returning false). This preserves the invariant that a collection always
    contains the specified element after this call returns.

    Parameters:
    @param e - element whose presence in this collection is to be ensured
    @return true if this collection changed as a result of the call
    @throws UnsupportedOperationException - if the add operation is not supported by this collection
    @throws ClassCastException - if the class of the specified element prevents it from being added to this collection
    @throws NullPointerException - if the specified element is null and this collection does not permit null elements
    @throws IllegalArgumentException - if some property of the element prevents it from being added to this collection
    @throws IllegalStateException - if the element cannot be added at this time due to insertion restrictions
     **/
    boolean add(T e);

    /**
     * Returns the index of the first occurrence of the specified element in this list, or -1 if this list
     * does not contain the element.
     * More formally, returns the lowest index i such that (o==null ? get(i)==null : o.equals(get(i))), or -1 if there is no such index.
     * @param o element to be search in the collection
     * @return index of object o
     */
    int indexOf(Object o);

    /**
     * Returns the index of the first occurrence of the specified element in this list, or -1
     * if this list does not contain the element.
     * More formally, returns the highest index i such that (o==null ? get(i)==null : o.equals(get(i))), or -1 if there is no such index.
     * @param o object in the collection
     * @return int representing the last occurence of the object in the collection
     */
    int lastIndexOf(Object o);


    /**
    Removes a single instance of the specified element from this collection, if it is present (optional operation).
     More formally, removes an element e such that (o==null ? e==null : o.equals(e)), if this collection contains
     one or more such elements. Returns true if this collection contained the specified element (or equivalently,
     if this collection changed as a result of the call).
    @param o - element to be removed from this collection, if present
    @return true if an element was removed as a result of this call
    @throws ClassCastException - if the type of the specified element is incompatible with this collection (optional)
    @throws NullPointerException - if the specified element is null and this collection does not permit null elements (optional)
    @throws UnsupportedOperationException - if the remove operation is not supported by this collection
     */
    boolean remove(Object o);

    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one from their indices)
     * @param index of the element to be removed
     * @return the element that was removed from the list
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size()
     */
    T remove(int index);


    /**
    Returns true if this collection contains all of the elements in the specified collection.
    @param c - collection to be checked for containment in this collection
    @return true if this collection contains all of the elements in the specified collection
    @throws ClassCastException - if the types of one or more elements in the specified collection are incompatible with
    this collection (optional)
    @throws NullPointerException - if the specified collection contains one or more null elements and this collection
    does not permit null elements (optional), or if the specified collection is null.
    */
    boolean containsAll(Collection<?> c);


    /**
    Adds all of the elements in the specified collection to this collection (optional operation).
    The behavior of this operation is undefined if the specified collection is modified while the operation is in progress.
    (This implies that the behavior of this call is undefined if the specified collection is this collection, and this collection is nonempty.)
    Parameters:
    @param c - collection containing elements to be added to this collection
    @return true if this collection changed as a result of the call
    @throws UnsupportedOperationException - if the addAll operation is not supported by this collection
    @throws ClassCastException - if the class of an element of the specified collection prevents it from being added to this collection
    @throws NullPointerException - if the specified collection contains a null element and this collection does not permit null elements, or if the specified collection is null
    @throws IllegalArgumentException - if some property of an element of the specified collection prevents it from being added to this collection
    @throws IllegalStateException - if not all the elements can be added at this time due to insertion restrictions
    */
    boolean addAll(Collection<? extends T> c);

    /**   Removes all of this collection's elements that are also contained in the specified collection (optional operation).
    *    After this call returns, this collection will contain no elements in common with the specified collection.
    *    @param     c collection containing elements to be removed from this collection
    *    @return    true if this collection changed as a result of the call
    *    @exception UnsupportedOperationException - if the removeAll method is not supported by this collection
    *    @exception  ClassCastException - if the types of one or more elements in this collection are incompatible with the specified collection (optional)
    *    @exception  NullPointerException - if this collection contains one or more null elements and the specified collection does not support null elements
    *   (optional), or if the specified collection is null
    **/
    boolean removeAll(Collection<?> c);


    /**
    Retains only the elements in this collection that are contained in the specified collection (optional operation).
    In other words, removes from this collection all of its elements that are not contained in the specified collection.
    @param c - collection containing elements to be retained in this collection
    @return true if this collection changed as a result of the call
    @throws UnsupportedOperationException - if the retainAll operation is not supported by this collection
    @throws ClassCastException - if the types of one or more elements in this collection are incompatible with the specified collection (optional)
    @throws NullPointerException - if this collection contains one or more null elements and the specified collection
    does not permit null elements (optional), or if the specified collection is null
    See Also:
    remove(Object), contains(Object)
     */
    boolean retainAll(Collection<?> c);


    /**
    *Removes all of the elements from this collection (optional operation). The collection will be empty after this method returns.
    *@throws UnsupportedOperationException - if the clear operation is not supported by this collection
    */
    void clear();
}
