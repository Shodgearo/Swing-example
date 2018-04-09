// Main class for feature width circles
// Маленькая программка. По нажатию на кнопку мыши создаём кружки, которые сами двигаются

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();
    }

    private JPanel canvas;
    private LinkedList<Oval> list;

    public Main() {
        canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

            }
        };

        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                list.add(new Oval(e));
            }
        });

        initFrame();
    }

    private void initFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700, 550));
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
