package main;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    public Board () {
        setLayout(new GridLayout());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
