package by.kutovoy.satellite;

import com.badlogic.gdx.graphics.Texture;

/**
 *
 * @author dmitry
 */
public class Satellite {

    private int xPos;
    private int yPos;
    private Texture texture;
    private int h;
    private int m;

    public Satellite() {
        this.xPos = 1;
        this.yPos = 0;
        this.h = PlanetParameters.getRADIUS() + 100;
        m = 10000;
        texture = new Texture("satellite_red.png");
    }
    
    public Satellite(int xPos, int yPos, int h, int m){
        
    }

    /**
     * @return the xPos
     */
    public int getxPos() {
        return xPos;
    }

    /**
     * @param xPos the xPos to set
     */
    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    /**
     * @return the yPos
     */
    public int getyPos() {
        return yPos;
    }

    /**
     * @param yPos the yPos to set
     */
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    /**
     * @return the texture
     */
    public Texture getTexture() {
        return texture;
    }

    /**
     * @param texture the texture to set
     */
    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    /**
     * @return the h
     */
    public int getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(int h) {
        this.h = h;
    }

    /**
     * @return the m
     */
    public int getM() {
        return m;
    }

    /**
     * @param m the m to set
     */
    public void setM(int m) {
        this.m = m;
    }
    
}
