package academic.model;

/**
 * @author 12S23011 Mabel Christoffel A.S
 * @author 12S23027 Amos Manurung
 */
public class Student {

    String nim;
    String nama;
    String tahun;
    String prodi;

    public Student(String nim, String nama, String tahun, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.tahun = tahun;
        this.prodi = prodi;
    }

    public String toString() {
        return nim + "|" + nama + "|" + tahun + "|" + prodi;
    }

}