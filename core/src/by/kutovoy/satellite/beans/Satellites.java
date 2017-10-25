package by.kutovoy.satellite.beans;

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

    public void addSatellite(Satellite satellite){
        INSTANCE.add(satellite);
    }
    
    public void removeSatellite(Satellite satellite){
        INSTANCE.remove(satellite.getId());
    }
}
