package academic.driver;
import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;
import java.util.Scanner;
import java.util.HashSet;

/**
 * @author 12S23011 Mabel Christoffel A.S
 * @author 12S23027 Amos Manurung
 */
public class Driver1 {

    public static void main(String[] _args) {

        HashSet<Course> courses = new HashSet<Course>();
        HashSet<Student> students = new HashSet<Student>();
        HashSet<Enrollment> enrollments = new HashSet<Enrollment>();
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
                    enrollments.add(new Enrollment(parts[1], parts[2], parts[3], parts[4]));
                    break;
            }
        }
        
        for (Course course : courses) {
            System.out.println(course.toString());
        }
        for (Student student : students) {
            System.out.println(student.toString());
        }
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment.toString());
        }
        scanner.close();
    }
}
