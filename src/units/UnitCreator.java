package units;

import units.*;

import java.util.Random;


public class UnitCreator {
    static String[] namesList = {"Артём", "Александр", "Михаил", "Максим", "Иван", "Даниил", "Дмитрий", "Кирилл", "Никита", "Егор", "Матвей", "Андрей", "Илья", "Алексей", "Роман", "Сергей", "Владислав", "Ярослав", "Тимофей", "Арсений", "Денис", "Владимир", "Павел", "Глеб", "Константин", "Богдан", "Евгений", "Николай", "Степан", "Захар", "Тимур", "Марк", "Семён", "Фёдор", "Георгий", "Лев", "Антон", "Вадим", "Игорь", "Руслан", "Вячеслав", "Григорий", "Макар", "Артур", "Виктор", "Станислав", "Савелий", "Олег", "Давид", "Леонид", "Пётр", "Юрий", "Виталий", "Мирон", "Василий", "Всеволод", "Елисей", "Назар", "Родион", "Марат",
            "Платон", "Герман", "Игнат", "Святослав", "Анатолий", "Тихон", "Валерий", "Мирослав", "Ростислав", "Борис", "Филипп", "Демьян", "Гордей", "Валентин", "Демид", "Прохор", "Серафим", "Савва", "Яромир",
            "Аркадий", "Архип", "Тарас", "Трофим"};
    public static BaseHero createRandomUnit(BaseHero hero, Vector2 pos) {
        Random rnd = new Random();

        int x = pos.getX();
        int y = pos.getY();

        if (hero.getTeamName().equals("White")) {
            switch (rnd.nextInt(4)){
                case 0 -> {
                    return new Farmer(hero.getTeam(), "White",namesList[rnd.nextInt(namesList.length)], x, y);
                }
                case 1 -> {
                    return new Rogue(hero.getTeam(), "White", namesList[rnd.nextInt(namesList.length)], x, y);
                }
                case 2 -> {
                    return new Sniper(hero.getTeam(), "White", namesList[rnd.nextInt(namesList.length)], x, y);
                }
                case 3 -> {
                    return new Sorcerer(hero.getTeam(), "White", namesList[rnd.nextInt(namesList.length)], x, y);
                }
            }
        } else {
            switch (rnd.nextInt(4)){
                case 0 -> {
                    return new Crossbowman(hero.getTeam(), "Dark", namesList[rnd.nextInt(namesList.length)], x, y);
                }
                case 1 -> {
                    return new Monk(hero.getTeam(),"Dark", namesList[rnd.nextInt(namesList.length)], x, y);
                }
                case 2 -> {
                    return new Spearman(hero.getTeam(),"Dark", namesList[rnd.nextInt(namesList.length)], x, y);
                }
                case 3 -> {
                    return new Farmer(hero.getTeam(),"Dark", namesList[rnd.nextInt(namesList.length)], x, y);
                }
            }
        }
        return hero;
    }
}
