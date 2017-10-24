package by.kutovoy.satellite.enums;

/**
 *
 * @author dmitry
 */
public class Constants {

    private static int PLANET_RADIUS = 300;
    private static double SCALE = 1;
    private static int X = 0;
    private static int Y = 0;
    private static final double RAD_TO_DEG = 0.017452007;
    /**
     * @return the SCALE
     */
    public static double getSCALE() {
        return SCALE;
    }

    /**
     * @param aSCALE the SCALE to set
     */
    public static void setSCALE(double aSCALE) {
        SCALE = aSCALE;
    }

    /**
     * @return the X
     */
    public static int getX() {
        return X;
    }

    /**
     * @param aX the X to set
     */
    public static void setX(int aX) {
        X = aX;
    }

    /**
     * @return the Y
     */
    public static int getY() {
        return Y;
    }

    /**
     * @param aY the Y to set
     */
    public static void setY(int aY) {
        Y = aY;
    }

    /**
     * @return the RAD_TO_DEG
     */
    public static double getRAD_TO_DEG() {
        return RAD_TO_DEG;
    }
    
    public static double getPAD_TO_DEG(double a) {
        return a+RAD_TO_DEG;
    }

    private Constants() {
    }

    /**
     * @return the PLANET_RADIUS
     */
    public static int getPLANET_RADIUS() {
        return PLANET_RADIUS;
    }

    /**
     * @param aPLANET_WIDTH the PLANET_RADIUS to set
     */
    public static void setPLANET_RADIUS(int aPLANET_WIDTH) {
        PLANET_RADIUS = aPLANET_WIDTH;
    }

}
