package by.kutovoy.satellite.beans;

import by.kutovoy.satellite.positions.NullPosition;
import by.kutovoy.satellite.positions.NullScale;
import com.badlogic.gdx.graphics.g2d.Batch;
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
        for (Satellite satellite : INSTANCE){
            if(satellite.getName().equals(name)){
                isNew = false;
            }
        }
        return isNew;
    }

    public static Satellite getElementByName(String text) {
        for (Satellite satellite :INSTANCE){
            if (text.equals(satellite.getName())){
                return satellite;
            }
        }
        return null;
    }

    private  Satellites() {}
    
    public static List<Satellite> getINSTANCE(){
        return INSTANCE;
    }
    
    @Override
    public String toString(){
        String str = "";
        for (Satellite INSTANCE1 : INSTANCE) {
            str = str + INSTANCE1 + "\n";
        }
        return str;
    }
    
    public static void draw(Batch batch){
        for (Satellite satellite : INSTANCE){
            satellite.draw(batch);
//            int x = satellite.getPosition().getX() + NullPosition.getINSTANSE().getX();
//        int y = satellite.getPosition().getY() + NullPosition.getINSTANSE().getY();
//        batch.draw(satellite.getTexture(), x, y, satellite.getSize().getX() * (float) NullScale.INSTANSE, satellite.getSize().getY() * (float) NullScale.INSTANSE);
        }
    }
    
    public static void dispose(){
        for (Satellite satellite : INSTANCE){
            satellite.dispose();
        }
    }
}
