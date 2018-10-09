import java.util.Scanner;

public class EmpoyeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Ivan", 5, 200);
        employee[1] = new Employee("Lilja", 3, 150);
        employee[2] = new Employee("Vova", 5, 100);
        employee[3] = new Employee("Anna", 4, 250);
        employee[4] = new Employee("Vira", 1, 200);
        System.out.println("---1---");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }

        System.out.println("---2---");
        System.out.println("Enter department number");
        int department = scanner.nextInt();
        for (int i = 0; i < employee.length; i++) {
            if (department == employee[i].getDepartmentNumber()) {
                System.out.println(employee[i]);
            }
        }

        System.out.println("---3---");
        Employee temp;
        for (int i = 0; i < employee.length - 1; i++) {
            for (int j = i + 1; j < employee.length; j++) {
                if (employee[i].getSalary() < employee[j].getSalary()) {
                    temp = employee[i];
                    employee[i] = employee[j];
                    employee[j] = temp;
                }
            }
        }

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }
}