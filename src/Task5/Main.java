package Task5;

public class Main {
    public static void main(String[] args) {
        Hotel hotels = new Hotel();
        Room room1 = new RoomA();
        Customer mrA = new Customer("M.C",29,123456789,room1,3);
        hotels.addCustomer(mrA);
        hotels.customerInfo();
    }
}
