package challenges;

import java.util.ArrayList;

public class MobilePhone {

    private String name;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String name) {
        this.name = name;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){

    }

    public boolean updateContact(Contact oldContact, Contact newContact){

    }

    public boolean removeContact(Contact contact){

    }

    public int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    public int findContact(String contactName){

    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >=0) {
            return this.myContacts.get(position);
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Contact List:");
    }
}

