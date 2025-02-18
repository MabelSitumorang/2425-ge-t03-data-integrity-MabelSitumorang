package academic.model;
import java.util.ArrayList;

/**
 * @author 12S23011 Mabel Christoffel A.S
 * @author 12S23027 Amos Manurung
 */
public class Course {

    public String id;
    String course;
    String semester;
    String grade;

    public Course(String id, String course, String semester, String grade) {
        this.id = id;
        this.course = course;
        this.semester = semester;
        this.grade = grade;
    }

    public String toString() {
        return id + "|" + course + "|" + semester + "|" + grade;
    }

}
