public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String studentName, int powerOfMagic, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(studentName, powerOfMagic, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public Hufflepuff(String studentName) {
        super(studentName);
        RandomValue randomValue = new RandomValue();
        this.hardWork = randomValue.nextInt();
        this.loyalty = randomValue.nextInt();
        this.honesty = randomValue.nextInt();
    }

    @Override
    public String toString() {
        return "Hufflepuff {" +
                "studentName = '" + super.getStudentName() + '\'' +
                ", powerOfMagic = " + super.getPowerOfMagic() +
                ", transgressionDistance = " + super.getTransgressionDistance() +
                ", hardWork = " + hardWork +
                ", loyalty = " + loyalty +
                ", honesty = " + honesty +
                '}';
    }

    public int sumOfSkills() {
        return  this.getTransgressionDistance() +
                this.getPowerOfMagic() +
                this.getHonesty() +
                this.getLoyalty() +
                this.getHardWork();
    }

    public void compareTwoPupils(Hufflepuff hufflepuff) {
        Hufflepuff winner;
        Hufflepuff looser;
        winner = this.sumOfSkills() > hufflepuff.sumOfSkills() ? this : hufflepuff;
        looser = this.sumOfSkills() < hufflepuff.sumOfSkills() ? this : hufflepuff;
        System.out.printf("%s более способный ученик Hufflepuff, чем %s.%n", this.getStudentName(), looser.getStudentName());
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
