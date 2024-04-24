public class Item extends Entity {
    int value;

    public Item(int x_position, int y_position, boolean alive, char graphic, String name, String charColor, String bgColor, int value) {
        super(x_position, y_position, alive, graphic, name, charColor, bgColor);
        this.value = value;
    }
}
