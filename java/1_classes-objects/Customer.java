
public class Customer {
    public String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public void orderPastry(PastryItem pastry) {
        System.out.println(customerName + " orders a " + pastry.name);
        System.out.println("That will be $" + pastry.getPrice());
    }
}
