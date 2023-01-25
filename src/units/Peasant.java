package units;


import java.util.ArrayList;

public class Peasant extends BaseHero {
    public boolean delivery;

    public Peasant(ArrayList<BaseHero> heroTeam, String name, String type, int attack, int defence, int[] damage, int health, int speed, int x, int y) {
        super(heroTeam, name, type, attack, defence, damage, health, speed, x, y);
    }

    public Peasant(ArrayList<BaseHero> heroTeam, String name, int x, int y) {
        super(heroTeam, name, "Крестьянин", 1, 1, new int[] {1, 1}, 1, 3, x, y);
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