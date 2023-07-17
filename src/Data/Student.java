package Data;

import java.util.List;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public static double avgGrade(List<Student> students) {
        return students.stream()
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0.0);
    }
}
