package by.kutovoy.satellite.beans;

import by.kutovoy.satellite.enums.Strings;
import by.kutovoy.satellite.positions.NullPosition;
import by.kutovoy.satellite.positions.NullScale;
import by.kutovoy.satellite.positions.Position;
import by.kutovoy.satellite.positions.Size;
import com.badlogic.gdx.graphics.g2d.Batch;

/**
 *
 * @author dmitry
 */
public class Satellite extends Entity {

    private Planet planet;

    public Satellite(Position position){
        super(position, Strings.IMAGE_SATELLITE_GREEN, new Size(32, 32));
    }
    
    @Override
    public void draw(Batch batch) {
        int x = getPosition().getX() + NullPosition.getINSTANSE().getX();
        int y = getPosition().getY() + NullPosition.getINSTANSE().getY();
        batch.draw(getTexture(), x, y, getSize().getX() * (float) NullScale.INSTANSE, getSize().getY() * (float) NullScale.INSTANSE);
    }

    @Override
    public String toString() {
        return "\nSatellite:\n   ID: " + getId();
    }

}
