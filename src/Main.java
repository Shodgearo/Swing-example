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

    private JPanel panel;
    private LinkedList<Oval> list;

    public Main() {
        list = new LinkedList<Oval>();

        initPanel();
        initFrame();
    }

    private void initPanel() {
        final int diametr = 30;

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                if (!list.isEmpty()) {
                    for (Oval oval : list) {
                        g.fillOval(oval.getX() - diametr / 2, oval.getY() - diametr / 2, diametr, diametr);
                    }
                }
            }
        };

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                list.add(new Oval(e, Main.this));

                repaint();
            }
        });

        add(panel);
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
