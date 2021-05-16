package Task2;

public class Document {
    private int id;
    private String brand;
    private int amount;

    public Document(int id, String brand, int amount) {
        this.id = id;
        this.brand = brand;
        this.amount = amount;
    }

    public Document() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Document{" +
                "codename=" + id +
                ", brand='" + brand + '\'' +
                ", amount=" + amount +
                '}';
    }
}
