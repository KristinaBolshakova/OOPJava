package units;

public class Archer extends BaseHero {
        protected int shoots;
        public Archer(String name, String type, int attack, int defence, int shoots, int[] damage, int health, int speed) {
            super(name, type, attack, defence, damage, health, speed);
            this.shoots = shoots;
        }


    @Override
        public String toString() {
            return super.toString() + "shoots=" + shoots;
        }
    }


