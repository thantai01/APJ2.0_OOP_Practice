package Task7;

public class Teacher extends Personnel{
    private float salary;
    private float bonus;
    private float penalty;
    private float income;

    public Teacher() { }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float getPenalty() {
        return penalty;
    }

    public void setPenalty(float penalty) {
        this.penalty = penalty;
    }

    public float getIncome() {
        return this.salary + this.bonus - this.penalty;
    }


    @Override
    public String toString() {
        return super.toString() +
                "Teacher {" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", penalty=" + penalty +
                ", income=" + getIncome() +
                "} ";
    }
}
