package units;

import units.Melee;

import java.util.ArrayList;

public class Outlaw extends Melee {
    public Outlaw(ArrayList<BaseHero> heroTeam, String name, int x, int y){
        super(heroTeam, name, "Разбойник", 8, 3, new int[] {2, 4}, 10, 6, x, y);
    }
}

