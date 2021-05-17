package Task6;

public class StudentManager {
    private Student[] students = new Student[1000];
    private int n =0;

    public StudentManager() { }

    public StudentManager(Student[] students) {
        this.students = students;
    }
    public void addNewStudent(Student student) {
        students[n]= student;
        n++;
    }
    public int findStudentByAge(int age) {
        for (int i = 0; i < n; i++) {
            if(students[i].getAge() == age) {
                return i;
            }
        } return -1;
    }
    public void filterStudent(int age) {
        for (int i = 0; i <n ; i++) {
            System.out.println(findStudentByAge(age));
        }
    }
    public void displayStudentsBy(int age, String hometown) {
        for (int i = 0; i < n; i++) {
            if(students[i].getAge()== age && students[n].getHometown().equals(hometown)) {
                System.out.println(students[i]);
            }
        }
    }

}
