package academic.model;

/**
 * @author 12S23011 Mabel Christoffel A.S
 * @author 12S23027 Amos Manurung
 */
public class Enrollment {

    String nim;
    String id;
    String tahun;
    String semester;

    public Enrollment(String nim, String id, String tahun, String semester) {
        this.nim = nim;
        this.id = id;
        this.tahun = tahun;
        this.semester = semester;
    }

    public String toString() {
        return nim + "|" + id + "|"  + tahun + "|" + semester + "|" + "None";
    }
}