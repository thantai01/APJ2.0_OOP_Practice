package Task1;

public class Engineer extends Personnel{
    private String specialize;

    public Engineer() {
    }

    public Engineer(String name, int age, String gender, String specialize) {
        super(name, age, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return super.toString() +
                " ís Engineer{" +
                "specialize='" + specialize + '\'' +
                "} ";
    }
}
