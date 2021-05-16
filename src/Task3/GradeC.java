package Task3;

public class GradeC extends Candidate {
    private float literPoint;
    private float historyPoint;
    private float geoPoint;

    public GradeC() { }

    public GradeC(int id, String name, String address, int priority, float literPoint, float historyPoint, float geoPoint) {
        super(id, name, address, priority);
        this.literPoint = literPoint;
        this.historyPoint = historyPoint;
        this.geoPoint = geoPoint;

    }

    public float getLiterPoint() {
        return literPoint;
    }

    public void setLiterPoint(float literPoint) {
        this.literPoint = literPoint;
    }

    public float getHistoryPoint() {
        return historyPoint;
    }

    public void setHistoryPoint(float historyPoint) {
        this.historyPoint = historyPoint;
    }

    public float getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(float geoPoint) {
        this.geoPoint = geoPoint;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Grade C {" +
                "literPoint=" + literPoint +
                ", historyPoint=" + historyPoint +
                ", geoPoint=" + geoPoint +
                "} ";
    }
}
