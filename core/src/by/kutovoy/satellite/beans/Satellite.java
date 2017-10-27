package by.kutovoy.satellite.beans;

import by.kutovoy.satellite.enums.Sizes;
import by.kutovoy.satellite.positions.NullPosition;
import by.kutovoy.satellite.positions.NullScale;
import by.kutovoy.satellite.positions.PlanetPosition;
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
    private double tick = 0;
    private int radius;
//    public Satellite(Position position, String name){
//        super(position, Textures.TEXTURE_GREEN_SATELLITE, new Size(32, 32), name);
//    }
    
    public Satellite(int radius, Texture texture, String name){
        super(texture, new Size(32, 32), name);
        this.radius = radius;
    }
    
    @Override
    public void draw(Batch batch) {
        this.tick += 0.01;
        double sin = this.radius * NullScale.INSTANSE * Math.sin(tick);
        double cos = this.radius * NullScale.INSTANSE * Math.cos(tick);
        double x = PlanetPosition.getCenter().getX() + NullPosition.getINSTANSE().getX() - Sizes.Satellite.getX()/2;
        double y = PlanetPosition.getCenter().getY() + NullPosition.getINSTANSE().getY() - Sizes.Satellite.getY()/2;
        batch.draw(getTexture(), (float)(sin + x), (float)(cos + y), getSize().getX() * (float) NullScale.INSTANSE, getSize().getY() * (float) NullScale.INSTANSE);
    }

    @Override
    public String toString() {
        return "Satellite:\n   ID: " + getId();
    }
    
}
