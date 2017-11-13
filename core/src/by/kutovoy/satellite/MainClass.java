package by.kutovoy.satellite;

import by.kutovoy.satellite.beans.Planet;
import by.kutovoy.satellite.beans.Satellites;
import by.kutovoy.satellite.enums.Textures;
import by.kutovoy.satellite.positions.Position;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainClass extends ApplicationAdapter {

//    private SpriteBatch batch;
    private Planet planet;      //создание объекта планеты
    private BitmapFont font;    //создание шрифтов

    @Override
    public void create() {                                                          //метод запускается при создании окна отрисовки, выполняется 1 раз для инициализации всех переменных
        planet = new Planet(new Position(200, 200), Textures.TEXTURE_PLANET_EARTH); //создаем планету, задаем позицию отображения и текстуру
        font = new BitmapFont();                                                    //создание шрифта
        font.setColor(Color.WHITE);                                                 //применение цвета для шрифта
    }

    @Override
    public void render() {                          //метод вызывается для отрисовки каждого кадра
        Gdx.gl.glClearColor(0, 0, 0, 1);            //задание черного фона для области отрсовки
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);   //обнуление цвета       

        Batch.INSTANCE.begin();                     //запускаем возможность отрисовки объектов
        planet.draw(Batch.INSTANCE);                //выполняем отрисовку планеты
        Satellites.draw(Batch.INSTANCE, font);      //выполняем отрисовку всех спутников
        Batch.INSTANCE.end();                       //выходим из отрисовки

    }

    @Override
    public void dispose() {                         //выполняется при завершении выполнения приложения
        Batch.INSTANCE.dispose();                   //отключение отрисовки
        planet.dispose();                           //выгрузка планеты
        Satellites.dispose();                       //выгрузка спутников
        font.dispose();                             //выгрузки шрифта
    }
}
