import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Question13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Question13");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.GRAY);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel.setPreferredSize(new Dimension(400, 200));
        panel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse has entered the panel."); 
            }
            @Override
            public void mouseExited(MouseEvent e){
                System.out.println("Mouse has Exited the panel."); 
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
        panel.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseMoved(MouseEvent e){
                System.out.println("Mouse moved to: (" + e.getX() + ", " + e.getY() + ")");
            }
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Mouse dragged to: (" + e.getX() + ", " + e.getY() + ")");
            }
        });
        frame.addWindowListener(new WindowAdapter(){
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
        frame.setVisible(true);
    }
}
