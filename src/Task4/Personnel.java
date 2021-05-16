package Task4;

public class Personnel {
    private String name;
    private int age;
    private String work;
    private float identity;

    public Personnel() { }

    public Personnel(String name, int age, String work, float identity) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public float getIdentity() {
        return identity;
    }

    public void setIdentity(float identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "Personnel {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work='" + work + '\'' +
                ", identity=" + identity +
                '}';
    }
}
