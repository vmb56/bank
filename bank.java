import java.util.ArrayList;

public class Main {
    // Classe Contact
    static class Contact {
        String name;
        String phoneNumber;

        public Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }

    // Classe ContactsManager
    static class ContactsManager {
        ArrayList<Contact> contactsList;

        public ContactsManager() {
            contactsList = new ArrayList<>();
        }

        public void addContact(Contact contact) {
            contactsList.add(contact);
        }

        public Contact searchContact(String name) {
            for (Contact contact : contactsList) {
                if (contact.name.equalsIgnoreCase(name)) {
                    return contact;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        // Créer un objet ContactsManager
        ContactsManager myContactsManager = new ContactsManager();

        // Créer et ajouter des contacts
        addSampleContacts(myContactsManager);

        // Rechercher un contact
        searchAndPrintContact(myContactsManager, "Charlie");
    }

    private static void addSampleContacts(ContactsManager contactsManager) {
        Contact contact1 = new Contact("Alice", "123-456-7890");
        contactsManager.addContact(contact1);

        Contact contact2 = new Contact("Bob", "234-567-8901");
        contactsManager.addContact(contact2);

        Contact contact3 = new Contact("Charlie", "345-678-9012");
        contactsManager.addContact(contact3);

        Contact contact4 = new Contact("David", "456-789-0123");
        contactsManager.addContact(contact4);

        Contact contact5 = new Contact("Eve", "567-890-1234");
        contactsManager.addContact(contact5);
    }

    private static void searchAndPrintContact(ContactsManager contactsManager, String name) {
        Contact searchedContact = contactsManager.searchContact(name);
        if (searchedContact != null) {
            System.out.println("Phone number of " + searchedContact.name + ": " + searchedContact.phoneNumber);
        } else {
            System.out.println("Contact not found.");
        }
    }
}
