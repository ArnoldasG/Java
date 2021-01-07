package Exercises.OOP.Constructors.LessonBankAccount;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    // 1 - sis konstruktorius. Taip susikuriame naują konstruktorių. Čia yra default konstruktorius.
    public Account() {
        // Parašėme: Jeigu bus sukurtas objektas be parametrų - atspausdinsim tekstą.
        System.out.println("This is default constructor");
    }

    // 2 - asis konstruktorius. Sukuriam konstruktorių, su paduootais parametrais, kurių duomenis norime gauti.
    public Account(String number, double balance, String customerName,
                   String customerEmailAddress, String customerPhoneNumber) {
        // Taip priskiriam konstruktoriui vertes.

        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }
    // 3 - sis konstruktorius. Code > Generate > Constructor.
    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        // Prisikiriam jam, taip pat kaip 2 - ąjame kontruktoriuj, bet taip, kad nereiktų dublikuoti ir nustatom default reikšmes jei reikia.
        this("6578", 0.0, customerName, customerEmailAddress, customerPhoneNumber);

    }

    // Susikuriam metodą, kuris leis mums padėti pinigus į sąskaitą.
    public void deposit(double depositAmount) {
        // Taip pridėsime norimą sumą prie esamo balanso.
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is: " + this.balance);

    }
    // Susikuriam metodą, kuris leis mums nuimti pinigus nuo sąskaitos.
    public void withdrawal(double withdrawalAmount) {
        // Pateikiame sąlyga, kad jei sumą yra 0 - nuimti pinigų negalima.
        if(balance - withdrawalAmount < 0){
            System.out.println("Only this sum " + this.balance + " available.");
            // Sukuriam sąlyga, kad nuimame pinigus nuo sąskaitos, parodome kiek nuimėm ir parodom likusią sumą
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance: " + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

// Instantly create Getters And Setters > Code > Generate > Getters and Setters