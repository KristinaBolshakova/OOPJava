package units;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseHero implements HeroInterface {
    public String name, type;
    public int attack, defence, maxHealth, speed;
    public float health;
    public int[] damage;
    public ArrayList<BaseHero> teamList;
    public Vector2 position;


    public BaseHero(ArrayList<BaseHero> teamList, String name, String type, int attack, int defence, int[] damage, int health, int speed, int x, int y) {
        this.teamList = teamList;
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

    @Override
    public String toString() {
        return "Name- " + name +
                ", type= " + type +
                ", attack= " + attack +
                ", defence= " + defence +
                ", damage= " + Arrays.toString(damage) +
                ", health= " + health +
                ", speed= " + speed;
    }

    public Vector2 getPosition() {
        return position;
    }

    public String getType() {
        return type;
    }

    protected void getDamage(float attackPower) {
        this.health -= attackPower;
        if (this.health < 0) {
            this.health = 0;
        } else if (this.health > maxHealth) {
            this.health = maxHealth;
        }
        System.out.println(this.name + " " + this.health);

    }

    public float healthColor() {
        return health;
    }
}
