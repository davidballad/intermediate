import java.util.Arrays;

public class Student {
    private String name;
    private double gpa;
    private String[] courses;

    public Student(String name, double gpa) {
        if(isValid(name, gpa)){
            this.name = name;
            this.gpa = gpa;
        } else {
        throw new IllegalArgumentException("Name and/or GPA is not valid");
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

    public void smartStuds() {
        double gpa = getGpa();
        String name = getName();
        if (gpa >= 3.5){
            System.out.println("Smart student: " + name);
        }
    }

    public static boolean isValid(String name, double gpa) {
        return gpa >= 0.0 && gpa <= 5.0 && name != null;
    }


    @Override
    public String toString(){
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", course=" + Arrays.toString(courses) +
                '}';
    }
}
