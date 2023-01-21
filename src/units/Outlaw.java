package units;

import units.Melee;

public class Outlaw extends Melee {
    public Outlaw(String name){
        super(name, "Разбойник", 8, 3, new int[] {2, 4}, 10, 6);
    }
}

