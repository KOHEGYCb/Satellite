package by.kutovoy.satellite;

import by.kutovoy.satellite.beans.Planet;
import by.kutovoy.satellite.beans.Satellite;
import by.kutovoy.satellite.beans.Satellites;
import by.kutovoy.satellite.enums.Strings;
import by.kutovoy.satellite.positions.NullPosition;
import by.kutovoy.satellite.positions.Position;
import com.badlogic.gdx.graphics.Texture;
import javax.swing.JPanel;

/**
 *
 * @author dmitry
 */
public class test {
    public static void main(String[] args) {
        Planet planet = new Planet(new Position(0,1), null);
        System.out.println(planet);
        planet = new Planet(new Position(0,1), null);
        System.out.println(planet);
        
        
        
        
        
    }
}
