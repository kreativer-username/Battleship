package battleships;

public enum Ships {
    CARRIER(4), BATTLESHIP(5), DESTROYER(3), SUBMARINE(2);

    final int length;

    Ships(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return this.name() + "[" + this.length + "]";
    }
}
