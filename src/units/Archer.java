package units;

import java.util.ArrayList;

public class Archer extends BaseHero {
    protected int shoots, maxShoots;

    public Archer(String name, String type, int attack, int defence, int shoots, int[] damage, int health, int speed) {
        super(name, type, attack, defence, damage, health, speed);
        this.shoots = shoots;
        this.maxShoots = shoots;
    }


    @Override
    public String toString() {
        return super.toString() + "shoots=" + shoots;
    }


    @Override
    public void step(ArrayList<BaseHero> heroList) {
        boolean stepShoot = true;
        for (BaseHero hero : heroList) {
            if (hero.type.equals("Peasant")) {
                if (((Peasant) hero).delivery) {
                    System.out.printf("\n%s %s совершил выстрел и потратил 0 стрел. Осталось %d стрел", name, type, shoots, maxShoots);
                    ((Peasant) hero).delivery = false;
                    stepShoot = false;
                    break;
                }
            }
        }
        if (stepShoot) {
            if (shoots > 0) {
                System.out.printf("\n%s %s совершил выстрел и потратил 1 стрелу. Осталось %d/%d стрел", name, type, --shoots, maxShoots);
            }
        } else {
            System.out.printf("\n%s %s не может больше стрелять. Закончились стрелы %d/%d", name, type, shoots, maxShoots);
        }
    }
}



