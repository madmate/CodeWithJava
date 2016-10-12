package de.madmate.Day3;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
public class JFrameTut {
    static BufferedImage name;

    public JFrameTut(){
        JFrame jf1 = new JFrame();
        Label lbl1 = new Label();
        JButton btn1 = new JButton();
        jf1.setSize(800, 600);
        jf1.setLayout(null);
        jf1.setTitle("Prowo");
        jf1.setVisible(true);
        jf1.add(lbl1);
        jf1.add(btn1);
        lbl1.setBounds(0, 0, 800, 600);
        lbl1.setVisible(true);
        btn1.setVisible(true);
        btn1.setText("Hallo");
        btn1.setBounds(30, 30, 100, 50);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.GREEN);
        btn1.setFont(new Font("Ubuntu", Font.BOLD, 20));

        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                super.mouseEntered(mouseEvent);
                btn1.setBackground(Color.RED);
                btn1.setForeground(Color.YELLOW);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                //super.mouseExited(mouseEvent);
                btn1.setBackground(Color.BLACK);
                btn1.setForeground(Color.GREEN);
            }
        });
        try {
            name = ImageIO.read(new File("resource/bg.png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Bilder nicht geladen");

        }
    }
}


