package school;

import java.util.ArrayList;

public class Student {
    private String name;
    private double gpa;
    private final ArrayList<String> courses;

    public Student(String name, double gpa, ArrayList<String> courses) {
        if(isvalid(name, gpa) && validCourse(courses)){
            this.name = name;
            this.gpa = gpa;
            this.courses = courses;
        } else {
            throw new IllegalArgumentException("Not permitted");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", courses=" + courses +
                '}';
    }

    public static boolean isvalid(String name, double gpa) {
        return gpa >= 0.0 && gpa <= 5.0 && name != null && !name.equals("");
    }

    public static boolean validCourse(ArrayList<String> courses) {
        return courses.size() != 0;
    }
}
