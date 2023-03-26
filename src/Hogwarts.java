import java.util.Objects;

public class Hogwarts {
    private String studentName;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String studentName, int powerOfMagic, int transgressionDistance) {
        this.studentName = studentName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "studentName = '" + studentName + '\'' +
                ", powerOfMagic = " + powerOfMagic +
                ", transgressionDistance = " + transgressionDistance +
                '}';
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
}
