package units;

import java.util.ArrayList;

public class Healers extends BaseHero {
    int mana;

    public Healers(String name, String type, int attack, int defence, int[] damage, int health, int speed, int mana) {
        super(name, type, attack, defence, damage, health, speed);
        this.mana = mana;
    }

    @Override
    public String toString() {
        return super.toString() +
                "mana=" + mana;
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < heroList.size(); i++) {
            int temp = ((maxhealth - health) * 100) / maxhealth;
            if (temp > max) {
                max = temp;
                index = i;
            }
        }
        if (max > 0) {
            healing(heroList.get(index));
        }
    }


    private void healing(BaseHero wounded) {
        if ((wounded.health - damage[0]) > wounded.maxhealth) {
            wounded.health = wounded.maxhealth;
            System.out.println("\n" + name + "-" + type + " вылечил " + wounded.name + "-" + wounded.type + ". Здоровье: " + wounded.health);
        } else {
            wounded.health = wounded.health - damage[0];
            System.out.println("\n" + name + "-" + type + " вылечил " + wounded.name + "-" + wounded.type + ". Здоровье: " + wounded.health);
        }
    }
}





