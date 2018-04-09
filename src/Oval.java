// Class for description ovals

import java.awt.event.MouseEvent;

public class Oval implements Runnable {
    private MouseEvent event;
    private int x, y, speed;
    private boolean up, down, left, right;
    private Main main;
    private Thread t;

    public Oval(MouseEvent e, Main main) {
        this.main = main;
        t = new Thread(this);

        event = e;

        up = true;
        speed = 1;
        x = e.getX();
        y = e.getY();

        System.out.println(y);
        t.start();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void run() {
        while (true) {
            if(up) y -= speed;
            else if (down) y += speed;

            if(y <= 10) {
                up = !up;
                down = !down;
            }

            if( y > main.getPreferredSize().getHeight() - 30) {
                up = !up;
                down = !down;
            }

            main.repaint();

            try {
                t.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
