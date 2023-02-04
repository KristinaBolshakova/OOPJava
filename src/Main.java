import units.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int GANG_SIZE = 10;
    public static ArrayList<BaseHero> whiteSide;
    public static ArrayList<BaseHero> darkSide;

    public static void main(String[] args) {
        init();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            ConsoleView.view();
            System.out.println("Ходит WhiteSide");
            whiteSide.forEach(item -> item.step(darkSide));
            System.out.println("\nХодит DarkSide");
            darkSide.forEach(item -> item.step(whiteSide));
            scanner.nextLine();
        }

    }

    private static void init() {
        String[] nameHeroes = {"Александр", "Владимир", "Василий", "Сергей", "Андрей", "Дмитрий", "Михаил", "Юрий", "Николай", "Роман", "Олег", "Алексей", "Виктор", "Павел", "Борис", "Евгений", "Константин", "Иван", "Валерий", "Антон", "Максим", "Виталий", "Леонид", "Анатолий", "Лев", "Игорь", "Вячеслав", "Кирилл", "Вадим", "Илья", "Денис", "Геннадий", "Георгий", "Никита", "Марк", "Станислав", "Григорий", "Роберт", "Ян", "Валентин", "Эдуард", "Федор", "Аркадий", "Артем", "Герман", "Артур", "Ричард", "Даниил", "Стивен", "Семен", "Яков"};
        whiteSide = new ArrayList<>();
        darkSide = new ArrayList<>();
        Random rand = new Random();
        ArrayList<BaseHero> whitePeasant = new ArrayList<>();
        ArrayList<BaseHero> darkPeasant = new ArrayList<>();
        int x = 1;
        int y = 1;

        for (int i = 0; i < GANG_SIZE; i++) {
            switch (rand.nextInt(4)) {
                case 0 -> whitePeasant.add(new Peasant(whiteSide, nameHeroes[rand.nextInt(nameHeroes.length)], x, y++));
                case 1 -> whiteSide.add(new Outlaw(whiteSide, nameHeroes[rand.nextInt(nameHeroes.length)], x, y++));
                case 2 -> whiteSide.add(new Sniper(whiteSide, nameHeroes[rand.nextInt(nameHeroes.length)], x, y++));
                default -> whiteSide.add(new Sorcerer(whiteSide, nameHeroes[rand.nextInt(nameHeroes.length)], x, y++));
            }
        }
        whiteSide.addAll(whitePeasant);

        x = GANG_SIZE;
        y = 1;

        for (int i = 0; i < GANG_SIZE; i++) {
            switch (rand.nextInt(4)) {
                case 0 -> darkPeasant.add(new Peasant(darkSide, nameHeroes[rand.nextInt(nameHeroes.length)], x, y++));
                case 1 -> darkSide.add(new Spearman(darkSide, nameHeroes[rand.nextInt(nameHeroes.length)], x, y++));
                case 2 -> darkSide.add(new Crossbowman(darkSide, nameHeroes[rand.nextInt(nameHeroes.length)], x, y++));
                default -> darkSide.add(new Monk(darkSide, nameHeroes[rand.nextInt(nameHeroes.length)], x, y++));
            }

        }
        darkSide.addAll(darkPeasant);
    }
}
