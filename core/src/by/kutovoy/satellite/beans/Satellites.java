package by.kutovoy.satellite.beans;

import com.badlogic.gdx.graphics.g2d.Batch;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dmitry
 */
public class Satellites {

    private static final List<Satellite> INSTANCE = new ArrayList<Satellite>();

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
    
    public void draw(Batch bath){
        for (Satellite satellite : INSTANCE){
            
        }
    }
    
    public void dispose(){
        for (Satellite satellite : INSTANCE){
            satellite.dispose();
        }
    }
}
