package units;

import java.util.ArrayList;

public class Farmer extends BaseHero {
    boolean supply;

    public Farmer(ArrayList<BaseHero> team, String teamName, String name, int x, int y){
        super(team, teamName, name, "Farmer", 1, 1, new int[] {1, 1}, 1, 1, x, y);
        this.supply = true;
    }

//    @Override
//    public String toString() {
//        return super.toString() + ", Supply: ";
//    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {
        this.supply = true;
    }
}
