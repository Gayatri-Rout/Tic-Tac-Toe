import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener{

    // whos turn is first?
    Random random = new Random();

    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel btn_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] btns = new JButton[9];
    boolean player1_turn;

    // constructor for this class
    TicTacToe(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

    // who starts the game?
    public void firstTurn(){

    }

    // check to see who is winning
    public void check(){

    }

    public void Xwins(int a, int b, int c){

    }

    public void Ywins(int a, int b, int c){

    }


}
