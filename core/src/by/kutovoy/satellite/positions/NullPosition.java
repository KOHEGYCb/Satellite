package by.kutovoy.satellite.positions;

/**
 *
 * @author dmitry
 */
public class NullPosition {

    private static Position INSTANSE = new Position(0, 0);

    private NullPosition() {}

    public static Position getINSTANSE() {
        return INSTANSE;
    }

    public static void setINSTANSE(Position position) {
        NullPosition.INSTANSE = position;
    }

    public static void setINSTANSE_X(int x) {
        NullPosition.INSTANSE.setX(NullPosition.INSTANSE.getX() + x);
    }

    public static void setINSTANSE_Y(int y) {
        NullPosition.INSTANSE.setY(NullPosition.INSTANSE.getY() + y);
    }
}
