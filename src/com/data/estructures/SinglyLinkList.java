package com.data.estructures;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class SinglyLinkList<T> implements Colecciones<T>{
    int size = 0;
    SinglyNode<T> head = null;
    SinglyNode<T> tail = null;

    /**
     * @return the number of elements in this collection. If this collection contains more than Integer.MAX_VALUE
     * elements, returns Integer.MAX_VALUE.
     **/
    @Override
    public int size() {
        return 0;
    }

    /**
     * @return true if this collection contains no elements.
     **/
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Returns true if this collection contains the specified element. More formally, returns true if and only if this
     * collection contains at least one element e such that (o==null ? e==null : o.equals(e)).
     *
     * @param o - element whose presence in this collection is to be tested
     * @return true if this collection contains the specified element
     * @throws ClassCastException   - if the type of the specified element is incompatible with this collection (optional)
     * @throws NullPointerException - if the specified element is null and this collection does not permit null elements (optional)
     */
    @Override
    public boolean contains(Object o) {
        return false;
    }

    /**
     * Returns the element at the specified position in this list
     *
     * @param index
     * @return element at index position
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
     */
    @Override
    public T get(int index) {
        return null;
    }

    /**
     * Replaces the element at the specified position in this list with the specified element.
     *
     * @param index   - index of the element to replace
     * @param element - index of the element to replace
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
     */
    @Override
    public T set(int index, T element) {
        return null;
    }

    /**
     * Evaluate if the index is valid in the collection
     *
     * @param index
     * @return true is the index is <= the size of collection
     */
    @Override
    public boolean validIndex(int index) {
        return false;
    }

    /**
     * Returns an iterator over the elements in this collection. There are no guarantees concerning the order in which
     * the elements are returned (unless this collection is an instance of some class that provides a guarantee).
     * Specified by:
     * iterator in interface Iterable<E>
     *
     * @return an Iterator over the elements in this collection
     **/
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    /**
     * Returns an array containing all of the elements in this collection. If this collection makes any guarantees as to
     * what order its elements are returned by its iterator, this method must return the elements in the same order.
     * The returned array will be "safe" in that no references to it are maintained by this collection. (In other words,
     * this method must allocate a new array even if this collection is backed by an array).
     * The caller is thus free to modify the returned array.
     * This method acts as bridge between array-based and collection-based APIs.
     *
     * @return: an array containing all of the elements in this collection
     **/
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    /**
     * Returns an array containing all of the elements in this collection; the runtime type of the returned array is that
     * of the specified array. If the collection fits in the specified array, it is returned therein.
     * Otherwise, a new array is allocated with the runtime type of the specified array and the size of this collection.
     * <p>
     * If this collection fits in the specified array with room to spare (i.e., the array has more elements than this
     * collection), the element in the array immediately following the end of the collection is set to null.
     * (This is useful in determining the length of this collection only if the caller knows that this collection does not
     * contain any null elements.)
     * <p>
     * If this collection makes any guarantees as to what order its elements are returned by its iterator,
     * this method must return the elements in the same order.
     * Like the toArray() method, this method acts as bridge between array-based and collection-based APIs.
     * Further, this method allows precise control over the runtime type of the output array, and may,
     * under certain circumstances, be used to save allocation costs.
     * <p>
     * Suppose x is a collection known to contain only strings.
     * The following code can be used to dump the collection into a newly allocated array of String:
     * <p>
     * String[] y = x.toArray(new String[0]);
     * Note that toArray(new Object[0]) is identical in function to toArray().
     * Type Parameters:
     * A - the runtime type of the array to contain the collection
     * Parameters:
     *
     * @param a - the array into which the elements of this collection are to be stored, if it is big enough; otherwise,
     *          a new array of the same runtime type is allocated for this purpose.
     * @throws ArrayStoreException  if the runtime type of the specified array is not a supertype of the runtime type of every element in this collection
     * @throws NullPointerException if the specified array is null
     * @returns an array containing all of the elements in this collection
     */
    @Override
    public <A> A[] toArray(A[] a) {
        return null;
    }

    /**
     * Ensures that this collection contains the specified element (optional operation).
     * Returns true if this collection changed as a result of the call. (Returns false if this collection does not
     * permit duplicates and already contains the specified element.)
     * Collections that support this operation may place limitations on what elements may be added to this collection.
     * In particular, some collections will refuse to add null elements, and others will impose restrictions on the type of
     * elements that may be added. Collection classes should clearly specify in their documentation any restrictions on
     * what elements may be added.
     * <p>
     * If a collection refuses to add a particular element for any reason other than that it already contains the element,
     * it must throw an exception (rather than returning false). This preserves the invariant that a collection always
     * contains the specified element after this call returns.
     * <p>
     * Parameters:
     *
     * @param e - element whose presence in this collection is to be ensured
     * @return true if this collection changed as a result of the call
     * @throws UnsupportedOperationException - if the add operation is not supported by this collection
     * @throws ClassCastException            - if the class of the specified element prevents it from being added to this collection
     * @throws NullPointerException          - if the specified element is null and this collection does not permit null elements
     * @throws IllegalArgumentException      - if some property of the element prevents it from being added to this collection
     * @throws IllegalStateException         - if the element cannot be added at this time due to insertion restrictions
     */
    @Override
    public boolean add(T e) {
        return false;
    }

    /**
     * Returns the index of the first occurrence of the specified element in this list, or -1 if this list
     * does not contain the element.
     * More formally, returns the lowest index i such that (o==null ? get(i)==null : o.equals(get(i))), or -1 if there is no such index.
     *
     * @param o
     * @return index of object o
     */
    @Override
    public int indexOf(Object o) {
        return 0;
    }

    /**
     * Returns the index of the first occurrence of the specified element in this list, or -1
     * if this list does not contain the element.
     * More formally, returns the highest index i such that (o==null ? get(i)==null : o.equals(get(i))), or -1 if there is no such index.
     *
     * @param o
     * @return
     */
    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    /**
     * Removes a single instance of the specified element from this collection, if it is present (optional operation).
     * More formally, removes an element e such that (o==null ? e==null : o.equals(e)), if this collection contains
     * one or more such elements. Returns true if this collection contained the specified element (or equivalently,
     * if this collection changed as a result of the call).
     *
     * @param o - element to be removed from this collection, if present
     * @return true if an element was removed as a result of this call
     * @throws ClassCastException            - if the type of the specified element is incompatible with this collection (optional)
     * @throws NullPointerException          - if the specified element is null and this collection does not permit null elements (optional)
     * @throws UnsupportedOperationException - if the remove operation is not supported by this collection
     */
    @Override
    public boolean remove(Object o) {
        return false;
    }

    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one from their indices)
     *
     * @param index
     * @return the element that was removed from the list
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size()
     */
    @Override
    public T remove(int index) {
        return null;
    }

    /**
     * Returns true if this collection contains all of the elements in the specified collection.
     *
     * @param c - collection to be checked for containment in this collection
     * @return true if this collection contains all of the elements in the specified collection
     * @throws ClassCastException   - if the types of one or more elements in the specified collection are incompatible with
     *                              this collection (optional)
     * @throws NullPointerException - if the specified collection contains one or more null elements and this collection
     *                              does not permit null elements (optional), or if the specified collection is null.
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    /**
     * Adds all of the elements in the specified collection to this collection (optional operation).
     * The behavior of this operation is undefined if the specified collection is modified while the operation is in progress.
     * (This implies that the behavior of this call is undefined if the specified collection is this collection, and this collection is nonempty.)
     * Parameters:
     *
     * @param c - collection containing elements to be added to this collection
     * @return true if this collection changed as a result of the call
     * @throws UnsupportedOperationException - if the addAll operation is not supported by this collection
     * @throws ClassCastException            - if the class of an element of the specified collection prevents it from being added to this collection
     * @throws NullPointerException          - if the specified collection contains a null element and this collection does not permit null elements, or if the specified collection is null
     * @throws IllegalArgumentException      - if some property of an element of the specified collection prevents it from being added to this collection
     * @throws IllegalStateException         - if not all the elements can be added at this time due to insertion restrictions
     */
    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    /**
     * Removes all of this collection's elements that are also contained in the specified collection (optional operation).
     * After this call returns, this collection will contain no elements in common with the specified collection.
     *
     * @param c collection containing elements to be removed from this collection
     * @return true if this collection changed as a result of the call
     * @throws UnsupportedOperationException - if the removeAll method is not supported by this collection
     * @throws ClassCastException            - if the types of one or more elements in this collection are incompatible with the specified collection (optional)
     * @throws NullPointerException          - if this collection contains one or more null elements and the specified collection does not support null elements
     *                                       (optional), or if the specified collection is null
     **/
    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    /**
     * Retains only the elements in this collection that are contained in the specified collection (optional operation).
     * In other words, removes from this collection all of its elements that are not contained in the specified collection.
     *
     * @param c - collection containing elements to be retained in this collection
     * @throws UnsupportedOperationException - if the retainAll operation is not supported by this collection
     * @throws ClassCastException            - if the types of one or more elements in this collection are incompatible with the specified collection (optional)
     * @throws NullPointerException          - if this collection contains one or more null elements and the specified collection
     *                                       does not permit null elements (optional), or if the specified collection is null
     *                                       See Also:
     *                                       remove(Object), contains(Object)
     * @eturn true if this collection changed as a result of the call
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    /**
     * Removes all of the elements from this collection (optional operation). The collection will be empty after this method returns.
     *
     * @throws UnsupportedOperationException - if the clear operation is not supported by this collection
     */
    @Override
    public void clear() {

    }


    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
