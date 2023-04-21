package main;

public class Main {

    public static void main (String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> startGame());
    }

    public static void startGame () {
        GameFrame frame = new GameFrame();
    }

}
