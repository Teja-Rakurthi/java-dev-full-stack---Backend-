import java.util.*;

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone;
    }
}

class Phonebook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add Contact
    public void addContact(String name, String phone) {
        contacts.add(new Contact(name, phone));
    }

    // Remove by Name
    public void removeByName(String name) {
        Iterator<Contact> iterator = contacts.iterator();

        while (iterator.hasNext()) {
            Contact c = iterator.next();
            if (c.name.equalsIgnoreCase(name)) {
                iterator.remove(); // Safe removal
            }
        }
    }

    // Search by Name
    public Contact searchByName(String name) {
        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    // Sort by Name
    public void sortByName() {
        contacts.sort((c1, c2) ->
                c1.name.compareToIgnoreCase(c2.name));
    }

    // Delete contacts with invalid phone numbers
    public void removeInvalidPhones() {
        Iterator<Contact> iterator = contacts.iterator();

        while (iterator.hasNext()) {
            Contact c = iterator.next();

            // Example: valid phone must have exactly 10 digits
            if (!c.phone.matches("\\d{10}")) {
                iterator.remove();
            }
        }
    }

    // Display all contacts
    public void listAll() {
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}

public class Practice10 {
    public static void main(String[] args) {

        Phonebook pb = new Phonebook();

        pb.addContact("Aarav", "9876543210");
        pb.addContact("Teja", "12345");       // Invalid
        pb.addContact("Ravi", "9999999999");
        pb.addContact("Anil", "8888888888");

        System.out.println("Before removing invalid phones:");
        pb.listAll();

        pb.removeInvalidPhones();

        System.out.println("\nAfter removing invalid phones:");
        pb.listAll();

        System.out.println("\nSearch Result:");
        System.out.println(pb.searchByName("Ravi"));

        pb.sortByName();

        System.out.println("\nSorted Contacts:");
        pb.listAll();

        pb.removeByName("Anil");

        System.out.println("\nAfter removing Anil:");
        pb.listAll();
    }
}