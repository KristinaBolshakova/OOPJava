package units;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class BaseHero implements HeroInterface {
    public String name, type;
    public int attack, defence, health, maxhealth, speed;
    public int[] damage;


    public BaseHero(String name, String type, int attack, int defence, int[] damage, int health, int speed) {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.maxhealth = health;
        this.health = maxhealth - new Random().nextInt(maxhealth);
        this.speed = speed;
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {}

    @Override
    public String getInfo() {
        return name + " " + type + ". Здоровье: " + health + "/" + maxhealth;
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
}
