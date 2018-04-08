// Main class for feature width circles
// ��������� ����������. �� ������� �� ������ ���� ������ ������, ������� ���� ���������

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
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
