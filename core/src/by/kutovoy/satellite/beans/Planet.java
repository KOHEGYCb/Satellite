package by.kutovoy.satellite.beans;

import by.kutovoy.satellite.enums.Sizes;
import by.kutovoy.satellite.positions.NullPosition;
import by.kutovoy.satellite.positions.NullScale;
import by.kutovoy.satellite.positions.PlanetPosition;
import by.kutovoy.satellite.positions.Position;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

/**
 *
 * @author dmitry
 */
public class Planet extends Entity {

    public Planet(Position position, Texture texture) {
        super(position, texture, Sizes.PLANET, "Earth");
        PlanetPosition.PlanetPosition = position;
    }

    @Override
    public void draw(Batch batch) {
        int x = getPosition().getX() + NullPosition.getINSTANSE().getX();
        int y = getPosition().getY() + NullPosition.getINSTANSE().getY();
        batch.draw(getTexture(), x, y, getSize().getX() * (float) NullScale.INSTANSE, getSize().getY() * (float) NullScale.INSTANSE);
    }

}
