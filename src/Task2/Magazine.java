package Task2;

import java.util.Date;

public class Magazine extends Document {
    private int versionNumber;
    private Date releaseDate;

    public Magazine(int codename, String brand, int amount, int versionNumber) {
        super(codename, brand, amount);
        this.versionNumber = versionNumber;
    }

    public Magazine() {
    }

    public int getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(int versionNumber) {
        this.versionNumber = versionNumber;
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
                "Magazine{" +
                "versionNumber=" + versionNumber +
                ", releaseDate=" + releaseDate +
                "} ";
    }
}
