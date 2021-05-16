package Task5;

import java.util.Date;

public class Room extends Customer {
    private String type;
    private Date startDate;
    private Date endDate;

    public Room(String name, int age, int id, String type, Date startDate, Date endDate) {
        super(name, age, id);
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Room() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getRoomPrice(String type){
        if(type.equals("A")) {
            return 500;
        } else if (type.equals("B")){
            return 300;
        } else return 100;
    }

    @Override
    public String toString() {
        return "RoomManager{" +
                "type='" + type + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                "} " + super.toString();
    }
}
