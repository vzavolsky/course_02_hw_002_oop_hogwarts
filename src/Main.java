public class Main {
    public static void main(String[] args) {

        Gryffindor granger = new Gryffindor("Germiona", 50, 15,23,41,90);
        Gryffindor potter = new Gryffindor("Harry",23,41,15,53,90);
        Gryffindor[] pupilsOfGryffindor = {
                granger,
                potter
        };

        Slytherin[] pupilsOfSlytherin = {
                new Slytherin("Malfoy",32,55,66,88,34,17,46),
                new Slytherin("Zakharya",44,11,0,45,6,3,12)
        };

        // Выводим информацию об ученике
        System.out.printf("%s%n%n",granger);

        // Получаем лучшего ученика на курсе.
        // Была задача сравнить двух. Но в рамках учебноё задачи, мне показалось, данное решение было бы блоее интересным.
        // Надеюсь, это не критично.
        GetTheBestPupil theBestPupil = new GetTheBestPupil();
        System.out.printf("Лучший ученик Гриффиндорф: %s%n%n", theBestPupil.getTheBestPupil(pupilsOfGryffindor));
        System.out.printf("Лучший ученик Слизарин: %s%n%n", theBestPupil.getTheBestPupil(pupilsOfSlytherin));

        // Сравниваем силу магии и трансгрессию двух учеников.
        compareTwoPupils(granger,potter);
    }

    public static void compareTwoPupils(Hogwarts green, Hogwarts red) {
        Hogwarts hierPowerPupil;
        Hogwarts lesPowerPupil;
        // Данная реализация показалась более интересной, чем если использовать if else и т.д.
        hierPowerPupil = green.getPowerOfMagic() > red.getPowerOfMagic() ? green : red;
        lesPowerPupil = green.getPowerOfMagic() < red.getPowerOfMagic() ? green : red;
        System.out.printf("%s обладает большей мощностью магии, чем %s.%n",hierPowerPupil.getStudentName(), lesPowerPupil.getStudentName());
        hierPowerPupil = green.getTransgressionDistance() > red.getTransgressionDistance() ? green : red;
        lesPowerPupil = green.getTransgressionDistance() < red.getTransgressionDistance() ? green : red;
        System.out.printf("%s обладает большим расстоянием трансгрессии, чем %s.%n%n",hierPowerPupil.getStudentName(), lesPowerPupil.getStudentName());
    }

}