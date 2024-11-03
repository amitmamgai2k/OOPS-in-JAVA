import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Question12 {
    static int rectX = 50;
    static int rectY = 50;
    static int rectWidth = 200;
    static int rectHeight = 100;
    static boolean isInsideRectangle = false;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rectangular Box");
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.fillRect(rectX, rectY, rectWidth, rectHeight);
            }
        };
        drawingPanel.setPreferredSize(new Dimension(300, 200));
        drawingPanel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int mouseX = e.getX();
                int mouseY = e.getY();
                boolean currentlyInsideRectangle = (mouseX >= rectX && mouseX <= rectX + rectWidth &&
                        mouseY >= rectY && mouseY <= rectY + rectHeight);

                if (currentlyInsideRectangle) {
                    if (!isInsideRectangle) {
                        System.out.println("Mouse is inside the rectangle.");
                        isInsideRectangle = true;
                    }
                } else {
                    if (isInsideRectangle) {
                        System.out.println("Mouse is outside the rectangle but inside the Swing Window.");
                        isInsideRectangle = false;
                    }
                }
            }
        });
        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse is Inside Swing Window");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse is Outside Swing Window");
            }
        });
        frame.add(drawingPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
