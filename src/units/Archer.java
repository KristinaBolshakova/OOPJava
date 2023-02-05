package units;

import java.util.ArrayList;

public class Archer extends BaseHero {
    protected int shoots, maxShoots;

    public Archer(ArrayList<BaseHero> heroTeam, String name, String type, int attack, int defence, int shoots, int[] damage, int health, int speed, int x, int y) {
        super(heroTeam, name, type, attack, defence, damage, health, speed, x, y);
        this.shoots = shoots;
        this.maxShoots = shoots;
    }


    @Override
    public String toString() {
        return super.toString() + "shoots=" + shoots + "maxShoots" + maxShoots;
    }


    @Override
    public void step(ArrayList<BaseHero> heroList) {
        if (health == 0){
            return;
        }
        Vector2 target = getTarget(heroList);
        float consMin = 12;
        float consMax = 4;
        float attackPower;
        if (target.x <= consMax){
            attackPower = damage[1];
        }else if (target.x >= consMin){
            attackPower = damage[0];
        }
        else {
            attackPower = damage[0] + ((target.x - consMax) / (consMin-consMax)) * (damage[1] - damage[0]);
        }


        boolean stepShoot = true;
        for (BaseHero hero : teamList) {
            if (hero.type.equals("Peasant")) {
                if (((Peasant) hero).delivery) {
                    heroList.get((int) target.y).getDamage(attackPower);
                    System.out.printf("\n%s %s совершил выстрел в персонажа %s %s и нанёс %f урона, потратив 0 стрел. Осталось %d стрел ", name, type, heroList.get((int) target.y).name, heroList.get((int) target.y).type, attackPower, shoots, maxShoots);
                    ((Peasant) hero).delivery = false;
                    stepShoot = false;
                    break;
                }
            }
        }
        if (stepShoot) {
            if (shoots > 0) {
                heroList.get((int) target.y).getDamage(attackPower);
                System.out.printf("\n%s %s совершил выстрел в персонажа %s %s нанёс %f урона и потратил 1 стрелу. Осталось %d/%d стрел ", name, type, heroList.get((int) target.y).name, heroList.get((int) target.y).type, attackPower, --shoots, maxShoots);
            }
        } else {
            System.out.printf("\n%s %s не может больше стрелять. Закончились стрелы %d/%d", name, type, shoots, maxShoots);
        }
    }


}


