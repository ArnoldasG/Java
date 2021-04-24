package Email_System_Administration;

import java.util.Scanner;

public class Email {

    // FIELDS

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String email;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "myCompany.lt";

    // CONSTRUCTOR

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - and should return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your randomly generated password is: " + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);

    }

    // METHODS

    // Ask for department
    private String setDepartment() {
        System.out.println("DEPARTMENT CODE \n1 for Sales\n2 for Development \n3 for Accounting \n0 for none\n Enter " +
                "department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "Development";
        } else if(depChoice == 3 ) {
            return "Accounting";
        } else {
            return " ";
        }
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            // We gonna take Math.random() - from 0 to 1. Then gonna multiple from how many passwordSet characters are
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String (password);
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "MB";
    }

    // GETTERS AND SETTERS

    // Mailbox Capacity

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Alternate Email

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Password

    public String getPassword() {
        return password;
    }

    public void changePassword(String password) {
        this.password = password;
    }
}
