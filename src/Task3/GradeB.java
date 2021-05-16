package Task3;

public class GradeB extends Candidate {
    private float mathPoint;
    private float chemPoint;
    private float bioPoint;

    public GradeB() { }

    public GradeB(int id, String name, String address, int priority, float mathPoint, float chemPoint, float bioPoint) {
        super(id, name, address, priority);
        this.mathPoint = mathPoint;
        this.chemPoint = chemPoint;
        this.bioPoint = bioPoint;

    }

    public float getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(float mathPoint) {
        this.mathPoint = mathPoint;
    }

    public float getChemPoint() {
        return chemPoint;
    }

    public void setChemPoint(float chemPoint) {
        this.chemPoint = chemPoint;
    }

    public float getBioPoint() {
        return bioPoint;
    }

    public void setBioPoint(float physPoint) {
        this.bioPoint = physPoint;
    }
    @Override
    public String toString() {
        return super.toString() +
                "Grade B {" +
                "mathPoint=" + mathPoint +
                ", chemPoint=" + chemPoint +
                ", bioPoint=" + bioPoint +
                "} ";
    }
}
