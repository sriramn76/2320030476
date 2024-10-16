package WEEK_7;

public class ContactManagerDemo {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();

        
        System.out.println("Adding Contacts:");
        manager.addContact(new Contact("Rohit", "12345"));
        manager.addContact(new Contact("Shuresh", "67890"));
        manager.addContact(new Contact("Mukesh", "54321"));
        System.out.println("All Contacts: " + manager.getAllContacts());
        
        

        System.out.println("\nFetching Phone Number of Shuresh:");
        System.out.println("Shuresh's Phone Number: " + manager.getPhoneNumber("Suresh"));
        System.out.println("\nUpdating Phone Number of Rohit:");
        
        manager.updatePhoneNumber("Rohit", "11111");
        System.out.println("All Contacts after update: " + manager.getAllContacts());
        System.out.println("\nRemoving Mukesh from contacts:");
        manager.removeContact("Mukesh");
        System.out.println("All Contacts after removal: " + manager.getAllContacts());

        System.out.println("\nTrying to add duplicate contact 'Shuresh':");
        if (!manager.addContact(new Contact("Shuresh", "67890"))) {
            System.out.println("Duplicate contact 'Shuresh' was not added.");
        }
        System.out.println("\nFinal Contacts List: " + manager.getAllContacts());
    }
}