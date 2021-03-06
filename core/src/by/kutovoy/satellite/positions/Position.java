package by.kutovoy.satellite.positions;

/**
 *
 * @author dmitry
 */
public class Position {
    
    private int x;
    private int y;
    
    public Position(){
        this.x = 0;
        this.y = 0;
    }
    
    public Position(int x, int y){
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
