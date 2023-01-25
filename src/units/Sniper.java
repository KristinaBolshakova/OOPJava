package units;


import java.util.ArrayList;

public class Sniper extends Archer {

    public Sniper(ArrayList<BaseHero> heroTeam, String name, int x, int y){
        super(heroTeam, name, "Снайпер", 12, 10, 32, new int[] {8, 10}, 15, 9, x, y);
    }

    public static class Vector2 {
        int x,y;

        public Vector2(int x, int y){
            this.x = x;
            this.y = y;
        }
        public boolean isEquals(Vector2 opposit){
            if (opposit.y == y && opposit.x == x) return true;
            return false;
        }
    }
}
