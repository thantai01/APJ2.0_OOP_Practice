package Task5;

public class Hotel {
    private final Customer[] hotels = new Customer[1000];
    private int n = 0;

    public void addCustomer(Customer customer) {
        hotels[n] = customer;
        n++;
    }
    public int findCustomerID(int id) {
        for (int i = 0; i < n; i++) {
            if(id == hotels[i].getId()) {
                return i;
            }
        } return -1;
    }

    public void deleteCustomer(int id) {
        hotels[findCustomerID(id)] =null;
    }

    public void customerInfo(){
        for (int i = 0; i < n; i++) {
            System.out.println(hotels[n]);
        }
        System.out.println("---------");
    }
}
