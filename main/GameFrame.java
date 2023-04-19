package main;

import javax.swing.*;

public class GameFrame extends JFrame {

    private Board board;

    public GameFrame () {
        setSize(getToolkit().getScreenSize().width, getToolkit().getScreenSize().height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        board = new Board();
        add(board);

        setVisible(true);
    }

}
