package guns;

import missiles.*;

public class AntiTNTGun extends Gun<TNTBomb> {
    public AntiTNTGun() {
        super(Missile.MissileType.TNTBOMB);
    }

    @Override
    public void neutralize(TNTBomb missile) {
        System.out.println("Neutralize TNTbomb");
    }
}
