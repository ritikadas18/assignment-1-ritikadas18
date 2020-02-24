package myContactList;

import myLinkedListOperations.myLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myLinkedList linkedList1 = new myLinkedList();
        myTasks tasks1 = new myTasks();
        System.out.println("Welcome to Ritika's contact list application");
        System.out.println("press 1 to add a new contact");
        System.out.println("press 2 to view all contacts");
        System.out.println("press 3 to search for a contact");
        System.out.println("Press 4 to delete a contact");
        System.out.println("Press 5 to exit program ");
        int choice = Integer.parseInt(sc.nextLine());
        if (choice == 1) {
            tasks1.addContact(myLinkedList);
            choice = Integer.parseInt(sc.nextLine());
        }
        if (choice == 2) {
            myTasks.viewContact(myLinkedList);
            choice = Integer.parseInt(sc.nextLine());

        }
        if (choice == 3) {
            myTasks.searchContact(myLinkedList);
            choice = Integer.parseInt(sc.nextLine());
        }
        if (choice == 4) {
            myTasks.deleteContact(myLinkedList);
            choice = Integer.parseInt(sc.nextLine());
        }
        if (choice == 5) {
            System.out.println("Application terminate");
        }
    }
}
