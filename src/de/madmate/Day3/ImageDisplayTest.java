package de.madmate.Day3;

import javax.swing.*;
import java.awt.*;

/**
 * Created by markus on 12.10.16.
 */
public class ImageDisplayTest {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(800, 600);
        jFrame.setTitle("Image Display");
        jFrame.setVisible(true);

        ImageIcon imageIcon = new ImageIcon("resource/bg.png");
        JLabel jLabel = new JLabel(imageIcon);
        jLabel.setVisible(true);
    }
}
