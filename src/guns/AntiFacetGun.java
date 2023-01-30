package guns;

import missiles.*;

public class AntiFacetGun extends Gun<FacetBomb> {
    public AntiFacetGun() {
        super(Missile.MissileType.FACETBOMB);
    }

    @Override
    public void neutralize(FacetBomb missile) {
        System.out.println("Neutralize FacetBomb");
    }
}
