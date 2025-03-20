import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', marks=" + marks + '}';
    }
}

public class StudentFiltering {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("sudhansu", 85));
        students.add(new Student("anshu", 72));
        students.add(new Student("amit", 90));
        students.add(new Student("sumit", 78));
        students.add(new Student("murli", 65));

        
        List<String> filteredAndSortedStudentNames = students.stream()
                .filter(student -> student.marks > 75)
                .sorted(Comparator.comparingDouble(student -> student.marks))
                .map(student -> student.name)
                .collect(Collectors.toList());

        System.out.println("Students scoring above 75% sorted by marks:");
        filteredAndSortedStudentNames.forEach(System.out::println);
    }
}