package Task7;

public class TeacherManager {
    private final Teacher[] teachers = new Teacher[50];
    private int n =0;

    public TeacherManager() { }

    public void addTeacher(Teacher teacher) {
        teachers[n] = teacher;
        n++;
    }
    public void deleteTeacher(String code) {
        for (int i = 0; i < n; i++) {
            if(teachers[i].getCode().equals(code)) {
                teachers[i]=null;
            }
        }
    }
    public void print() {
        for (int i = 0; i <n ; i++) {
            System.out.println(teachers[i]);
        }
        System.out.println("_______");
    }

}
