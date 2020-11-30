package battleships;

public class Position {
    private final int x;
    private final char y;

    public Position(int x, char y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public char getY() {
        return y;
    }

}
