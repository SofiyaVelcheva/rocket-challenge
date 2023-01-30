package guns;

import missiles.*;

public class AntiThermoGun extends Gun<Thermonuclear> {

    public AntiThermoGun() {
        super(Missile.MissileType.THERMONUCLEAR);
    }

    @Override
    public void neutralize(Thermonuclear missile) {
        System.out.println("Neutralize Thermonuclear");
    }

}
