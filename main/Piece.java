package main;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public interface Piece {

    int value();
    Color getColor();
    ArrayList<Move> possibleMoves();
    ImageIcon getImage();

}
