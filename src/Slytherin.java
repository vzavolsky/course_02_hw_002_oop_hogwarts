public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String studentName, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(studentName, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public Slytherin(String studentName) {
        super(studentName);
        RandomValue randomValue = new RandomValue();
        this.cunning = randomValue.nextInt();
        this.determination = randomValue.nextInt();
        this.ambition = randomValue.nextInt();
        this.resourcefulness = randomValue.nextInt();
        this.lustForPower = randomValue.nextInt();
    }

    @Override
    public String toString() {
        return "Slytherin {" +
                "studentName = '" + super.getStudentName() + '\'' +
                ", powerOfMagic = " + super.getPowerOfMagic() +
                ", transgressionDistance = " + super.getTransgressionDistance() +
                ", cunning = " + cunning +
                ", determination = " + determination +
                ", ambition = " + ambition +
                ", resourcefulness = " + resourcefulness +
                ", lustForPower = " + lustForPower +
                '}';
    }

    public int sumOfSkills() {
        return  this.getTransgressionDistance() +
                this.getPowerOfMagic() +
                this.getCunning() +
                this.getAmbition() +
                this.getDetermination() +
                this.getLustForPower() +
                this.getResourcefulness();
    }

    public void compareTwoPupils(Slytherin slytherin) {
        Slytherin winner;
        Slytherin looser;
        winner = this.sumOfSkills() > slytherin.sumOfSkills() ? this : slytherin;
        looser = this.sumOfSkills() < slytherin.sumOfSkills() ? this : slytherin;
        System.out.printf("%s более способный ученик Slytherin, чем %s.%n", this.getStudentName(), looser.getStudentName());
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}
