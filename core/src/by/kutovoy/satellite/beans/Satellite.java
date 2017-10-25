package by.kutovoy.satellite.beans;

import by.kutovoy.satellite.positions.Position;
import com.badlogic.gdx.graphics.g2d.Batch;

/**
 *
 * @author dmitry
 */
public class Satellite extends Entity{
    
    private Planet planet;
    private Position position;
    

    @Override
    public void draw(Batch batch) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "\nSatellite:\n   ID: " + getId();
    }
    
}
