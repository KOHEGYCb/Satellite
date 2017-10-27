package by.kutovoy.satellite.positions;

import by.kutovoy.satellite.enums.Sizes;

/**
 *
 * @author dmitry
 */
public class PlanetPosition{

    public static Position PlanetPosition;
    
    public static Position getCenter(){
        Position center = new Position(PlanetPosition.getX() + Sizes.Planet.getX()/2, PlanetPosition.getY() + Sizes.Planet.getY()/2);
        return center;
    }
    
}
