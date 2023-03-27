public class Main {
    public static void main(String[] args) {

        Gryffindor granger = new Gryffindor("Germiona");
        Gryffindor potter = new Gryffindor("Harry");
        Slytherin malfoy = new Slytherin("Malfoy",32,55,66,88,34,17,46);

        Hogwarts[] pupilsOfHogwarts = {
                malfoy,
                granger,
                potter
        };

        Gryffindor[] pupilsOfGryffindor = {
                granger,
                potter
        };

        Slytherin[] pupilsOfSlytherin = {
                malfoy,
                new Slytherin("Zakharya",44,11,0,45,6,3,12),
                new Slytherin("Parkinson")
        };

        // Выводим информацию об ученике
        System.out.printf("%s%n%n",granger);

        // Получаем лучшего ученика на курсе.
        // Была задача сравнить двух. Но в рамках учебноё задачи, мне показалось, данное решение было бы блоее интересным.
        // Надеюсь, это не критично.
        GetTheBestPupil theBestPupil = new GetTheBestPupil();

        System.out.printf("Лучший ученик Хогвардс: %s%n%n", theBestPupil.getTheBestPupil(pupilsOfHogwarts));

        System.out.printf("Лучший ученик Гриффиндорф: %s%n%n", theBestPupil.getTheBestPupil(pupilsOfGryffindor));
        System.out.printf("Лучший ученик Слизарин: %s%n%n", theBestPupil.getTheBestPupil(pupilsOfSlytherin));

        // Сравниваем силу магии и трансгрессию двух учеников.
        granger.compareTwoPupils((Hogwarts) potter);

        // Сравниваем двух учеников одного из факультетов
        granger.compareTwoPupils(potter);
    }

}