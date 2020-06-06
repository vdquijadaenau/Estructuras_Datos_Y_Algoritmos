package com.data.estructures;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public interface Colecciones<T> {

    /**
    *    @return the number of elements in this collection. If this collection contains more than Integer.MAX_VALUE
     *    elements, returns Integer.MAX_VALUE.
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
     *  Returns an iterator over the elements in this collection. There are no guarantees concerning the order in which
     *  the elements are returned (unless this collection is an instance of some class that provides a guarantee).
     *Specified by:
     *iterator in interface Iterable<E>
     *@return an Iterator over the elements in this collection
     **/
    Iterator<T> iterador();

    /**
    Returns an array containing all of the elements in this collection. If this collection makes any guarantees as to what order its elements are returned by its iterator, this method must return the elements in the same order.
    The returned array will be "safe" in that no references to it are maintained by this collection. (In other words, this method must allocate a new array even if this collection is backed by an array). The caller is thus free to modify the returned array.

    This method acts as bridge between array-based and collection-based APIs.
    Returns:
    an array containing all of the elements in this collection
     **/
    Object[] toArray();


    /**
    Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array. If the collection fits in the specified array, it is returned therein. Otherwise, a new array is allocated with the runtime type of the specified array and the size of this collection.

            If this collection fits in the specified array with room to spare (i.e., the array has more elements than this collection), the element in the array immediately following the end of the collection is set to null. (This is useful in determining the length of this collection only if the caller knows that this collection does not contain any null elements.)

    If this collection makes any guarantees as to what order its elements are returned by its iterator, this method must return the elements in the same order.

    Like the toArray() method, this method acts as bridge between array-based and collection-based APIs. Further, this method allows precise control over the runtime type of the output array, and may, under certain circumstances, be used to save allocation costs.

    Suppose x is a collection known to contain only strings. The following code can be used to dump the collection into a newly allocated array of String:

    String[] y = x.toArray(new String[0]);
    Note that toArray(new Object[0]) is identical in function to toArray().
    Type Parameters:
    T - the runtime type of the array to contain the collection
    Parameters:
    a - the array into which the elements of this collection are to be stored, if it is big enough; otherwise, a new array of the same runtime type is allocated for this purpose.
            Returns:
    an array containing all of the elements in this collection
    Throws:
    ArrayStoreException - if the runtime type of the specified array is not a supertype of the runtime type of every element in this collection
    NullPointerException - if the specified array is null
    **/
    <T> T[] toArray(T[] a);

    /**
    Ensures that this collection contains the specified element (optional operation). Returns true if this collection changed as a result of the call. (Returns false if this collection does not permit duplicates and already contains the specified element.)
    Collections that support this operation may place limitations on what elements may be added to this collection. In particular, some collections will refuse to add null elements, and others will impose restrictions on the type of elements that may be added. Collection classes should clearly specify in their documentation any restrictions on what elements may be added.

    If a collection refuses to add a particular element for any reason other than that it already contains the element, it must throw an exception (rather than returning false). This preserves the invariant that a collection always contains the specified element after this call returns.

    Parameters:
    e - element whose presence in this collection is to be ensured
    Returns:
            true if this collection changed as a result of the call
    Throws:
    UnsupportedOperationException - if the add operation is not supported by this collection
    ClassCastException - if the class of the specified element prevents it from being added to this collection
    NullPointerException - if the specified element is null and this collection does not permit null elements
    IllegalArgumentException - if some property of the element prevents it from being added to this collection
    IllegalStateException - if the element cannot be added at this time due to insertion restrictions
     **/
    boolean add(E e);


    /**
     *
    Removes a single instance of the specified element from this collection, if it is present (optional operation). More formally, removes an element e such that (o==null ? e==null : o.equals(e)), if this collection contains one or more such elements. Returns true if this collection contained the specified element (or equivalently, if this collection changed as a result of the call).
    Parameters:
    o - element to be removed from this collection, if present
    Returns:
            true if an element was removed as a result of this call
    Throws:
    ClassCastException - if the type of the specified element is incompatible with this collection (optional)
    NullPointerException - if the specified element is null and this collection does not permit null elements (optional)
    UnsupportedOperationException - if the remove operation is not supported by this collection
     */
    boolean remove(Object o);


/*
    Returns true if this collection contains all of the elements in the specified collection.
    Parameters:
        c - collection to be checked for containment in this collection
    Returns:
            true if this collection contains all of the elements in the specified collection
    Throws:
    ClassCastException - if the types of one or more elements in the specified collection are incompatible with this collection (optional)
    NullPointerException - if the specified collection contains one or more null elements and this collection does not permit null elements (optional), or if the specified collection is null.
*/
    boolean containsAll(Collection<?> c);


/*    Adds all of the elements in the specified collection to this collection (optional operation). The behavior of this operation is undefined if the specified collection is modified while the operation is in progress. (This implies that the behavior of this call is undefined if the specified collection is this collection, and this collection is nonempty.)
    Parameters:
    c - collection containing elements to be added to this collection
    Returns:
            true if this collection changed as a result of the call
    Throws:
    UnsupportedOperationException - if the addAll operation is not supported by this collection
    ClassCastException - if the class of an element of the specified collection prevents it from being added to this collection
    NullPointerException - if the specified collection contains a null element and this collection does not permit null elements, or if the specified collection is null
    IllegalArgumentException - if some property of an element of the specified collection prevents it from being added to this collection
    IllegalStateException - if not all the elements can be added at this time due to insertion restrictions
 */
    boolean addAll(Collection<? extends T> c);

    /**   Removes all of this collection's elements that are also contained in the specified collection (optional operation). After this call returns, this collection will contain no elements in common with the specified collection.
    *    @param     c collection containing elements to be removed from this collection
    *    @return    true if this collection changed as a result of the call
    *    @exception UnsupportedOperationException - if the removeAll method is not supported by this collection
    *    @exception  ClassCastException - if the types of one or more elements in this collection are incompatible with the specified collection (optional)
    *    @exception  NullPointerException - if this collection contains one or more null elements and the specified collection does not support null elements
    *   (optional), or if the specified collection is null
    **/
    boolean removeAll(Collection<?> c);

    /**
    Removes all of the elements of this collection that satisfy the given predicate. Errors or runtime exceptions thrown during iteration or by the predicate are relayed to the caller.
    Implementation Requirements:
    The default implementation traverses all elements of the collection using its iterator(). Each matching element is removed using Iterator.remove(). If the collection's iterator does not support removal then an UnsupportedOperationException will be thrown on the first matching element.
    @param      filter - a predicate which returns true for elements to be removed
    @return     true if any elements were removed
    @exception  NullPointerException - if the specified filter is null
    @exception  UnsupportedOperationException - if elements cannot be removed from this collection. Implementations may throw this exception if a matching element cannot be removed or if, in general, removal is not supported.
    **/
    default boolean removeIf(Predicate<? super T> filter);


    /*
    Retains only the elements in this collection that are contained in the specified collection (optional operation).
    In other words, removes from this collection all of its elements that are not contained in the specified collection.
    Parameters:
        c - collection containing elements to be retained in this collection
    Returns:
            true if this collection changed as a result of the call
    Throws:
    UnsupportedOperationException - if the retainAll operation is not supported by this collection
    ClassCastException - if the types of one or more elements in this collection are incompatible with the specified collection (optional)
    NullPointerException - if this collection contains one or more null elements and the specified collection does not permit null elements (optional), or if the specified collection is null
    See Also:
    remove(Object), contains(Object)
     */
    boolean retainAll(Collection<?> c);


    /*
    clear()
    Removes all of the elements from this collection (optional operation). The collection will be empty after this method returns.
    Throws:
    UnsupportedOperationException - if the clear operation is not supported by this collection
     */
    void clear();

    /*
    equals()
    Compares the specified object with this collection for equality.
    While the Collection interface adds no stipulations to the general contract for the Object.equals, programmers who implement the Collection
    interface "directly" (in other words, create a class that is a Collection but is not a Set or a List) must exercise care if they choose to
    override the Object.equals. It is not necessary to do so, and the simplest course of action is to rely on Object's implementation,
    but the implementor may wish to implement a "value comparison" in place of the default "reference comparison."
    (The List and Set interfaces mandate such value comparisons.)
    The general contract for the Object.equals method states that equals must be symmetric
    (in other words, a.equals(b) if and only if b.equals(a)). The contracts for List.equals and Set.equals state that
    lists are only equal to other lists, and sets to other sets. Thus, a custom equals method for a collection class
    that implements neither the List nor Set interface must return false when this collection is compared to any list or set.
    (By the same logic, it is not possible to write a class that correctly implements both the Set and List interfaces.)

    Overrides:
    equals in class Object
    Parameters:
        o - object to be compared for equality with this collection
    Returns:
            true if the specified object is equal to this collection
    See Also:
            Object.equals(Object), Set.equals(Object), List.equals(Object)
*/
    boolean equals(Object o);



/*  hashCode()
    Returns the hash code value for this collection.
    While the Collection interface adds no stipulations to the general contract for the Object.hashCode method,
    programmers should take note that any class that overrides the Object.equals method must also override
    the Object.hashCode method in order to satisfy the general contract for the Object.hashCode method.
    In particular, c1.equals(c2) implies that c1.hashCode()==c2.hashCode().
    Overrides:
        hashCode in class Object
    Returns:
        the hash code value for this collection
 */
    int hashCode();
}
