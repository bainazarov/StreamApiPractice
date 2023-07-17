package Data;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private static List<Person> persons = new ArrayList<>();

    static {
        Person person1 = new Person("Иван", 20);
        Person person2 = new Person("Артем", 30);
        Person person3 = new Person("Владимир", 15);
        Person person4 = new Person("Анатолий", 17);
        Person person5 = new Person("Алексей", 35);
        Person person6 = new Person("Михаил", 16);
        Person person7 = new Person("Петр", 50);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
    }

    private static List<Student> students = new ArrayList<>();
    static {
        Student student1 = new Student("Иван", 3);
        Student student2 = new Student("Артем", 4);
        Student student3 = new Student("Владимир", 1);
        Student student4 = new Student("Анатолий", 5);
        Student student5 = new Student("Алексей", 4);
        Student student6 = new Student("Михаил", 2);
        Student student7 = new Student("Петр", 3);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
    }
    public static List<Student> getStudents() {
        return students;
    }

    public static List<Person> getPersons() {
        return persons;
    }
}
