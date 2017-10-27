package by.kutovoy.satellite;

import by.kutovoy.satellite.enums.Constants;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GDX extends ApplicationAdapter {

    SpriteBatch batch;
    Texture img;
    Satellite111 s;

    @Override
    public void create() {
        batch = new SpriteBatch();
        img = new Texture("earth.png");
        s = new Satellite111();
    }

    int timer = 0;
    double x = 0;
    double y = 0;
    double deg = 0;
    double k = 1;
    boolean _k = true;
    
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
        deg += Math.PI/360;
        k=2;
//        if (k >= 2){
//            k -= 1/180;
//        }
//        else{
//            if (k<= 1){
//             k += 1/180;
//         } 
//        }
        
        x = 100+k*Math.sin(deg) * 100;
        y = 1.5*Math.cos(deg) * 100;

        batch.begin();
		batch.draw(img, PlanetParameters.getX(), PlanetParameters.getY(), PlanetParameters.getRADIUS(), PlanetParameters.getRADIUS());
//		batch.draw(s.getTexture(), (s.getxPos()+PlanetParameters.getX()), (s.getyPos()+PlanetParameters.getY()));
        batch.draw(s.getTexture(), (float)x + 200, (float) y + 200, 16, 16);
        batch.end();
//            deg = Constants.getPAD_TO_DEG(deg);
//            System.out.println("Scale" + Constants.getSCALE());
//            System.out.println("Radius" + PlanetParameters.getRADIUS());
//            System.out.println("X" + x1);
//            System.out.println("Y" + y1);
////            System.out.println("rad" + deg + ": deg "+ Math.toDegrees(deg) + "\n");
//            timer = 0;
//        }
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }
}
