public class GetTheBestPupil {

    public Object getTheBestPupil(Hogwarts[] pupilsOfHogwarts) {
        int maxScores = 0;
        int sumOfSkills = 0;
        int maxPupilIndex = 0;
        for (int i = 0; i < pupilsOfHogwarts.length; i++) {
            sumOfSkills = pupilsOfHogwarts[i].sumOfSkills();
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
            sumOfSkills = objects[i].sumOfSkills();
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
            sumOfSkills = objects[i].sumOfSkills();
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
            sumOfSkills = objects[i].sumOfSkills();
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
            sumOfSkills = objects[i].sumOfSkills();
            if (maxScores < sumOfSkills) {
                maxPupilIndex = i;
                maxScores = sumOfSkills;
            }
        }
        return objects[maxPupilIndex];
    }
}
