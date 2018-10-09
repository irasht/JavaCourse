package use_of_comparator;

import java.util.*;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static class NameComparator implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getName().compareTo(st2.getName());
        }
    }

    public static class CourseComparator implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getCourse() - st2.getCourse();
        }
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if ((object == null) || (object.getClass() != getClass())) {
            return false;
        }
        Student student = (Student) object;

        return course == student.course && (name == student.name || (name != null && name.equals(student.name)));
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int hash = 1;
        hash = prime * hash + (name == null ? 0 : name.hashCode());
        hash = prime * hash + course;
        return hash;
    }

    public static void printStudents(List<Student> students, Integer course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    @Override
    public String toString() {
        return "Student's name is " + name + ", has " + course + " courses.";
    }
}