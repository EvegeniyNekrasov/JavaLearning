import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> banches;

    public Bank(String name) {
        this.name = name;
        this.banches = new ArrayList<Branch>();
    }

    private Branch findBranch(String branchName) {
        for(int i = 0; i < this.banches.size(); i++) {
            if(this.banches.get(i).getName().equals(branchName)) {
                return this.banches.get(i);
            }
        }
        return null;
    }

    public boolean addBranch(String branchName) {
        Branch tempBranch = findBranch(branchName);
        if(tempBranch == null) {
            tempBranch = new Branch(branchName);
            this.banches.add(tempBranch);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        Branch tempBranch = findBranch(branchName);
        if(tempBranch != null) {
            return tempBranch.newCustomer(customerName, transaction);
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch tempBranch = findBranch(branchName);
        if(tempBranch != null) {
            return tempBranch.addCustomerTransaction(customerName, transaction);
        } else {
            return false;
        }
    }

    public boolean listCustomers(String customerName, boolean printTransactions) {
        Branch tempBranch = findBranch(customerName);
        if(tempBranch != null && printTransactions) {
            System.out.println("Customer details = " + tempBranch.getName());
            for(int i = 0; i < tempBranch.getCustomers().size(); i++) {
                System.out.println("Customer -> " + tempBranch.getCustomers().get(i).getName() + "{" + (i+1) + "}");
                System.out.println("Transaction");
                for(int j = 0; j < tempBranch.getCustomers().get(i).getTransactions().size();j++) {
                    System.out.println("{" + (j+1) + "} Amount " + tempBranch.getCustomers().get(i).getTransactions().get(j));

                }
            }
            return true;
        } else if( tempBranch != null) {
            System.out.println("Customer details " + tempBranch.getName());
            for(int i = 0; i < tempBranch.getCustomers().size(); i++) {
                System.out.println("Customer " + tempBranch.getCustomers().get(i).getName() + "{" + (i+1) + "}");
            }
            return true;
        } else {
            return false;
        }
    }
}
