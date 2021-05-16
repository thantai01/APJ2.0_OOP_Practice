package Task3;

public class GradeA extends Candidate {
    private float mathPoint;
    private float physPoint;
    private float chemPoint;

    public GradeA() { }

    public GradeA(int id, String name, String address, int priority, float mathPoint, float physPoint, float chemPoint) {
        super(id, name, address, priority);
        this.mathPoint = mathPoint;
        this.physPoint = physPoint;
        this.chemPoint = chemPoint;
    }

    public float getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(float mathPoint) {
        this.mathPoint = mathPoint;
    }

    public float getPhysPoint() {
        return physPoint;
    }

    public void setPhysPoint(float physPoint) {
        this.physPoint = physPoint;
    }

    public float getChemPoint() {
        return chemPoint;
    }

    public void setChemPoint(float chemPoint) {
        this.chemPoint = chemPoint;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Grade A {" +
                "mathPoint=" + mathPoint +
                ", physPoint=" + physPoint +
                ", chemPoint=" + chemPoint +
                "} ";
    }
}
