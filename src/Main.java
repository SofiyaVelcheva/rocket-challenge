import missiles.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DefenceSystem defenceSystem = new DefenceSystem();
        Missile missile = null;

        while (true) {
            int random = new Random().nextInt(0, Missile.MissileType.values().length);
            switch (random) {
                case 0 -> missile = new FacetBomb();
                case 1 -> missile = new TNTBomb();
                case 2 -> missile = new Thermonuclear();
            }
            defenceSystem.interceptMissile(missile);
            Thread.sleep(3000);
        }
    }
}