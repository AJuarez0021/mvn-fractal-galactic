package com.work.graphics.mvn.fractal.galactic;

import javax.swing.SwingUtilities;

/**
 *
 * @author linux
 */
public class Main {

    public static void main(String[] args) {
       SwingUtilities.invokeLater(() -> Galactic.createWin("Galactic", 640, 480));
    }
}
