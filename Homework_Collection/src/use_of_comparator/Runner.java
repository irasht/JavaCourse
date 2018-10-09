package use_of_comparator;

import java.util.*;

public class Runner {
    public static void main(String[] args) {

        List<Student> studentList = new LinkedList<>();
        studentList.add(new Student("Vasja", 2));
        studentList.add(new Student("Vira", 4));
        studentList.add(new Student("Lilja", 5));
        studentList.add(new Student("Ivan", 2));
        studentList.add(new Student("Oleh", 4));

        Student.printStudents(studentList, 2);

        System.out.println("-------Students ordered by name-------");
        studentList.sort(new Student.NameComparator());
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("------Students ordered by course------");
        studentList.sort(new Student.CourseComparator());
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}