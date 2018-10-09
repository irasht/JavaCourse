public class Employee {
    private String name;
    private int rate;
    private int hours;
    public static double totalSum = 0;

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Name=" + name + ", rate=" + rate + ", hours=" + hours + " salary=" + salary();
    }

    public void changeRate(int rate) {
        this.rate = rate;
    }

    public boolean hasBonuses() {
        return rate > 5;
    }

    public double salary() {
        double salary = rate * hours;
        if (hasBonuses()) {
            salary += salary * 0.1;
        }
        totalSum += salary;
        return salary;
    }
}