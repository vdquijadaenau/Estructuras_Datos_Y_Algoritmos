package com.data.estructures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.rmi.UnexpectedException;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkListTest {

    SinglyLinkList<Integer> list1 = new SinglyLinkList<>();

    @Test
    void size() {
        assertEquals(list1.size(),0);
        list1.add(2);
        assertEquals(list1.size(),1);
    }

    @Test
    void isEmpty() {
    }

    @Test
    void contains() {
    }

    @Test
    void get() {
    }

    @Test
    void set() {
    }

    @Test
    void validIndex() {
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
        added = addList.add(2);
        assertEquals(true, added);
        assertEquals(1, addList.size());
        boolean added2 = addList.add(5);
        assertEquals(true,added2);
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
    void testToString() {
    }
}