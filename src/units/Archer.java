package units;

import java.util.ArrayList;

public abstract class Archer extends BaseHero {
    int shoots;
    public Archer(ArrayList<BaseHero> team, String teamName, String name, String role, int attack, int defence, int[] damage, int health, int speed, int shoots, int x, int y) {
        super(team, teamName, name, role, attack, defence, damage, health, speed, x, y);
        this.shoots = shoots;
    }

//    @Override
//    public String toString() {
//        return super.toString() + ", Shoots: " + shoots;
//    }
}
