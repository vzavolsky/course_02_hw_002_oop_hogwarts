public class GetTheBestPupil {

    public Object getTheBestPupil(Hogwarts[] pupilsOfHogwarts) {
        int maxScores = 0;
        int sumOfSkills = 0;
        int maxPupilIndex = 0;
        for (int i = 0; i < pupilsOfHogwarts.length; i++) {
            sumOfSkills = pupilsOfHogwarts[i].getTransgressionDistance() + pupilsOfHogwarts[i].getPowerOfMagic();
            if (maxScores < sumOfSkills) {
                maxPupilIndex = i;
                maxScores = sumOfSkills;
            }
        }
        return pupilsOfHogwarts[maxPupilIndex];
    }

    public Object getTheBestPupil(Ravenclaw[] objects) {
        int maxScores = 0;
        int sumOfSkills = 0;
        int maxPupilIndex = 0;
        for (int i = 0; i < objects.length; i++) {
            sumOfSkills = objects[i].getTransgressionDistance() +
                    objects[i].getPowerOfMagic() +
                    objects[i].getIntelligence() +
                    objects[i].getResourcefulness() +
                    objects[i].getWisdom() +
                    objects[i].getWit();
            if (maxScores < sumOfSkills) {
                maxPupilIndex = i;
                maxScores = sumOfSkills;
            }
        }
        return objects[maxPupilIndex];
    }

    public Object getTheBestPupil(Gryffindor[] objects) {
        int maxScores = 0;
        int sumOfSkills = 0;
        int maxPupilIndex = 0;
        for (int i = 0; i < objects.length; i++) {
            sumOfSkills = objects[i].getTransgressionDistance() +
                    objects[i].getPowerOfMagic() +
                    objects[i].getCourage() +
                    objects[i].getNobility() +
                    objects[i].getHonor();
            if (maxScores < sumOfSkills) {
                maxPupilIndex = i;
                maxScores = sumOfSkills;
            }
        }
        return objects[maxPupilIndex];
    }

    public Object getTheBestPupil(Hufflepuff[] objects) {
        int maxScores = 0;
        int sumOfSkills = 0;
        int maxPupilIndex = 0;
        for (int i = 0; i < objects.length; i++) {
            sumOfSkills = objects[i].getTransgressionDistance() +
                    objects[i].getPowerOfMagic() +
                    objects[i].getHonesty() +
                    objects[i].getLoyalty() +
                    objects[i].getHardWork();
            if (maxScores < sumOfSkills) {
                maxPupilIndex = i;
                maxScores = sumOfSkills;
            }
        }
        return objects[maxPupilIndex];
    }

    public Object getTheBestPupil(Slytherin[] objects) {
        int maxScores = 0;
        int sumOfSkills = 0;
        int maxPupilIndex = 0;
        for (int i = 0; i < objects.length; i++) {
            sumOfSkills = objects[i].getTransgressionDistance() +
                    objects[i].getPowerOfMagic() +
                    objects[i].getCunning() +
                    objects[i].getAmbition() +
                    objects[i].getDetermination() +
                    objects[i].getLustForPower() +
                    objects[i].getResourcefulness();
            if (maxScores < sumOfSkills) {
                maxPupilIndex = i;
                maxScores = sumOfSkills;
            }
        }
        return objects[maxPupilIndex];
    }
}
