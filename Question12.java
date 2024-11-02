import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Question12 extends JFrame {

    private Rectangle rectangle; // Rectangle object to hold the dimensions

    public Question12() {
        // Set up the frame
        setTitle("Rectangle Mouse Check");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Define the rectangle (x, y, width, height)
        rectangle = new Rectangle(100, 100, 200, 150); // Rectangle at (100,100) with width 200 and height 150

        // Add mouse listener to check mouse clicks
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Check if the mouse is inside the rectangle
                if (rectangle.contains(e.getPoint())) {
                    System.out.println("Mouse is inside the rectangle.");
                } else {
                    System.out.println("Mouse is outside the rectangle.");
                }
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Call the superclass's paint method
        g.setColor(Color.BLUE); // Set the color for the rectangle
        g.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height); // Draw the rectangle
    }

    public static void main(String[] args) {
        // Create the frame and make it visible
        Question12 frame = new Question12();
        frame.setVisible(true);
    }
}
