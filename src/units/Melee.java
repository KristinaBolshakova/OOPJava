package units;
import java.util.ArrayList;

public class Melee extends BaseHero {
    public Melee(ArrayList<BaseHero> heroTeam,  String name, String type, int attack, int defence, int[] damage, int health, int speed, int x, int y) {
        super(heroTeam, name, type, attack, defence, damage, health, speed, x, y);
    }
}
