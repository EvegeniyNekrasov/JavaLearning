import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String nameCustomer) {
        for(int i = 0; i < this.customers.size(); i++) {
            if(this.customers.get(i).getName().equals(nameCustomer)) {
                return this.customers.get(i);
            }
        }
        return null;
    }

    public boolean newCustomer(String customerName, double transaction) {
        Customer tempCustomer = findCustomer(customerName);
        if(tempCustomer == null) {
            tempCustomer = new Customer(customerName, transaction);
            this.customers.add(tempCustomer);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer tempCustomer = findCustomer(customerName);
        if(customerName != null) {
            tempCustomer.addTransaction(transaction);
            return true;
        } else {
            return false;
        }
    }
}
