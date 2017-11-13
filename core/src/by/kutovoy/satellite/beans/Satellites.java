package by.kutovoy.satellite.beans;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dmitry
 */
public class Satellites {

    private static final List<Satellite> INSTANCE = new ArrayList<Satellite>(); //создание константы списка спутников

    public static boolean isNewName(String name) {          //метод для определения нового имени спутника
        boolean isNew = true;                               
        for (Satellite satellite : INSTANCE) {              //перечисляем все имеющиеся спутники и сравниваем между искомым совпадения по названию 
            if (satellite.getName().equals(name)) {
                isNew = false;                              //если названия совпали, то возвращаем false
            }
        }
        return isNew;
    }

    public static Satellite getElementByName(String text) {     //метод для вызова спутника по имени
        for (Satellite satellite : INSTANCE) {
            if (text.equals(satellite.getName())) {
                return satellite;
            }
        }
        return null;
    }

    private Satellites() {
    }

    public static List<Satellite> getINSTANCE() {               //возвращаем список спутников
        return INSTANCE;
    }

    public static void draw(Batch batch, BitmapFont font) {     //отрисовка спутников
        for (Satellite satellite : INSTANCE) {
            satellite.draw(batch, font);                        //каждый спутник по отдельности отрисовывается
        }
    }

    public static void dispose() {                              //выгрузка спутников из памяти
        for (Satellite satellite : INSTANCE) {
            satellite.dispose();
        }
    }
}
