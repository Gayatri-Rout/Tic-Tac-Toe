import javax.swing.JFrame;

public class snakeGame{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        // setBounds(int x-coordinate, int y-coordinate, int width, int height)
        // x and y co-ords of the top-left corner of the rect component
        frame.setBounds(10, 10, 905, 700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // frame by default is invisible
        // need to make it visible
        frame.setVisible(true);
    }
}