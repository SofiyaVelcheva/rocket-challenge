package missiles;

public abstract class Missile {
    private static int uniqueNumber = 0;
    private final int serialNumber;
    private final MissileType type;

    public enum MissileType {
        FACETBOMB,
        THERMONUCLEAR,
        TNTBOMB
    }

    public Missile(MissileType type) {
        this.serialNumber = ++uniqueNumber;
        this.type = type;
    }

    public MissileType getType() {
        return type;
    }

}
