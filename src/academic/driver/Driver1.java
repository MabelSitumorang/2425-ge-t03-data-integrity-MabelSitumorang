package academic.driver;
import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author 12S23011 Mabel Christoffel A.S
 * @author 12S23027 Amos Manurung
 */
public class Driver1 {

    public static void main(String[] _args) {

        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Enrollment> enrollments = new ArrayList<>();
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
        
        for (int i = courses.size() - 1; i >= 0; i--) {
            System.out.println(courses.get(i).toString());
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
