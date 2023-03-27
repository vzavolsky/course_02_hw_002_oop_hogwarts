public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int resourcefulness;

    public Ravenclaw(String studentName, int powerOfMagic, int transgressionDistance, int intelligence, int wisdom, int wit, int resourcefulness) {
        super(studentName, powerOfMagic, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.resourcefulness = resourcefulness;
    }

    public Ravenclaw(String studentName) {
        super(studentName);
        RandomValue randomValue = new RandomValue();
        this.intelligence = randomValue.nextInt();
        this.wisdom = randomValue.nextInt();
        this.wit = randomValue.nextInt();
        this.resourcefulness = randomValue.nextInt();
    }

    @Override
    public String toString() {
        return "Ravenclaw {" +
                "studentName = '" + super.getStudentName() + '\'' +
                ", powerOfMagic = " + super.getPowerOfMagic() +
                ", transgressionDistance = " + super.getTransgressionDistance() +
                ", intelligence = " + intelligence +
                ", wisdom = " + wisdom +
                ", wit = " + wit +
                ", resourcefulness = " + resourcefulness +
                '}';
    }

    public int sumOfSkills() {
        return  this.getTransgressionDistance() +
                this.getPowerOfMagic() +
                this.getIntelligence() +
                this.getResourcefulness() +
                this.getWisdom() +
                this.getWit();
    }

    public void compareTwoPupils(Ravenclaw ravenclaw) {
        Ravenclaw winner;
        Ravenclaw looser;
        winner = this.sumOfSkills() > ravenclaw.sumOfSkills() ? this : ravenclaw;
        looser = this.sumOfSkills() < ravenclaw.sumOfSkills() ? this : ravenclaw;
        System.out.printf("%s более способный ученик Ravenclaw, чем %s.%n", this.getStudentName(), looser.getStudentName());
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }
}
