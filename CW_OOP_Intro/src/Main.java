public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("Nick");
        emp1.setRate(8);
        emp1.setHours(10);

        Employee emp2 = new Employee("Sam", 4);
        emp2.setHours(12);

        Employee emp3 = new Employee("Rob", 6, 5);

        System.out.println(emp1);
        System.out.println("Should print: Name=Nick, rate=8, hours=10 salary=88.0");
        System.out.println();
        System.out.println(emp2);
        System.out.println("Should print: Name=Sam, rate=4, hours=12 salary=48.0");
        System.out.println();
        System.out.println(emp3);
        System.out.println("Should print: Name=Rob, rate=6, hours=5 salary=33.0");
        System.out.println();
        System.out.println("Total salary: " + Employee.totalSum);
        System.out.println("Should print: Total salary: 169.0");

    }
}