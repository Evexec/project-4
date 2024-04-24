public class Creature extends Entity {
    int unconscious;
    int airCapacity;
    int currentAir;
    double blood;
    double poison;
    int speed;
    boolean canMove;
    boolean canAttack;

    public Creature(int x_position, int y_position, boolean alive, char graphic, String name, String charColor, String bgColor, int unconscious, int airCapacity, double blood, double poison, int speed, boolean canMove, boolean canAttack) {
        super(x_position, y_position, alive, graphic, name, charColor, bgColor);
        this.unconscious = unconscious;
        this.airCapacity = airCapacity;
        this.currentAir = airCapacity;
        this.blood = blood;
        this.poison = poison;
        this.speed = speed;
        this.canMove = canMove;
        this.canAttack = canAttack;
    }

    public int getUnconscious() {
        return unconscious;
    }

    public void setUnconscious(int unconscious) {
        this.unconscious = unconscious;
    }

    public int getAirCapacity() {
        return airCapacity;
    }

    public void setAirCapacity(int airCapacity) {
        this.airCapacity = airCapacity;
    }

    public double getBlood() {
        return blood;
    }

    public void setBlood(double blood) {
        this.blood = blood;
    }

    public double getPoison() {
        return poison;
    }

    public void setPoison(double poison) {
        this.poison = poison;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isCanMove() {
        return canMove;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    public boolean isCanAttack() {
        return canAttack;
    }

    public void setCanAttack(boolean canAttack) {
        this.canAttack = canAttack;
    }


    public void wakingTick(int num){
        this.unconscious -= num;
    }

    public void breathingTick(int num){
        this.currentAir -= num;
    }

    public void bloodLoss(double doubleNum){
        this.blood -= doubleNum;
    }

    public void poisonLoss(double doubleNum){
        this.poison -= doubleNum;
    }



    public boolean move(int x, int y){
        if ((int) Math.sqrt((x^2) + (y^2)) <= speed){
            this.x_position += x;
            this.y_position += y;
            return true;
        }
        return false;
    }


}
