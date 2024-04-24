public class Entity {
    int x_position;
    int y_position;
    boolean alive;
    char graphic;
    String name;
    String charColor;
    String bgColor;

    public Entity(int x_position, int y_position, boolean alive, char graphic, String name, String charColor, String bgColor) { 
        this.x_position = x_position;
        this.y_position = y_position;
        this.alive = alive;
        this.graphic = graphic;
        this.name = name;
        this.charColor = charColor;
        this.bgColor = bgColor;
    }

    public int getX_position() {
        return x_position;
    }

    public void setX_position(int x_position) {
        this.x_position = x_position;
    }

    public int getY_position() {
        return y_position;
    }

    public void setY_position(int y_position) {
        this.y_position = y_position;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public char getGraphic() {
        return graphic;
    }

    public void setGraphic(char graphic) {
        this.graphic = graphic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharColor() {
        return charColor;
    }

    public void setCharColor(String charColor) {
        this.charColor = charColor;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }
}
