package units;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseHero implements HeroInterface {
    public String name, type, teamName;
    public int attack, defence, maxHealth, speed;
    public float health;
    public int[] damage;
    public ArrayList<BaseHero> teamList;
    public Vector2 position;


    public BaseHero(ArrayList<BaseHero> teamList, String teamName, String name, String type, int attack, int defence, int[] damage, int health, int speed, int x, int y) {
        this.teamList = teamList;
        this.teamName = teamName;
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.maxHealth = health;
        this.health = maxHealth;
        this.speed = speed;
        this.position = new Vector2(x, y);
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {
    }

    @Override
    public String getInfo() {
        return String.format("%-10s %-13s %s Осталось здоровья: %-2d из %-2d %s:%-2d", name, type, "\uD83E\uDDE1", (int) health, maxHealth, "⚔️", attack);
    }

//    @Override
//    public String toString() {
//        return "Name- " + name +
//                ", type= " + type +
//                ", attack= " + attack +
//                ", defence= " + defence +
//                ", damage= " + Arrays.toString(damage) +
//                ", health= " + health +
//                ", speed= " + speed;
//    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(float x, float y) {
        this.position = new Vector2(x, y);
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    protected void getDamage(float attackPower) {
        this.health -= attackPower;
        if (this.health < 0) {
            this.health = 0;
        } else if (this.health > maxHealth) {
            this.health = maxHealth;
        }
//        System.out.println(this.name + " " + this.health);

    }

    public float healthColor() {
        return health;
    }

    protected Vector2 getTarget(ArrayList<BaseHero> heroList) {
        float minDistance = 100;
        int minIndex = 0;
        for (int i = 0; i < heroList.size(); i++) {
            float temp = getPosition().getDistance(heroList.get(0).getPosition().x, heroList.get(0).getPosition().y);
            if (temp < minDistance && heroList.get(i).health > 0) {
                minDistance = temp;
                minIndex = i;
            }
//            System.out.println(getPosition().getDistance(target.getPosition().x, target.getPosition().y));
        }
        return new Vector2(minDistance, minIndex);
    }

    public String getTeamName() {
        return teamName;
    }

    public ArrayList<BaseHero> getTeam() {return teamList;
    }

    public int getSpeed() {return speed;
    }
}
