// Class for description ovals

import java.awt.event.MouseEvent;

public class Oval {
    private MouseEvent event;
    private int x, y;

    public Oval(MouseEvent e) {
        event = e;

        x = e.getX();
        y = e.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
