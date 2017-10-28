package by.kutovoy.satellite;

import by.kutovoy.satellite.beans.Planet;
import by.kutovoy.satellite.beans.Satellites;
import by.kutovoy.satellite.enums.Textures;
import by.kutovoy.satellite.positions.Position;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainClass extends ApplicationAdapter {

    private SpriteBatch batch;
    private Planet planet;

    @Override
    public void create() {
        batch = new SpriteBatch();
        planet = new Planet(new Position(200, 200), Textures.TEXTURE_PLANET_EARTH);
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        planet.draw(batch);
        Satellites.draw(batch);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        planet.dispose();
        Satellites.dispose();
    }
}
