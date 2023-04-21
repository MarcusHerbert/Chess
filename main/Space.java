package main;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Space extends JButton {

    Color myColor;

    public Space (Color c) {
        myColor = c;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        setBorder(new LineBorder(Color.BLACK));
        g2d.setColor(myColor);
        g2d.fill(new Rectangle(new Dimension(1000, 1000)));
    }
}
