public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String studentName, int powerOfMagic, int transgressionDistance, int nobility, int honor, int courage) {
        super(studentName, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public Gryffindor(String studentName) {
        super(studentName);
        RandomValue randomValue = new RandomValue();
        this.nobility = randomValue.nextInt();
        this.honor = randomValue.nextInt();
        this.courage = randomValue.nextInt();
    }

    @Override
    public String toString() {
        return "Gryffindor {" +
                "studentName = '" + super.getStudentName() + '\'' +
                ", powerOfMagic = " + super.getPowerOfMagic() +
                ", transgressionDistance = " + super.getTransgressionDistance() +
                ", nobility = " + nobility +
                ", honor = " + honor +
                ", courage = " + courage +
                '}';
    }

    public int sumOfSkills() {
        return  this.getTransgressionDistance() +
                this.getPowerOfMagic() +
                this.getCourage() +
                this.getNobility() +
                this.getHonor();
    }

    public void compareTwoPupils(Gryffindor gryffindor) {
        Gryffindor winner;
        Gryffindor looser;
        winner = this.sumOfSkills() > gryffindor.sumOfSkills() ? this : gryffindor;
        looser = this.sumOfSkills() < gryffindor.sumOfSkills() ? this : gryffindor;
        System.out.printf("%s более способный ученик Gryffindor, чем %s.%n", winner.getStudentName(), looser.getStudentName());
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
}
