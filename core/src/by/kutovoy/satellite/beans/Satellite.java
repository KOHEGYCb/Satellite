package by.kutovoy.satellite.beans;

import by.kutovoy.satellite.positions.NullPosition;
import by.kutovoy.satellite.positions.NullScale;
import by.kutovoy.satellite.positions.Position;
import by.kutovoy.satellite.positions.Size;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

/**
 *
 * @author dmitry
 */
public class Satellite extends Entity {

    private Planet planet;

//    public Satellite(Position position, String name){
//        super(position, Textures.TEXTURE_GREEN_SATELLITE, new Size(32, 32), name);
//    }
    
    public Satellite(Position position, Texture texture, String name){
        super(texture, new Size(32, 32), name);
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

    @Override
    public void setPosition(Position position) {
        
    }

    
}
