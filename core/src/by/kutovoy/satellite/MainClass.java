package by.kutovoy.satellite;

import by.kutovoy.satellite.beans.Planet;
import by.kutovoy.satellite.beans.Satellite;
import by.kutovoy.satellite.beans.Satellites;
import by.kutovoy.satellite.enums.Constants;
import by.kutovoy.satellite.enums.Strings;
import by.kutovoy.satellite.enums.Textures;
import by.kutovoy.satellite.positions.Position;
import by.kutovoy.satellite.positions.Size;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.util.ArrayList;
import java.util.List;

public class MainClass extends ApplicationAdapter {

    private SpriteBatch batch;
    private Planet planet;
//    private List<Texture> satellitesTexture = new ArrayList<Texture>();

    @Override
    public void create() {
        batch = new SpriteBatch();
        planet = new Planet(new Position(200, 200), Textures.TEXTURE_PLANET_EARTH);
//        
//        satellitesTexture.add(new Texture(Strings.IMAGE_SATELLITE_GREEN));
//        satellitesTexture.add(new Texture(Strings.IMAGE_SATELLITE_RED));
//        satellitesTexture.add(new Texture(Strings.IMAGE_SATELLITE_YELLOW));

//        Satellites.getINSTANCE().add(new Satellite(new Position(200, 200)));
//        s = new Satellite();
    }

//    int timer = 0;
//    double x = 0;
//    double y = 0;
//    double deg = 0;
//    int timer = 0;
//    double x = 0;
//    double y = 0;
//    double deg = 0;
    @Override
    public void render() {
//        timer++;
//        if (timer > 5) {
//            if (x > 1) {
//                x = -1;
//            }
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//            x = x + 0.01;
//            y = (1 - x * x);
//            if (y <= 0) {
//                y = y * (-1);
//                y = Math.sqrt(y);
//                y = y * (-1);
//            } else {
//                y = Math.sqrt(y);
//            }
//            double x1 = x * PlanetParameters.getRADIUS(), y1 = y * PlanetParameters.getRADIUS();
        batch.begin();
        planet.draw(batch);
        Satellites.draw(batch);
//            batch.draw(img, PlanetParameters.getX(), PlanetParameters.getY(), PlanetParameters.getRADIUS(), PlanetParameters.getRADIUS());
//		batch.draw(s.getTexture(), (s.getxPos()+PlanetParameters.getX()), (s.getyPos()+PlanetParameters.getY()));
//            batch.draw(s.getTexture(), (int) x1 + PlanetParameters.getX(), (int) y1 + PlanetParameters.getY(), 16, 16);
        batch.end();
//            deg = Constants.getPAD_TO_DEG(deg);
//            System.out.println("Scale" + Constants.getSCALE());
//            System.out.println("Radius" + PlanetParameters.getRADIUS());
//            System.out.println("X" + x1);
//            System.out.println("Y" + y1);
//            System.out.println("rad" + deg + ": deg "+ Math.toDegrees(deg) + "\n");
//            timer = 0;
//        }
    }

    @Override
    public void dispose() {
        batch.dispose();
        planet.dispose();
        Satellites.dispose();
    }
}
