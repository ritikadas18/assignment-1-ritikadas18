package person;

import java.util.LinkedList;

public class myPerson {
    private String firstName;

    private String lastName;

    private LinkedList<String> contacts;

    private String email;


    public Person(String firstName, String lastName, LinkedList<String> contacts, String email) {

        this.firstName = firstName;

        this.lastName = lastName;

        this.contacts = contacts;

        this.email = email;

    }


}