package by.kutovoy.satellite.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import by.kutovoy.satellite.MainClass;
import by.kutovoy.satellite.jFrames.Menu;
import javax.swing.JFrame;

public class DesktopLauncher {

    private static final int HEIGHT = 600;
    private static final int WIDTH = 600;

    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = WIDTH;
        config.height = HEIGHT;
        new LwjglApplication(new MainClass(), config);
        JFrame frame = new Menu();
        frame.setVisible(true);
    }
}
