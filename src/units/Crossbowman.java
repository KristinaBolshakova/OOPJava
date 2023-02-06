package units;

import java.util.ArrayList;

public class Crossbowman extends Ranged {
    public Crossbowman(ArrayList<BaseHero> team, String teamName, String name, int x, int y) {
        super(team, teamName, name, "Crossbowman", 6, 5, new int[] {4, 6}, 10, 10, 16, x, y);
    }
}
