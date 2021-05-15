package Task1;

public class Worker extends Personnel{
    private int grade;

    public Worker() {
    }

    public Worker(String name, int age, String gender, int grade) {
        super(name, age, gender);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(this.grade>0&&this.grade<11)
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() +
                " is Worker{" +
                "grade=" + grade +
                "} ";
    }
}
