package com.kbtomlinson;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    // The MobilePhone CAN
    // Store, Modify, Remove, and Query Contact Names

    // The Mobile Phone has a menu
    // Quit
    // Print Contacts
    // Add New Contact
    // Update Existing Contact
    // Remove Contact
    // Find Contact

    // Check to see if contact already exists by Name
    public Scanner s = new Scanner(System.in);

    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    private ArrayList<String> phoneMenu = new ArrayList<String>();


    public MobilePhone() {
        this.phoneMenu = phoneMenu;
        this.phoneMenu.add("List Menu Options");
        this.phoneMenu.add("List Contacts");
        this.phoneMenu.add("Add New Contact");
        this.phoneMenu.add("Update Existing Contact");
        this.phoneMenu.add("Remove Exisiting Contact");
        this.phoneMenu.add("Find Existing Contact");
        this.phoneMenu.add("Quit");
    }

    // startPhone
    public void startPhone(){
        listMenu();
        watchMenu();
    }

    // listMenu
    private void listMenu(){
        for(int i = 0; i < phoneMenu.size(); i++){
            System.out.println((i) + ". " + phoneMenu.get(i));
        }
    }

    // watchMenu
    private void watchMenu(){
        boolean quit = false;
        int choice = 0;
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();

            switch(choice){
                case 0:
                    listMenu();
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateExistingContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    // printContacts
    private void printContacts(){
        if(contacts.size() == 0){
            System.out.println("You do not currently have any contacts.");
        } else if(contacts.size() > 0){
            System.out.println("You have " + contacts.size() + " contacts.");
            for(int i = 0; i < contacts.size(); i++){
                System.out.println("Name: " + contacts.get(i).getName());
                System.out.println("Phone Number: " + contacts.get(i).getPhoneNumber());
            }
        }
        listMenu();
    }

    // addNewContact
    private void addNewContact(){
        System.out.print("Please Enter New Contact's Name: ");
        String name = s.nextLine();
        System.out.print("Please Enter " + name + "'s Phone Number: ");
        String phoneNumber = s.nextLine();
        Contact newContact = new Contact(name, phoneNumber);
        contacts.add(newContact);
        listMenu();
    }

    // checkForExistingContact
    // would overload this function in order to allow for full contact search or for name search
    private void checkForExisitngContact(){
        // this returns a true or false regarding its existance
    }

    // findContact
    private void findContact(){
        // based on a contacts existance, this either finds it and returns its index
        // or it tells you that DNE

    }

    // updateExistingContact
    private void updateExistingContact(){

    }

    // removeContact
    private void removeContact(){

    }
}
