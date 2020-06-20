package com.data.estructures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.rmi.UnexpectedException;
import java.sql.SQLOutput;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkListTest {

    SinglyLinkList<Integer> list1 = new SinglyLinkList<>();

    @Test
    @DisplayName("Test size() return the correct size of the list")
    void size() {
        assertEquals(list1.size(),0);
        list1.add(2);
        assertEquals(list1.size(),1);
    }

    @Test
    @DisplayName("Test that the list is empty")
    void isEmpty() {
        SinglyLinkList<Integer> emptyList = new SinglyLinkList<>();
        assertTrue(emptyList.isEmpty());
        emptyList.add(2);
        assertTrue(!emptyList.isEmpty());
    }

    @Test
    void contains() {
    }

    @Test
    void get() {
    }

    @Test
    @DisplayName("Test element and specified index can be replace by another value")
    void set() {
        SinglyLinkList<Integer> listSetValue= new SinglyLinkList<>();
        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () ->{
            listSetValue.set(2,3);
        });
        assertTrue(listSetValue.add(3));
        assertEquals(3,listSetValue.set(0,3));
    }

    @Test
    @DisplayName("Test the list received a valid index")
    void validIndex() {
        SinglyLinkList<Integer> list2 = new SinglyLinkList<>();
        assertTrue(!list2.validIndex(5));
        list2.add(8);
        list2.add(9);
        assertEquals(2, list2.size());
        assertTrue(list2.validIndex(2));
        assertFalse(list2.validIndex(4));
        assertFalse(list2.validIndex(-1));
        assertTrue(list2.validIndex(0));
    }

    @Test
    void iterator() {
    }

    @Test
    void toArray() {
    }

    @Test
    void testToArray() {
    }

    @Test
    @DisplayName("Test Assert NullPointerException when adding a null Element")
    void addNullElementToList(){
        final SinglyLinkList<Integer> listNull = new SinglyLinkList<>();
        NullPointerException exception = assertThrows(NullPointerException.class, ()->{
           listNull.add(null);
        });
        assertEquals("Collection does not permit null elements",exception.getMessage());
    }

    @Test
    @DisplayName("Test the inclusion of elements in the list")
    void add() {
        boolean added = false;
        SinglyLinkList<Integer> addList  =new SinglyLinkList<>();
        assertEquals(true, addList.add(2));
        assertEquals(1, addList.size());
        assertEquals(true,addList.add(5));

        assertEquals(2,addList.size());
    }

    @Test
    void indexOf() {
    }

    @Test
    void lastIndexOf() {
    }

    @Test
    void remove() {
    }

    @Test
    void testRemove() {
    }

    @Test
    void containsAll() {
    }

    @Test
    void addAll() {
    }

    @Test
    void removeAll() {
    }

    @Test
    void retainAll() {
    }

    @Test
    void clear() {
    }

    @Test
    @DisplayName("Testing correct string representation")
    void testToString() {
        SinglyLinkList<Integer> Lista = new SinglyLinkList<>();
        IntStream.range(1,6)
                .forEach(Lista::add);
        System.out.println(Lista.toString());
        assertEquals("s", "s");
    }
}