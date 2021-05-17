package Task2;

import java.util.Date;

public class Magazine extends Document {
    private int vol;
    private Date releaseDate;

    public Magazine(int codename, String brand, int amount, int versionNumber) {
        super(codename, brand, amount);
        this.vol = versionNumber;
    }

    public Magazine() {
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int versionNumber) {
        this.vol = versionNumber;
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
                "versionNumber=" + vol +
                ", releaseDate=" + releaseDate +
                "} ";
    }
}
