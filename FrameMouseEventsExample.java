import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class FrameMouseEventsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame Mouse Events Example");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Prevent default closing

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        panel.setPreferredSize(new Dimension(400, 200));

        // Add mouse listeners to the panel
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse has entered the panel.");
                panel.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse has exited the panel.");
                panel.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse pressed at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse released at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        // Add mouse motion listener to the panel
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("Mouse moved to: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Mouse dragged to: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        // Add a window listener to handle close operation
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showConfirmDialog(frame, "Are you sure you want to close?", "Confirm Exit",
                        JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    frame.dispose(); // Close the frame
                }
            }
        });

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
