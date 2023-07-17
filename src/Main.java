import Data.Data;
import Data.Person;
import Data.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static Data.Data.*;


public class Main {
    public static void main(String[] args) {
        // elem * 2
        List<Integer> number = new ArrayList<>();

        number.add(1);
        number.add(2);

        List<Integer> numbers = number.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(numbers);

        // starts with A
        List<String> strings = new ArrayList<>();

        strings.add("Artem");
        strings.add("Ivan");
        strings.add("Vladimir");

        List<String> string = strings.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(string);

        // Age > 18
        List<Person> people1 = Data.getPersons();
        List<Person> people2 = people1.stream()
                .filter(p -> p.getAge() > 18)
                .collect(Collectors.toList());

        System.out.println(people2);


        // unique strings
        List<String> unique = new ArrayList<>();

        unique.add("Hello");
        unique.add("Hi");
        unique.add("Goodbye");
        unique.add("Hello");

        List<String> unique1 = unique.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(unique1);

        // average score
        double averageGrade = Student.avgGrade(getStudents());
        System.out.println(averageGrade);

        // unique symbols
        List<String> words = List.of("hello", "hi", "goodbye");

        List<Character> uniqueChar = words.stream()
                .flatMap(word -> word.chars().mapToObj(ch -> (char) ch))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueChar);
    }
}