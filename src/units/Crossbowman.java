package units;
import java.util.ArrayList;

public class Crossbowman extends Archer {
    public Crossbowman(ArrayList<BaseHero> heroTeam, String name, int x, int y){
        super(heroTeam, name, "Арбалетчик", 6, 3, 16, new int[]{8, 10}, 10, 4, x, y);
    }
}
