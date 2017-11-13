package by.kutovoy.satellite.beans;

import by.kutovoy.satellite.enums.Sizes;
import by.kutovoy.satellite.positions.NullPosition;
import by.kutovoy.satellite.positions.NullScale;
import by.kutovoy.satellite.positions.PlanetPosition;
import by.kutovoy.satellite.positions.Size;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 *
 * @author dmitry
 */
public class Satellite extends Entity {

    private Planet planet;          //задаем планету вокруг которой будет крутиться спутник
    private double tick = 0;        //задаем скорость вращения
    private final int radius;       //задаем радиус вращения
    
    public Satellite(int radius, Texture texture, String name){
        super(texture, new Size(32, 32), name);
        this.radius = radius;
        
    }
    
    public void draw(Batch batch, BitmapFont font) {            //отрисовка
        this.tick += 0.01;                                      //инкримент шага
        double sin = this.radius * NullScale.INSTANSE * Math.sin(tick);         //просчет местоположения; 4 строки
        double cos = this.radius * NullScale.INSTANSE * Math.cos(tick);
        double x = PlanetPosition.getCenter().getX() + NullPosition.getINSTANSE().getX() - Sizes.SATELLITE.getX()/2;
        double y = PlanetPosition.getCenter().getY() + NullPosition.getINSTANSE().getY() - Sizes.SATELLITE.getY()/2;
        //отрисовка иконки спутника
        batch.draw(getTexture(), (float)(sin + x), (float)(cos + y), getSize().getX() * (float) NullScale.INSTANSE, getSize().getY() * (float) NullScale.INSTANSE);
        //отрисовка шрифта
        font.draw(batch, this.getName(), (float)(sin + x), (float)(cos + y));
    }
    
}
