package units;


import java.util.ArrayList;

public class Peasant extends BaseHero {
    public boolean delivery;

    public Peasant(String name, String type, int attack, int defence, int[] damage, int health, int speed) {
        super(name, type, attack, defence, damage, health, speed);
    }

    public Peasant(String name) {
        super(name, "Крестьянин", 1, 1, new int[] {1, 1}, 1, 3);
        this.delivery = true;

    }
    @Override
    public void step(ArrayList<BaseHero> heroList){
        delivery = true;
    }


    @Override
    public String toString(){
        return super.toString() + ", delivery= " + delivery;
    }
}