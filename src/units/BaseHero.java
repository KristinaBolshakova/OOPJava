package units;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class BaseHero implements HeroInterface {
    protected String name, type;
    protected int attack, defence, health, maxhealth, speed;
    protected int[] damage;
    protected ArrayList<BaseHero> heroTeam;
    private Vector2 position;


    public BaseHero(ArrayList<BaseHero> heroTeam, String name, String type, int attack, int defence, int[] damage, int health, int speed, int x, int y) {
        this.heroTeam = heroTeam;
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.maxhealth = health;
        this.health = maxhealth - new Random().nextInt(maxhealth);
        this.speed = speed;
        this.position = new Vector2(x, y);
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {
    }

    @Override
    public String getInfo() {
        return String.format("%-10s %-13s %s Осталось здоровья: %-2d из %-2d %s:%-2d", name, type, "\uD83E\uDDE1", health, maxhealth, "⚔️", attack);
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

    public Vector2 getPosition() {return position;}

    public String getType() {return type;}
}
