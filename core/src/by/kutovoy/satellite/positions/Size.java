package by.kutovoy.satellite.positions;

/**
 *
 * @author dmitry
 */
public class Size {

    private int x;
    private int y;

    public Size() {
        this.x = 0;
        this.y = 0;
    }

    public Size(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
}
