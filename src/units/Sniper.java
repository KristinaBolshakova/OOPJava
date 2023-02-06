package units;

import java.util.ArrayList;

public class Sniper extends Ranged {
    public Sniper(ArrayList<BaseHero> team, String teamName, String name, int x, int y) {
        super(team, teamName, name, "Sniper", 12, 10, new int[]{8, 10}, 15, 9,32, x, y);
    }
}
