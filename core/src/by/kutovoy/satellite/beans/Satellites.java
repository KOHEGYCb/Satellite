package by.kutovoy.satellite.beans;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dmitry
 */
public class Satellites {

    private static final List<Satellite> INSTANCE = new ArrayList<Satellite>();

    public static boolean isNewName(String name) {
        boolean isNew = true;
        for (Satellite satellite : INSTANCE) {
            if (satellite.getName().equals(name)) {
                isNew = false;
            }
        }
        return isNew;
    }

    public static Satellite getElementByName(String text) {
        for (Satellite satellite : INSTANCE) {
            if (text.equals(satellite.getName())) {
                return satellite;
            }
        }
        return null;
    }

    private Satellites() {
    }

    public static List<Satellite> getINSTANCE() {
        return INSTANCE;
    }

    public static void draw(Batch batch, BitmapFont font) {
        for (Satellite satellite : INSTANCE) {
            satellite.draw(batch, font);
        }
    }

    public static void dispose() {
        for (Satellite satellite : INSTANCE) {
            satellite.dispose();
        }
    }
}
