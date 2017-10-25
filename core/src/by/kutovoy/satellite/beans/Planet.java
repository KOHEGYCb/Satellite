package by.kutovoy.satellite.beans;

import by.kutovoy.satellite.enums.Sizes;
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
public class Planet extends Entity {

    public Planet(Position position, Texture texture) {
        super(position, texture, Sizes.Planet);
    }

    @Override
    public void draw(Batch batch) {
        int x = getPosition().getX() + NullPosition.getINSTANSE().getX();
        int y = getPosition().getY() + NullPosition.getINSTANSE().getY();
        batch.draw(getTexture(), x, y, getSize().getX() * (float) NullScale.INSTANSE, getSize().getY() * (float) NullScale.INSTANSE);
    }

    @Override
    public String toString() {
        return "Planet:\n   ID: " + getId();
    }

}
