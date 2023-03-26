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

    @Override
    public String toString() {
        return "Ravenclaw {" +
                "studentName = '" + super.getStudentName() + '\'' +
                ", powerOfMagic = " + super.getPowerOfMagic() +
                ", transgressionDistance = " + super.getTransgressionDistance() +
                "intelligence = " + intelligence +
                ", wisdom = " + wisdom +
                ", wit = " + wit +
                ", resourcefulness = " + resourcefulness +
                '}';
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
