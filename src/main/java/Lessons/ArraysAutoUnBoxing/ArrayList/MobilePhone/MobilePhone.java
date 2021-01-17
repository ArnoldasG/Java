package Lessons.ArraysAutoUnBoxing.ArrayList.MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    // metodas, kuris patikrins ir pridės naują kontaktą, jeigu jo dar nėra.
    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    // metodas, kuris seną kontaktą pakeis nauju kontaktu.
    public boolean updateContact(Contact oldContact, Contact newContact) {
        // patikrinam ar toks kontaktas egzistuoja
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            // ir jeigu tokio kontakto nėra grąžinam, kad jo nėra
            System.out.println(oldContact.getName() + "was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists. Update was not successful.");
            return false;
        }
        // jeigu kontaktą rado, mes jį pakeičiam nauju kontaktu.
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + "was replaced with" + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            // ir jeigu tokio kontakto nėra grąžinam, kad jo nėra
            System.out.println(contact.getName() + "was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + "was deleted.");
        return true;
    }

    // metodas, kuris patikrins kurioj masyvo pozicijoj yra tam tikras kontaktas.
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    // metoda, kuris patikrins ar kontaktas, kurį norime įvesti jau egzistuoja
    private int findContact(String contactName) {
        // prasuksim visus kontaktus per loop'ą.
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            // šita komanda patikrins ar kontakto įvestas vardas jau yra kontaktuose
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        // gražins -1 jeigu tokio kontakto neras.
        return -1;
    }
        public String queryContact(Contact contact) {
            if(findContact(contact) >= 0  ) {
                return contact.getName();
            }
            return null;
        }
        public void printContacts() {
            System.out.println("Contact List");
            for(int i = 0; i < this.myContacts.size(); i++) {
                System.out.println((i + 1) + "." +
                            this.myContacts.get(i).getName() + " -> " +
                            this.myContacts.get(i).getPhoneNumber());
                // metodas kurį aprašėm yra skirtas tam, kad išprintintume visus kontaktus, jeigu
                // to reikės. Tai mes gausime vardą ir telefono numerį. .get komanda panaudos getterius
                // kuriuos nustatėm ir tokiu būdu mes gausime ko paprašysime.

            }
        }

        public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
        }

}
