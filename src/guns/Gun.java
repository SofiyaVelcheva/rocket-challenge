package guns;

import missiles.Missile;

public abstract class Gun<T extends Missile> {
    private final Missile.MissileType missileType;

    public Gun(Missile.MissileType missile) {
        this.missileType = missile;
    }

    public abstract void neutralize(T missile);

    public Missile.MissileType getMissileType() {
        return missileType;
    }
}
