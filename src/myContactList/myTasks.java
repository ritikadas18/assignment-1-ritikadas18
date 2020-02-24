package myContactList;

import myLinkedListOperations.myLinkedList;
import person.myPerson;

import java.util.LinkedList;
import java.util.Scanner;

public class myTasks {
    Scanner sc = new Scanner(System.in);
    LinkedList<String> linkedList = new LinkedList<>();

    public void addContact(myLinkedList linkedList) {
        System.out.println("You have chosen to add a new contact: \n" +
                "Please enter the name of the Person");
        System.out.println("First Name : ");
        String firstName = sc.nextLine().trim();
        while (true) {
            if (firstName.matches("[A-Za-z]")) {
                break;
            } else {
                System.out.println("Please enter correct name");
            }
            firstName = sc.nextLine().trim();
        }
        System.out.println("Last Name : ");
        String lastName = sc.nextLine().trim();
        while (true) {
            if (lastName.matches("[A-Za-z]+")) {
                break;
            } else {
                System.out.println("Please enter correct name");
            }
            lastName = sc.nextLine().trim();

        }
        System.out.println("Contact Number : ");
        while (true) {
            String contact = sc.nextLine().trim();
            if (contact.matches("[0-9]{10}")) {
                linkedList.add(contact);
                break;
            }
        }
        while (true) {
            System.out.println("Would you like to add another contact number? (y/n): ");
            char choice = sc.next().charAt(0);
            if (choice == 'y') {
                System.out.println("Contact Number : ");
                String contactNumber1 = sc.nextLine().trim();
                while (true) {
                    if (contactNumber1.matches("[0-9]{10}")) {
                        linkedList.add(contactNumber1);
                        break;
                    } else {
                        System.out.println("add correct number");
                    }
                }
            } else {
                break;
            }
        }
        System.out.println("Enter your email address");
        sc.nextLine();
        while (true) {
            String temp = sc.nextLine();
            if (temp.matches("^[a-z]+[0-9]*@[a-z]+\\.[a-z]+$")) {
                myLinkedList.addLast(new myPerson(firstName, lastName, linkedList, temp));
                break;
            } else {
                System.out.println("Invalid email address ! Enter again");
            }
        }
    }

}
