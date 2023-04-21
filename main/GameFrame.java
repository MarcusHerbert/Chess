package main;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    private Board board;

    public GameFrame () {
        setSize(getToolkit().getScreenSize().width, getToolkit().getScreenSize().height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        board = new Board(8, 8, Color.DARK_GRAY, Color.WHITE);
        add(board, BorderLayout.CENTER);

        setVisible(true);
    }

}
