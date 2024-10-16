package WEEK_7;

import java.util.*;

public class ContactManager {
    private Set<Contact> contactSet;
    
    private Map<String, String> contactMap;

    public ContactManager() {
        contactSet = new HashSet<>();
        contactMap = new HashMap<>();
    }


    public boolean addContact(Contact contact) {
        if (contactSet.add(contact)) {
            contactMap.put(contact.getName(), contact.getPhoneNumber());
            return true;
        }
        return false;
    }

  
    public String getPhoneNumber(String name) {
        return contactMap.get(name);
    }


    public boolean updatePhoneNumber(String name, String newPhoneNumber) {
        if (contactMap.containsKey(name)) {

            Contact oldContact = new Contact(name, contactMap.get(name));
            contactSet.remove(oldContact);
            Contact updatedContact = new Contact(name, newPhoneNumber);
            contactSet.add(updatedContact);
            contactMap.put(name, newPhoneNumber);
            return true;
        }
        return false; 
    }
    public boolean removeContact(String name) {
        if (contactMap.containsKey(name)) {
            Contact contactToRemove = new Contact(name, contactMap.get(name));
            contactSet.remove(contactToRemove);
            contactMap.remove(name);
            return true;
        }
        return false; 
    }


    public Set<Contact> getAllContacts() {
        return contactSet;
    }
}
