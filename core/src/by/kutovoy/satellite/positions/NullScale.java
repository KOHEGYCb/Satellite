package by.kutovoy.satellite.positions;

/**
 *
 * @author dmitry
 */
public class NullScale {
    
    //нулевой масштаб
    public static double INSTANSE = 1;
    
    public static void setScale(double s){
        NullScale.INSTANSE = NullScale.INSTANSE + s;
    }
}
