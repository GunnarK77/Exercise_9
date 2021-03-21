package com.company.schmidt;
import java.util.*;
/*
* Gunnar Schmidt
* Exercise 9
*/

//creates abstract class of Contact
abstract class Contact {

    private String name;

    public Contact(String name) {
        this.name = name;
    }

    abstract public void contact();
}

//creates email class
class emailContact extends Contact {

    private String email;

    public emailContact(String name, String email) {
        super(name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void contact() {
        System.out.println("emailing " + getEmail());
    }
}

//Creates phoneNumber class
class phoneNumber extends Contact {

    private String phoneNumber;

    public phoneNumber(String name, String phoneNum) {
        super(name);
        this.phoneNumber = phoneNum;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void contact() {
        System.out.println("calling " + getPhoneNumber());
    }
}

public class Main {

    public static void main(String[] args) {

        phoneNumber firstContact = new phoneNumber("Gunnar:", "614-867-5309"); //get the song quote??
        emailContact secondContact = new emailContact("Mr.k:", "mrkissocool@gmail.com");

        firstContact.contact();
        secondContact.contact();

    }
}
