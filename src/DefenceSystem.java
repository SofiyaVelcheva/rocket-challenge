import guns.*;
import missiles.*;

import java.util.ArrayList;
import java.util.List;

public class DefenceSystem {
    private final List<Gun> guns = new ArrayList<>();

    public DefenceSystem() {
        this.guns.add(new AntiTNTGun());
        this.guns.add(new AntiFacetGun());
        this.guns.add(new AntiThermoGun());
    }

    public void interceptMissile(Missile missile) {
        Gun interceptGun = null;
        for (Gun gun : guns) {
            if (missile.getType().equals(gun.getMissileType())) {
                interceptGun = gun;
            }
        }
        interceptGun.neutralize(missile);
    }
}
