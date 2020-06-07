package com.data.estructures;

public class SinglyNode<T> {

    T value;
    private SinglyNode<T> next;

    SinglyNode(T value){
        this.value=value;
    }

    T getValue(){
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public SinglyNode<T> getNext() {
        return next;
    }

    public void setNext(SinglyNode<T> next) {
        this.next = next;
    }


}
