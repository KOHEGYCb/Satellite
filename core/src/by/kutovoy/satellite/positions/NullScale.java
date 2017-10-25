package by.kutovoy.satellite.positions;

/**
 *
 * @author dmitry
 */
public class NullScale {
    
    public static double INSTANSE = 0;
    
    public static void setScale(double s){
        NullScale.INSTANSE = NullScale.INSTANSE + s;
    }
}
