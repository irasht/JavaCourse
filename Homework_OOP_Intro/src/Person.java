import java.io.BufferedReader;
import java.io.IOException;
import java.time.Year;

public class Person {
    private String name;
    private int birthYear;

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int age() {
        return Year.now().getValue() - birthYear;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void input(BufferedReader br) throws IOException {
        System.out.println("Enter your name");
        name = br.readLine();
        System.out.println("Enter your birth year");
        birthYear = Integer.parseInt(br.readLine());
    }

    public void output() {
        System.out.println("Name is: " + name + ". Person was born in " + birthYear + ". Age is " + age() + ".");
    }
}