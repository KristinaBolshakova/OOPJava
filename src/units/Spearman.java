package units;

import java.util.ArrayList;

public class Spearman extends Melee {
    public Spearman(ArrayList<BaseHero> team, String teamName, String name, int x, int y){
        super(team, teamName, name, "Spearman", 4, 5, new int[] {1, 3}, 10,  4, x, y);
    }
}
