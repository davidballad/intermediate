import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Student[] students = new Student[3];
//
//        students[0] = new Student("rick", 4.0);
//        students[0].setCourse(new String[]{"cs", "math", "albegra"});
//        students[1] = new Student("jess", 2.0);
//        students[2] = new Student("john", 1.5);
//
//        System.out.println("Class: " + Arrays.toString(students[0].getCourse()));
//        for (Student student : students) {
//            String name = student.getName();
//            double gpa = student.getGpa();
//            student.smartStuds(name, gpa);
//        }
        try {
            Student rick = new Student("Rick", 3.5);
            rick.setName("Morty");
            rick.smartStuds();
            System.out.println(rick.toString());
        } catch (IllegalArgumentException ie) {
            System.out.println("Name or GPA is invlid.");
        }
        try {
            Student jess = new Student("Jess", 10.0);
        } catch (IllegalArgumentException ie) {
            System.out.println("Name or GPA is invlid..");
        } 

    }
}