package main;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    Space[][] spaces;

    public Board (int h, int w, Color c1, Color c2) {
        setLayout(new GridLayout());
        spaces = new Space[h][w];
        Color[] colors = {c1, c2};
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                spaces[i][j] = new Space(colors[(i+j)%colors.length]);
            }
        }
        setLayout(new GridLayout(h, w));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Space[] arr: spaces) {
            for (Space s: arr) {
                add(s);
            }
        }
    }
}
