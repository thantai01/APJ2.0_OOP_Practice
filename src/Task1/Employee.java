package Task1;

public class Employee extends Personnel{
    private String theirJob;

    public Employee() {
    }

    public Employee(String name, int age, String gender, String theirJob) {
        super(name, age, gender);
        this.theirJob = theirJob;
    }

    public String getTheirJob() {
        return theirJob;
    }

    public void setTheirJob(String theirJob) {
        this.theirJob = theirJob;
    }

    @Override
    public String toString() {
        return super.toString() + "is Employee{" +
                "theirJob='" + theirJob + '\'' +
                " }";
    }
}
