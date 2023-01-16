import java.util.Arrays;

public class Hero {
    private String name, type;
    private int attack, defence, hp, speed;
    private int[] damage;

    public Hero(String name, String type, int attack, int defence, int[] damage, int hp, int speed) {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.hp = hp;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public String getType() {return type;}

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getHp() {
        return hp;
    }

    public int getSpeed() {return speed; }

    @Override
    public String toString() {
        return "Name=" + name +
                ", type=" + type +
                ", attack=" + attack +
                ", defence=" + defence +
                ", damage=" + Arrays.toString(damage) +
                ", hp=" + hp +
                ", speed=" + speed;
    }
}
