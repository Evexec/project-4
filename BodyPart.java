public class BodyPart {
    Creature parent;
    String name;
    int durability;
    int lastDamageType; // 1 = blunt, 2 = slashing, 3 = piercing, 4 = fire, 5 = ice, 6 = shock, 7 = generic majykks
    int[] resistances;
    int functional;
    boolean intact;
    boolean canGrab;
    boolean canWalk;
    boolean vital;

    public BodyPart(Creature parent, String name, int durability, int lastDamageType, int[] resistances, int functional, boolean intact, boolean canGrab, boolean canWalk, boolean vital) {
        this.parent = parent;
        this.name = name;
        this.durability = durability;
        this.lastDamageType = lastDamageType;
        this.resistances = resistances;
        this.functional = functional;
        this.intact = intact;
        this.canGrab = canGrab;
        this.canWalk = canWalk;
        this.vital = vital;
    }
}
