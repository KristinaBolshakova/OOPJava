package units;

import java.util.ArrayList;

public class Monk extends Healers {
    public Monk(ArrayList<BaseHero> team, String teamName, String name, int x, int y){
        super(team, teamName, name, "Monk", 12, 7, new int[] {-4, -4}, 30, 1, 2, x, y);
    }
}
