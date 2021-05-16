package Task4;

public class Family extends Personnel{
    private int amount;
    private int address;

    public Family() { }

    public Family(int amount, int address) {
        this.amount = amount;
        this.address = address;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Family{" +
                "amount=" + amount +
                ", address=" + address +
                "} " + super.toString();
    }
}
