public class Enemy extends Creature{
    public Enemy(int x_position, int y_position, boolean alive, char graphic, String name, String charColor, String bgColor, int unconscious, int airCapacity, double blood, double poison, int speed, boolean canMove, boolean canAttack) {
        super(x_position, y_position, alive, graphic, name, charColor, bgColor, unconscious, airCapacity, blood, poison, speed, canMove, canAttack);
    }
}
