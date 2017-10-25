package by.kutovoy.satellite;

import by.kutovoy.satellite.enums.Constants;

/**
 *
 * @author dmitry
 */
public class PlanetParameters {

    private static int RADIUS = 10;
    private static int X = 0;
    private static int Y = 0;

    /**
     * @return the RADIUS
     */
    public static int getRADIUS() {
        return (int) (Constants.getPLANET_RADIUS()*Constants.getSCALE() + PlanetParameters.RADIUS);
    }

    /**
     * @param aRADIUS the RADIUS to set
     */
    public static void setRADIUS(int aRADIUS) {
        RADIUS = (int) (Constants.getPLANET_RADIUS()*Constants.getSCALE() + PlanetParameters.RADIUS);
    }

    /**
     * @return the X
     */
    public static int getX() {
        return X + Constants.getX();
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
        return Y + Constants.getY();
    }

    /**
     * @param aY the Y to set
     */
    public static void setY(int aY) {
        Y = aY;
    }
    
    private PlanetParameters(){
        
    }
    
    
}
