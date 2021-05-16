package com;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    static Scanner sc = new Scanner(System.in);
    static List<Contact> list = new LinkedList<Contact>();

    //Created method for adding contact
    public static void addContact()
    {
        System.out.println("Enter your firstName : ");
        String firstName = sc.nextLine();
        System.out.println("Enter your lastName : ");
        String lastName = sc.nextLine();
        System.out.println("Enter your address : ");
        String address = sc.nextLine();
        System.out.println("Enter your city : ");
        String city = sc.nextLine();
        System.out.println("Enter your state : ");
        String state = sc.nextLine();
        System.out.println("Enter your zipCode : ");
        String zip = sc.nextLine();
        System.out.println("Enter your phoneNo : ");
        long phoneNo = sc.nextLong();
        System.out.println("Enter your emailId : ");
        String email = sc.nextLine();
        Contact obj = new Contact(firstName, lastName, address, city, state, zip, phoneNo, email);
        list.add(obj);
    }


    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        //Displaying the welcome message
        System.out.println("Welcome to address book");
        //Adding new contact
        System.out.println("Enter details of new contact");

        //Creating contact and adding new contact details to the list
        int count = 1;
        while (count == 1) {
            addContact();
            count--;
        }

        System.out.println(list); //printing list
    }
}