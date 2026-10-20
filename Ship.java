public class Ship {
    private int Length;
    private int x_coordinate;
    private int y_coordinate;
    private boolean horizontal;
    private String name;  
 
    public Ship(String name, int length, int x, int y, boolean horizontal) {
        this.name = name;
        this.Length = length;
        this.x_coordinate = x;
        this.y_coordinate = y;
        this.horizontal = horizontal;
    }

    public void setShip(Board board) {
        if (horizontal) {
            for (int i = 0; i < Length; i++) {
                board.setShip(x_coordinate, y_coordinate + i);
            }
        } else {
            for (int i = 0; i < Length; i++) {
                board.setShip(x_coordinate + i, y_coordinate, name.charAt(0));
            }
        }

    }
    public int getLength() {
        return Length;
    }

    public int getX() {
        return x_coordinate;
    }

    public int getY() {
        return y_coordinate;
    }

    public boolean isHorizontal() {
        return horizontal;
    }
}
 