import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Hero> peasentArrayList = new ArrayList<>();
//        ArrayList<Hero> sorcererArrayList = new ArrayList<>();
//        ArrayList<Hero> outlawtArrayList = new ArrayList<>();
//
//
//        for (int i = 0; i < 5; i++){
//            peasentArrayList.add(new Peasant("Peasant" + i));
//            sorcererArrayList.add(new Sorcerer("Sorcerer" + i));
//            outlawtArrayList.add(new Outlaw("Outlaw" + i));
//        }
//
//        for (int i = 0; i < 5; i++){
//            System.out.println(peasentArrayList.get(i));
//            System.out.println(sorcererArrayList.get(i));
//            System.out.println(outlawtArrayList.get(i));

//        }
        ArrayList<Hero> heroes = new ArrayList<>();

        GetHeroes(heroes);
//        System.out.println(heroes);
        parseHeroes(heroes, "Peasant");

    }

    private static void GetHeroes(ArrayList<Hero> listHeroes) {
        String[] nameHeroes = {"Александр", "Владимир", "Василий", "Сергей", "Андрей", "Дмитрий", "Михаил", "Юрий", "Николай", "Роман", "Олег", "Алексей", "Виктор", "Павел", "Борис", "Евгений", "Константин", "Иван", "Валерий", "Антон", "Максим", "Виталий", "Леонид", "Анатолий", "Лев", "Игорь", "Вячеслав", "Кирилл", "Вадим", "Илья", "Денис", "Геннадий", "Георгий", "Никита", "Марк", "Станислав", "Григорий", "РОберт", "Ян", "Валентин", "Эдуард", "Федор", "Аркадий", "Артем", "Герман", "Артур", "Ричард", "Даниил", "Стивен", "Семен", "Яков"};
        Random random = new Random();

        for (int i = 0; i < nameHeroes.length; i++) {
            int rand = random.nextInt(7);
            if (rand == 0) {
                listHeroes.add(new Peasant(nameHeroes[i]));
            } else if (rand == 1) {
                listHeroes.add(new Outlaw(nameHeroes[i]));
            } else if (rand == 2) {
                listHeroes.add(new Sniper(nameHeroes[i]));
            } else if (rand == 3) {
                listHeroes.add(new Sorcerer(nameHeroes[i]));
            } else if (rand == 4) {
                listHeroes.add(new Spearman(nameHeroes[i]));
            } else if (rand == 5) {
                listHeroes.add(new Crossbowman(nameHeroes[i]));
            } else {
                listHeroes.add(new Monk(nameHeroes[i]));
            }
        }


    }

    private static void parseHeroes(ArrayList<Hero> listHeroes, String heroes) {
        for (Hero hero : listHeroes) {
            if (hero.getClass().getName().equals(heroes)) {
                System.out.println(hero);
            }
        }
    }
}