import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener {

    // whos turn is first?
    Random random = new Random();

    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel btn_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] btns = new JButton[9];
    boolean player1_turn;

    // constructor for this class
    TicTacToe() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        // frame visibility by default is false
        // gotta make it true
        frame.setVisible(true);

        textfield.setBackground(Color.black);
        textfield.setForeground(Color.white);
        textfield.setFont(new Font("Candara Light", Font.BOLD, 50));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 500, 50);

        btn_panel.setLayout(new GridLayout(3, 3));
        btn_panel.setBackground(Color.darkGray);

        // add the btns
        for (int i = 0; i < 9; i++) {
            // create a new btn
            btns[i] = new JButton();

            // add btns to button panel
            btn_panel.add(btns[i]);
            btns[i].setFont(new Font("Candara Light", Font.BOLD, 50));
            btns[i].setFocusable(false);

            // track which btn is click
            // accordingly execute code
            // for that specific btn
            btns[i].addActionListener(this);
        }

        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(btn_panel);

        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

    // who starts the game?
    public void firstTurn() {

    }

    // check to see who is winning
    public void check() {

    }

    public void Xwins(int a, int b, int c) {

    }

    public void Ywins(int a, int b, int c) {

    }

}
