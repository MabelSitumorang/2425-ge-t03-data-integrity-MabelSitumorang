package academic.driver;

import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author 12S23011 Mabel Christoffel A.S
 * @author 12S23027 Amos Manurung
 */
public class Driver2 {

    public static void main(String[] _args) {
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Enrollment> enrollments = new ArrayList<>();
        ArrayList<String> errors = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            input = scanner.nextLine();
            if (input.equals("---")) {
                break;
            }
            String[] parts = input.split("#");
            switch (parts[0]) {
                case "course-add":
                    courses.add(new Course(parts[1], parts[2], parts[3], parts[4]));
                    break;
                case "student-add":
                    students.add(new Student(parts[1], parts[2], parts[3], parts[4]));
                    break;
                case "enrollment-add":
                    boolean validStudent = isStudentValid(parts[2], students);
                    boolean validCourse = isCourseValid(parts[1], courses);
                    
                    if (validCourse) {
                        if (!validStudent) {
                            errors.add("invalid student|" + parts[2]);
                        }
                    }
                    if (!validCourse) {
                            errors.add("invalid course|" + parts[1]);
                    }
                    
                    if (validStudent && validCourse) {
                        enrollments.add(new Enrollment(parts[1], parts[2], parts[3], parts[4]));
                    }
                    break;
            }
        }
        
        // Display error messages (if any) in the order of input
        for (String error : errors) {
            System.out.println(error);
        }
        
        // Display course data in input order
        for (Course course : courses) {
            System.out.println(course.toString());
        }
        
        // Display student data in input order
        for (Student student : students) {
            System.out.println(student.toString());
        }
        
        // Display enrollment data
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment.toString());
        }
        
        scanner.close();
    }
    
    private static boolean isCourseValid(String courseId, ArrayList<Course> courses) {
        for (Course course : courses) {
            if (course.id.equals(courseId)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isStudentValid(String studentId, ArrayList<Student> students) {
        for (Student student : students) {
            if (student.nim.equals(studentId)) {
                return true;
            }
        }
        return false;
    }
}
