import java.awt.*;
import java.awt.event.*;
import java.until.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Calculator {
    int boardWidth = 360;
    int boardHeigth = 540;

    JFrame frame = new JFrame("Calculadora");

    Calculator(){
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeigth);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
    }
}
