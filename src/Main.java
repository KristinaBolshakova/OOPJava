import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<BaseHero> heroesOne = new ArrayList<>();
        ArrayList<BaseHero> heroesTwo = new ArrayList<>();
        generateHeroes(heroesOne, 10, 1);
        generateHeroes(heroesTwo, 10, 2);
        heroesOne.forEach(item -> System.out.print(item.getInfo() + ", "));
        heroesOne.forEach(item -> item.step(heroesOne));
    }

    private static void generateHeroes(ArrayList<BaseHero> listHeroes, int lengthList, int option) {
        String[] nameHeroes = {"Александр", "Владимир", "Василий", "Сергей", "Андрей", "Дмитрий", "Михаил", "Юрий", "Николай", "Роман", "Олег", "Алексей", "Виктор", "Павел", "Борис", "Евгений", "Константин", "Иван", "Валерий", "Антон", "Максим", "Виталий", "Леонид", "Анатолий", "Лев", "Игорь", "Вячеслав", "Кирилл", "Вадим", "Илья", "Денис", "Геннадий", "Георгий", "Никита", "Марк", "Станислав", "Григорий", "Роберт", "Ян", "Валентин", "Эдуард", "Федор", "Аркадий", "Артем", "Герман", "Артур", "Ричард", "Даниил", "Стивен", "Семен", "Яков"};
        Random rand = new Random();

        for (int i = 0; i < lengthList; i++) {
            int randnum = rand.nextInt(4);
            if (option == 1) {
                if (randnum == 0) {
                    listHeroes.add(new Peasant(nameHeroes[rand.nextInt(nameHeroes.length)]));
                } else if (randnum == 1) {
                    listHeroes.add(new Outlaw(nameHeroes[rand.nextInt(nameHeroes.length)]));
                } else if (randnum == 2) {
                    listHeroes.add(new Sniper(nameHeroes[rand.nextInt(nameHeroes.length)]));
                } else {
                    listHeroes.add(new Sorcerer(nameHeroes[rand.nextInt(nameHeroes.length)]));
                }
            } else {
                if (randnum == 0) {
                    listHeroes.add(new Peasant(nameHeroes[rand.nextInt(nameHeroes.length)]));
                } else if (randnum == 1) {
                    listHeroes.add(new Spearman(nameHeroes[rand.nextInt(nameHeroes.length)]));
                } else if (randnum == 2) {
                    listHeroes.add(new Crossbowman(nameHeroes[rand.nextInt(nameHeroes.length)]));
                } else {
                    listHeroes.add(new Monk(nameHeroes[rand.nextInt(nameHeroes.length)]));
                }
            }

        }
    }
}