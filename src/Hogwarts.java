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

    public Hogwarts(String studentName) {
        RandomValue randomValue = new RandomValue();
        this.studentName = studentName;
        this.powerOfMagic = randomValue.nextInt();
        this.transgressionDistance = randomValue.nextInt();
    }

    @Override
    public String toString() {
        return "Hogwarts {" +
                "studentName = '" + studentName + '\'' +
                ", powerOfMagic = " + powerOfMagic +
                ", transgressionDistance = " + transgressionDistance +
                '}';
    }

    public void compareTwoPupils(Hogwarts red) {
        Hogwarts hierPowerPupil;
        Hogwarts lesPowerPupil;
        // Данная реализация показалась более интересной, чем если использовать if else и т.д.
        hierPowerPupil = this.getPowerOfMagic() > red.getPowerOfMagic() ? this : red;
        lesPowerPupil = this.getPowerOfMagic() < red.getPowerOfMagic() ? this : red;
        System.out.printf("%s обладает большей мощностью магии, чем %s.%n", hierPowerPupil.getStudentName(), lesPowerPupil.getStudentName());
        hierPowerPupil = this.getTransgressionDistance() > red.getTransgressionDistance() ? this : red;
        lesPowerPupil = this.getTransgressionDistance() < red.getTransgressionDistance() ? this : red;
        System.out.printf("%s обладает большим расстоянием трансгрессии, чем %s.%n%n", hierPowerPupil.getStudentName(), lesPowerPupil.getStudentName());
    }

    public int sumOfSkills() {
        return this.getTransgressionDistance() + this.getPowerOfMagic();
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
