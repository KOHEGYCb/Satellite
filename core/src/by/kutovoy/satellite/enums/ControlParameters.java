package by.kutovoy.satellite.enums;

/**
 *
 * @author dmitry
 */
public class ControlParameters {

    /**
     * @return the BTN_WIDTH
     */
    public static int getBTN_WIDTH() {
        return BTN_WIDTH;
    }

    /**
     * @return the BTN_HEIGHT
     */
    public static int getBTN_HEIGHT() {
        return BTN_HEIGHT;
    }

    /**
     * @return the X_STEP
     */
    public static int getX_STEP() {
        return X_STEP;
    }

    /**
     * @return the Y_STEP
     */
    public static int getY_STEP() {
        return Y_STEP;
    }

    /**
     * @return the SCALE_STEP
     */
    public static double getSCALE_STEP() {
        return SCALE_STEP;
    }

    private ControlParameters(){}
    
    //константы перемежения камеры и размера кнопок
    private static final int BTN_WIDTH = 42;
    private static final int BTN_HEIGHT = 42;
    
    private static final int X_STEP = 50;
    private static final int Y_STEP = 50;
    
    private static final double SCALE_STEP = 0.1;
    
    
}
