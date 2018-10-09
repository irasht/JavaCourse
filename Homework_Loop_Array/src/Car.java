public class Car {
    private String type;
    private int year;
    private int engine;

    public Car(String type, int year, int engine) {
        this.type = type;
        this.year = year;
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car type is " + type + ". It was produced in " + year + ", engine capacity is " + engine;
    }
}