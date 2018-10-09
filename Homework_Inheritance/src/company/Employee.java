package company;

public class Employee {
    private String name;
    private int id;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Worker name is " + name + ". ID is " + id + ". Person get salary ";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}