public class Peasant extends Hero{
    private int delivery;

    public Peasant(String name, String type, int attack, int defence, int[] damage, int hp, int speed, int delivery) {
        super(name, type, attack, defence, damage, hp, speed);
        this.delivery = delivery;
    }

    public Peasant(String name) {
        this(name, "Крестьянин", 1, 1, new int[] {1, 1}, 1, 3, 1);

    }

    public int getDelivery() {
        return delivery;
    }

    @Override
    public String toString(){
        return super.toString() + ", delivery= " + delivery;
    }
}