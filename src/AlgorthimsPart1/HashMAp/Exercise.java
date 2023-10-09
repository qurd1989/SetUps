package HashMAp;


import javax.swing.*;
import java.awt.*;

public class Exercise extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawSmileyFace(g);
    }

    private void drawSmileyFace(Graphics g) {
        // Draw face (circle)
        g.setColor(Color.YELLOW);
        g.fillOval(100, 100, 200, 200);

        // Draw eyes
        g.setColor(Color.BLACK);
        g.fillOval(155, 175, 30, 30);
        g.fillOval(245, 175, 30, 30);

        // Draw mouth (an arc)
        g.drawArc(150, 200, 100, 100, 0, -180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiley Face");
        Exercise smileyFace = new Exercise();
        frame.add(smileyFace);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
