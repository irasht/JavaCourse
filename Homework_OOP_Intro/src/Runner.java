import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Runner {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--1--");
        Person person = new Person();
        person.input(br);
        person.output();

        System.out.println("--2--");
        Person person1 = new Person("Levko", 1976);
         person1.output();

        System.out.println("--3--");
        Person person2 = new Person();
        person2.setName("Anna");
        person2.setBirthYear(1995);
        person2.changeName("Vira");
        person2.output();

        System.out.println("--4--");
        Person person3 = new Person();
        person3.input(br);
        person3.output();

        System.out.println("--5--");
        Person person4 = new Person("Ivan", 2001);
        person4.output();
    }
}