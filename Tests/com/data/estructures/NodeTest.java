package com.data.estructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    int value=3;
    SinglyNode<Integer> nodo = new SinglyNode<>(value);

    @Test
    void getValue() {
        assertEquals(nodo.getValue(),value);
    }

    @Test
    void getNull() {
        assertEquals(nodo.getNext(),null);
    }

}