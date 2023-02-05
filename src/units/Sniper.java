package units;


import java.util.ArrayList;

public class Sniper extends Archer {

    public Sniper(ArrayList<BaseHero> heroTeam, String name, int x, int y){
        super(heroTeam, name, "Снайпер", 12, 10, 32, new int[] {8, 10}, 15, 9, x, y);
    }
}
