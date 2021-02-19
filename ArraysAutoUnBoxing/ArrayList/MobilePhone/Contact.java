package Lessons.ArraysAutoUnBoxing.ArrayList.MobilePhone;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // sukuriam šitą metodą tam, kad galėtume sukurti naują kontakto įrašą. Tai bus labai svarbu
    // kai norėsime pasiekti funkcijas, kurios bus mūsų "mobile phone"
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
