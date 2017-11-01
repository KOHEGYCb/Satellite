package by.kutovoy.satellite.beans;

import by.kutovoy.satellite.enums.Sizes;
import by.kutovoy.satellite.positions.NullPosition;
import by.kutovoy.satellite.positions.NullScale;
import by.kutovoy.satellite.positions.PlanetPosition;
import by.kutovoy.satellite.positions.Size;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 *
 * @author dmitry
 */
public class Satellite extends Entity {

    private Planet planet;
    private double tick = 0;
    private final int radius;
    
    public Satellite(int radius, Texture texture, String name){
        super(texture, new Size(32, 32), name);
        this.radius = radius;
        
    }
    
    public void draw(Batch batch, BitmapFont font) {
        this.tick += 0.01;
        double sin = this.radius * NullScale.INSTANSE * Math.sin(tick);
        double cos = this.radius * NullScale.INSTANSE * Math.cos(tick);
        double x = PlanetPosition.getCenter().getX() + NullPosition.getINSTANSE().getX() - Sizes.SATELLITE.getX()/2;
        double y = PlanetPosition.getCenter().getY() + NullPosition.getINSTANSE().getY() - Sizes.SATELLITE.getY()/2;
        batch.draw(getTexture(), (float)(sin + x), (float)(cos + y), getSize().getX() * (float) NullScale.INSTANSE, getSize().getY() * (float) NullScale.INSTANSE);
        font.draw(batch, this.getName(), (float)(sin + x), (float)(cos + y));
        
    }
    
}
