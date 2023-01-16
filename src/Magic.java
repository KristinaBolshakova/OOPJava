public class Magic extends Hero {
    private int magic;

    public Magic(String name, String type, int attack, int defence, int[] damage, int hp, int speed, int magic) {
        super(name, type, attack, defence, damage, hp, speed);
        this.magic = magic;
    }

    @Override
    public String toString() {
        return super.toString() +
                "magic=" + magic;
    }
}
