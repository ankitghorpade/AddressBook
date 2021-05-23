  
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
         for (int i = 0; i < list.size(); i++)
         {
             if (list.get(i).getFirstName().equalsIgnoreCase(firstName))
             {
                 System.out.println("Name already exists. Try another name");
                 addPersons();
                 break;
             }
         }
         
        System.out.println("Enter your firstName : ");
        String FirstName = sc.nextLine();
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
        Contact obj = new Contact(FirstName, lastName, address, city, state, zip, phoneNo, email);
        list.add(obj);
    }

    //Created method for editing contact details
    public static void editContact() {
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                list.remove(i);
                addContact();
            } else {
                System.out.println("No data found in Address Book");
            }
        }
    }

        //Creating deleteContact() for deleting contact details using first name
        public static void deleteContact() {
            System.out.println("Enter first name : ");
            String firstName = sc.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                    list.remove(i);
                } else {
                    System.out.println("No data found");
                }
            }
    }

    //Adding Multiple persons i.e contacts in address book
    public static void addPersons() {
        System.out.println("Enter number of persons added to be in address book : ");
        int noOfPersons = sc.nextInt();
        int count  = 1;
        while (count <= noOfPersons) {
            addContact();
            count++;
        }
    }

  //Called method searchByCity for searching contact details by city name
    public static void searchByCity() {
        System.out.println("Enter City Name : ");
        String city = sc.nextLine();
        for (Contact list : list) {
            if(((Contact) list).getCity().equals(city))
                System.out.println(list);
        }
    }

    //calling method to view contact details by using city name
    public void viewByCity() {
        System.out.println("Enter City Name : ");
        String city = sc.nextLine();
        for (Contact list : list) {
            if(list.getCity().equals(city))
                System.out.println(list);
        }
    }
    /*Count number of contact persons based on city*/
    public void countBasedOnCity()
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter city name : ");
        String city = sc.nextLine();
        sc.close();
        for (Contact list : list)
        {
            if (list.getCity().equals(city)) {
                count++;
                System.out.println(list);

            }
        }
        System.out.println("TotalNo : " + count);
    }
    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        //Displaying the welcome message
        System.out.println("WELCOME TO ADDRESS BOOK PROBLEM");
        //adding multiple persons
        addPersons();
        //Result will show count by city name
        addressBook.countBasedOnCity();

    }
}