package Task2;

import java.util.Date;

public class Newspaper extends Document{
    private Date releaseDate;

    public Newspaper(int id, String brand, int amount, Date releaseDate) {
        super(id, brand, amount);
        this.releaseDate = releaseDate;
    }

    public Newspaper() {
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Newspaper{" +
                "releaseDate=" + releaseDate +
                "} ";
    }
}
