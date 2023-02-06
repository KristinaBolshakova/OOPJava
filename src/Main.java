import units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int GANG_SIZE = 10;
    public static ArrayList<BaseHero> whiteSide;
    public static ArrayList<BaseHero> darkSide;

    public static void main(String[] args) {
        init();
        Comparator<BaseHero> comparator = Comparator.comparing(BaseHero::getSpeed);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            nextTurn(comparator);
            System.out.println(AnsiColors.ANSI_BLUE + "\nХодит WhiteSide" + AnsiColors.ANSI_RESET);
            whiteSide.forEach(item -> item.step(darkSide));
            System.out.println(AnsiColors.ANSI_GREEN + "\nХодит DarkSide" + AnsiColors.ANSI_RESET);
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
                case 0 -> whitePeasant.add(new Farmer(whiteSide, "White", nameHeroes[rand.nextInt(nameHeroes.length)], x, y++));
                case 1 -> whiteSide.add(new Rogue(whiteSide, "White", nameHeroes[rand.nextInt(nameHeroes.length)], x, y++));
                case 2 -> whiteSide.add(new Sniper(whiteSide, "White", nameHeroes[rand.nextInt(nameHeroes.length)], x, y++));
                default -> whiteSide.add(new Sorcerer(whiteSide, "White", nameHeroes[rand.nextInt(nameHeroes.length)], x, y++));
            }
        }
        whiteSide.addAll(whitePeasant);

        x = GANG_SIZE;
        y = 1;

        for (int i = 0; i < GANG_SIZE; i++) {
            switch (rand.nextInt(4)) {
                case 0 -> darkPeasant.add(new Farmer(darkSide, "Dark", nameHeroes[rand.nextInt(nameHeroes.length)], x, y++));
                case 1 -> darkSide.add(new Spearman(darkSide, "Dark", nameHeroes[rand.nextInt(nameHeroes.length)], x, y++));
                case 2 -> darkSide.add(new Crossbowman(darkSide, "Dark", nameHeroes[rand.nextInt(nameHeroes.length)], x, y++));
                default -> darkSide.add(new Monk(darkSide, "Dark", nameHeroes[rand.nextInt(nameHeroes.length)], x, y++));
            }

        }
        darkSide.addAll(darkPeasant);
    }
    public static void nextTurn(Comparator<BaseHero> comparator) {
        ConsoleView.view();
        whiteSide.sort(comparator.reversed());
        darkSide.sort(comparator.reversed());
    }
}
