package units;

public class Magic extends BaseHero {
    private int magic;

    public Magic(String name, String type, int attack, int defence, int[] damage, int health, int speed, int magic) {
        super(name, type, attack, defence, damage, health, speed);
        this.magic = magic;
    }

    public Magic() {
        super("name", "type", 1, 1, new int[]{1, 1}, 1, 1);
        this.magic = 1;
    }

    @Override
    public String toString() {
        return super.toString() +
                "magic=" + magic;
    }
}
