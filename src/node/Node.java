package node;

import person.myPerson;

public class Node {
    private myPerson value;

    private Node next;


    public Node(myPerson value) {

        this.value = value;

    }

    public myPerson getValue() {

        return value;

    }


    public void setValue(myPerson value) {

        this.value = value;

    }


    public Node getNext() {

        return next;

    }


    public void setNext(Node next) {

        this.next = next;

    }

}
