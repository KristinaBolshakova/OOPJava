package units;

public class Peasant extends BaseHero {
    protected int delivery;

    public Peasant(String name, String type, int attack, int defence, int[] damage, int health, int speed, int delivery) {
        super(name, type, attack, defence, damage, health, speed);
        this.delivery = delivery;
    }

    public Peasant(String name) {
        super(name, "Крестьянин", 1, 1, new int[] {1, 1}, 1, 3);
        this.delivery = 1;

    }

    @Override
    public String toString(){
        return super.toString() + ", delivery= " + delivery;
    }
}