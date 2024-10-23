import javax.swing.*;
import javax.swing.plaf.basic.BasicTextAreaUI;
import java.awt.*;

public class Main {

    JButton open = new JButton("Open");
    JButton close = new JButton("Modify");
    JButton save = new JButton("Save");

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 600);

        //Pulsanti principlai della barra superiore



        JTextArea textArea = new JTextArea();

        open.setLayout();

        f.setVisible(true);
    }
}