package Lessons.ArraysAutoUnBoxing.AutoboxingUnboxing.BankingAccount;

// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions) - 1st.
// Customer: - 1st.
// Name, and the ArrayList of doubles. - 1st.
// Branch: - 2nd.
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions


public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Lithuanian Bank");

        if (bank.addBranch("Kauno filialas")) {
            System.out.println("'Kauno filialas' branch created");
        }

        bank.addCustomer("Kauno filialas", "Arnoldas", 1346.34);
        bank.addCustomer("Kauno filialas", "Ugnė", 55.45);
        bank.addCustomer("Kauno filialas", "Evita", 367.55);

        bank.addBranch("Vilniaus filialas");

        bank.addCustomer("Vilniaus filialas", "Linas", 450.50);

        bank.addCustomerTransaction("Kauno filialas", "Arnoldas", 150.50);
        bank.addCustomerTransaction("Kauno filialas", "Arnoldas", 38.50);
        bank.addCustomerTransaction("Kauno filialas", "Evita", 46.50);

        bank.listCustomers("Kauno filialas", false);
        System.out.println("\n");
        bank.listCustomers("Kauno filialas", true);
        System.out.println();
        bank.listCustomers("Vilniaus filialas", true);

        if(!bank.addCustomer("Šiaulių filialas", "Simona", 55.66)) {
            System.out.println("Error! There is no 'Šiaulių filialas' branch");
        }

        if (!bank.addBranch("Kauno filialas")) {
            System.out.println("'Kauno filialas' already exists");
        }
        System.out.println();
        if (!bank.addCustomerTransaction("Kauno filialas", "Aidas", 100.00)) {
            System.out.println("Customer does not exist");
        }
        System.out.println();
        if(!bank.addCustomer("Kauno filialas", "Arnoldas", 12.21 )) {
            System.out.println("Customer Arnoldas already exists");
        }




    }
}
