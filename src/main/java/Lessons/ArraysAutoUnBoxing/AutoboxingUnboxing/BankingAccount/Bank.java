package main.java.Lessons.ArraysAutoUnBoxing.AutoboxingUnboxing.BankingAccount;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        // vėl patikrins ar toks branchas nėra užimtas ir jeigu nėra - jį sukurt.
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        // patikrinam ar klientas turi branchą ir jei jis turi, skukuriame nauja klientą.
        Branch branch = findBranch(branchName);
        if (branch != null) {
            // su šita eilute mes pakviečiam "branch code", kad sukurti naują klientą.
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        // vėl patikrinam ar klientas turi branchą ir jeigu turi gražinam koks metodas
        // turi būti.
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String customerName) {
        // sukuriam metodą, kuris patikrins kliento branchą.
        for (int i = 0; i < this.branches.size(); i++) {
            // eilutėje apačioje mes pereinam per visą klientų sąrašą su loopu ir patikrinam
            // ar kliento vardas nėra toks pats, koks buvo paduotas.
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getBranchName().equals(customerName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        // pasirenkam kokį norim branchą, patikrinam ar jis egzistuoja ir jei toks yra
        // išspausdinam jį.
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getBranchName());

            // kai žinom su kuriuo branchu turim reikalą - reikia gauti klientų sarašą
            // iš to brancho.
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                // parodysim klientą ir jo vardą.
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
                // ši eilutė eksekiutins tai, jeigu showTransactions - true - mes atspausdinsim..
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
