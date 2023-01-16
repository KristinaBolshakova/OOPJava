public class Archer extends Hero{
        private int shoots;
        public Archer(String name, String type, int attack, int defence, int shoots, int[] damage, int hp, int speed) {
            super(name, type, attack, defence, damage, hp, speed);
            this.shoots = shoots;
        }

        @Override
        public String toString() {
            return super.toString() + "shoots=" + shoots;
        }
    }


