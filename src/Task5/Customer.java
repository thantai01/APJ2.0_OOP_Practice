package Task5;

public class Customer {
    private String name;
    private int age;
    private int id;
    private Room room;
    private int amountOfRent;

    public Customer() { }

    public Customer(String name, int age, int id, Room type, int amountOfRent) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.room = type;
        this.amountOfRent = amountOfRent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room type) {
        this.room = type;
    }

    public int getAmountOfRent() {
        return amountOfRent;
    }

    public void setAmountOfRent(int amountOfRent) {
        this.amountOfRent = amountOfRent;
    }

    @Override
    public String toString() {
        return "Customer { " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", room=" + room +
                ", amountOfRent=" + amountOfRent +
                '}';
    }
}
