package Lessons.ArraysAutoUnBoxing.AutoboxingUnboxing.BankingAccount;

import java.util.ArrayList;

public class Branch {
    // pasikuriam fieldų kokių mums reikės.
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getBranchName() {
        return branchName;
    }
    public boolean newCustomer(String customerName, double initialAmount) {
        // jeigu ieškomas klientas yra null, reiškia jis nėra duomenų bazėje.
        if (findCustomer(customerName) == null) {
            // tada pridėsime naują klientą.
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction (String customerName, double amount) {
        // sukuriam klien ir vėl patikrins salyga: ar toks vartotojas yra.
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            // eilutėje apačioje mes pereinam per visą klientų sąrašą su loopu ir patikrinam
            // ar kliento vardas nėra toks pats, koks buvo paduotas.
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
