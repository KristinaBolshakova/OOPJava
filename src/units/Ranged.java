package units;

import java.util.ArrayList;

public class Ranged extends BaseHero {
    int shoots, maxShoots;

    public Ranged(ArrayList<BaseHero> team, String teamName, String name, String role, int attack, int defence, int[] damage, int health, int speed, int shoots, int x, int y) {
        super(team, teamName, name, role, attack, defence, damage, health, speed, x, y);
        this.shoots = shoots;
        this.maxShoots = shoots;
    }

    @Override
    public String toString() {
        return super.toString() + ", Shoots: " + shoots;
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {

        if (health == 0) {
            return;
        }
        Vector2 target = getTarget(heroList);
        float attackPower = calculateDMG(target);
        boolean doShot = true;

        BaseHero attackTarget = heroList.get((int) target.y);
        for (BaseHero hero : heroList) {
            if (attackTarget.health > 0) {
                if (hero.type.equals("Farmer")) {
                    if (((Farmer) hero).supply) {
                        attackTarget.getDamage(attackPower);
                        System.out.printf("\nПерсонаж %s %s совершил выстрел в персонажа %s %s нанёс %d урона и потратил 0 стрел. Осталось стрел %d/%d", name, type, attackTarget.name, attackTarget.type, (int) attackPower, shoots, maxShoots);
                        ((Farmer) hero).supply = false;
                        doShot = false;
                        break;
                    }
                }
            }
        }
        if (doShot && attackTarget.health > 0) {
            if (shoots > 0) {
                System.out.printf("\nПерсонаж %s %s совершил выстрел в персонажа %s %s нанёс %d урона и потратил 1 стрелу. Осталось стрел %d/%d", name, type, attackTarget.name, attackTarget.type, (int) attackPower, --shoots, maxShoots);
            } else {
                System.out.printf("\nПерсонаж %s %s не может больше стрелять. Закончились стрелы %d/%d", name, type, shoots, maxShoots);
            }
        }
    }




    private float calculateDMG(Vector2 target) {

        float constMin = 12;
        float constMax = 4;

        float attackPower;
        if (target.x <= constMax) {
            attackPower = damage[1];
        } else if (target.x >= constMin) {
            attackPower = damage[0];
        } else {
            attackPower = damage[0] + ((target.x - constMax) / (constMin - constMax)) * (damage[1] - damage[0]);
        }
        return attackPower;
    }
}
