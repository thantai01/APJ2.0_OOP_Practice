package Task5;

public class RoomB extends Room {

    public RoomB() {
        super("B", 300);
    }
    @Override
    public String toString() {
        return "Room { " +
                "type='" + getType() + '\'' +
                ", price=" + getPrice() +
                "} ";
    }
}

