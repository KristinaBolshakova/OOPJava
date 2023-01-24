import units.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<BaseHero> heroesOne = new ArrayList<>();
        ArrayList<BaseHero> heroesTwo = new ArrayList<>();
        generateHeroes(heroesOne, 10, 1);
        generateHeroes(heroesTwo, 10, 2);
        while (true) {
            heroesOne.forEach(item -> System.out.print(item.getInfo() + ", "));
            heroesOne.forEach(item -> item.step(heroesOne));
            System.out.println();
            input.nextLine();
        }

    }

    private static void generateHeroes(ArrayList<BaseHero> heroList, int lengthList, int option) {
        String[] nameHeroes = {"Александр", "Владимир", "Василий", "Сергей", "Андрей", "Дмитрий", "Михаил", "Юрий", "Николай", "Роман", "Олег", "Алексей", "Виктор", "Павел", "Борис", "Евгений", "Константин", "Иван", "Валерий", "Антон", "Максим", "Виталий", "Леонид", "Анатолий", "Лев", "Игорь", "Вячеслав", "Кирилл", "Вадим", "Илья", "Денис", "Геннадий", "Георгий", "Никита", "Марк", "Станислав", "Григорий", "Роберт", "Ян", "Валентин", "Эдуард", "Федор", "Аркадий", "Артем", "Герман", "Артур", "Ричард", "Даниил", "Стивен", "Семен", "Яков"};
        Random rand = new Random();
        ArrayList<BaseHero> peasant = new ArrayList<>();
        for (int i = 0; i < lengthList; i++) {
            int randnum = rand.nextInt(4);
            if (option == 1) {
                if (randnum == 0) {
                    heroList.add(new Peasant(nameHeroes[rand.nextInt(nameHeroes.length)]));
                } else if (randnum == 1) {
                    heroList.add(new Outlaw(nameHeroes[rand.nextInt(nameHeroes.length)]));
                } else if (randnum == 2) {
                    heroList.add(new Sniper(nameHeroes[rand.nextInt(nameHeroes.length)]));
                } else {
                    heroList.add(new Sorcerer(nameHeroes[rand.nextInt(nameHeroes.length)]));
                }
            } else {
                if (randnum == 0) {
                    heroList.add(new Peasant(nameHeroes[rand.nextInt(nameHeroes.length)]));
                } else if (randnum == 1) {
                    heroList.add(new Spearman(nameHeroes[rand.nextInt(nameHeroes.length)]));
                } else if (randnum == 2) {
                    heroList.add(new Crossbowman(nameHeroes[rand.nextInt(nameHeroes.length)]));
                } else {
                    heroList.add(new Monk(nameHeroes[rand.nextInt(nameHeroes.length)]));
                }
            }

        }
        heroList.addAll(peasant);
    }
}