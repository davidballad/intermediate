package school;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();
        courses.add("math");
        courses.add("cs");

        Student rick = new Student("Rick", 3.0, courses);
        Student jess = new Student("Jess", 2.0, courses);
        Student morty = new Student("Morty", 4.0, courses);
        Student fred = new Student("Fred", 2.5, courses);
        Student rita = new Student("Rita", 1.7, courses);


        ArrayList<Student> students = new ArrayList<>();
        students.add(rick);
        students.add(jess);
        students.add(morty);
        students.add(fred);
        students.add(rita);

        for (Student s: students){
            System.out.println("Hello: " + s);
        }



    }
}
