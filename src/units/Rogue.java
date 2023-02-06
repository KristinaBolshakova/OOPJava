package units;

import java.util.ArrayList;

public class Rogue extends Melee {
    public Rogue(ArrayList<BaseHero> team, String teamName, String name, int x, int y) {
        super(team, teamName, name, "Rogue", 8, 3, new int[] {2, 4}, 10, 6, x, y);
    }
}
