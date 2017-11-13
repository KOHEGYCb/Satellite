package by.kutovoy.satellite.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import by.kutovoy.satellite.MainClass;
import by.kutovoy.satellite.jFrames.Menu;
import javax.swing.JFrame;

public class DesktopLauncher {

    private static final int HEIGHT = 600;  //объявление константы на высоту отображаемой области
    private static final int WIDTH = 600;   //объявление константы на ширину отображаемой области

    public static void main(String[] arg) { //начало выполнения программы
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration(); //создание объекта конфигурации
        config.width = WIDTH;               //задание ширины экрана
        config.height = HEIGHT;             //задание высоты экрана
        new LwjglApplication(new MainClass(), config);  //создание экрана
        JFrame frame = new Menu();          //создание меню
        frame.setVisible(true);             //отображение меню
    }
}
