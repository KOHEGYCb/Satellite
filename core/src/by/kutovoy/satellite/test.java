package by.kutovoy.satellite;

import by.kutovoy.satellite.positions.NullPosition;

/**
 *
 * @author dmitry
 */
public class test {
    public static void main(String[] args) {
        System.out.println(NullPosition.getINSTANSE().toString());
        NullPosition.setINSTANSE_X(50);
        System.out.println(NullPosition.getINSTANSE().toString());
        NullPosition.setINSTANSE_X(25);
        System.out.println(NullPosition.getINSTANSE().toString());
    }
}
