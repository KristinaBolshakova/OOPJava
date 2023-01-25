package units;

import java.util.ArrayList;

public class Sorcerer extends Healers {
    public Sorcerer(ArrayList<BaseHero> heroTeam, String name, int x, int y){
        super(heroTeam, name, "Колдун", 17, 12, new int[] {-5,-5}, 30, 9, 1, x, y);
    }
}
