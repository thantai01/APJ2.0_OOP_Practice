package Task7;

public class Personnel {
    private String name;
    private int age;
    private String hometown;
    private String code;

    public Personnel() { }

    public Personnel(String name, int age, String hometown, String code) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.code = code;
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

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hometown='" + hometown + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
