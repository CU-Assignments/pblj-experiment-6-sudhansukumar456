import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + '}';
    }
}

public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("sudhansu", 30, 70000));
        employees.add(new Employee("anshu", 25, 50000));
        employees.add(new Employee("sumit", 35, 60000));
        employees.add(new Employee("amit", 28, 80000));

        employees.sort(Comparator.comparing(emp -> emp.name));
        System.out.println("Sorted by Name:");
        employees.forEach(System.out::println);

        employees.sort(Comparator.comparingInt(emp -> emp.age));
        System.out.println("\nSorted by Age:");
        employees.forEach(System.out::println);

        employees.sort(Comparator.comparingDouble(emp -> emp.salary));
        System.out.println("\nSorted by Salary:");
        employees.forEach(System.out::println);
    }
}