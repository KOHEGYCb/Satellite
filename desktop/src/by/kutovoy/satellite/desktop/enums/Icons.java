/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kutovoy.satellite.desktop.enums;

import javax.swing.ImageIcon;

/**
 *
 * @author dmitry
 */
public class Icons {

    /**
     * @return the BTN_ICON_UP
     */
    public static ImageIcon getBTN_ICON_UP() {
        return BTN_ICON_UP;
    }

    /**
     * @return the BTN_ICON_DOWN
     */
    public static ImageIcon getBTN_ICON_DOWN() {
        return BTN_ICON_DOWN;
    }

    /**
     * @return the BTN_ICON_LEFT
     */
    public static ImageIcon getBTN_ICON_LEFT() {
        return BTN_ICON_LEFT;
    }

    /**
     * @return the BTN_ICON_RIGHT
     */
    public static ImageIcon getBTN_ICON_RIGHT() {
        return BTN_ICON_RIGHT;
    }

    private Icons() {
    }

    private static final ImageIcon BTN_ICON_UP = new ImageIcon(Strings.getBTN_ICON_CLICK_UP());
    private static final ImageIcon BTN_ICON_DOWN = new ImageIcon(Strings.getBTN_ICON_CLICK_DOWN());
    private static final ImageIcon BTN_ICON_LEFT = new ImageIcon(Strings.getBTN_ICON_CLICK_LEFT());
    private static final ImageIcon BTN_ICON_RIGHT = new ImageIcon(Strings.getBTN_ICON_CLICK_RIGHT());

}
