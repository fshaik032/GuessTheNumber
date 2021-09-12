/*
 * Faaris Shaik
 * First Window
 * 2/1/17
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GuessTheNumber implements ActionListener
{

    private JButton b1;
    JTextField jtfInput;
    private JButton b2;
    JLabel answer;
    int num=(int)(Math.random()*99)+1;


    public void actionPerformed(ActionEvent e)
    {
        if (Integer.parseInt(jtfInput.getText())==num)
            answer.setText("You got it!");
        else if (Integer.parseInt(jtfInput.getText())>num)
            answer.setText("\nLower");
        else if (Integer.parseInt(jtfInput.getText())<num)
            answer.setText("Higher");
        if(e.getSource()==b2)
            System.exit(0);

    }


    public  void setupWindow()
    {
        JFrame f = new JFrame("First Window");
        JPanel p = new JPanel();

        p.setLayout( new FlowLayout());

        b1 = new JButton("Submit");
        b1.addActionListener(this);
        p.add(b1);

        jtfInput = new JTextField(null, 4);
        Font font1 = new Font("Baskerville Old Face", Font.BOLD, 20);
        jtfInput.setFont(font1);
        jtfInput.setForeground(new Color(10, 140, 180));
        p.add(jtfInput);





        b2 = new JButton("EXIT");
        b2.addActionListener(this);
        p.add(b2);

        answer = new JLabel(jtfInput.getText());
        p.add(answer);


        f.getContentPane().add(p,  "Center");

        f.setSize(300,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


    }

    public static void main(String[] args)
    {

        GuessTheNumber win = new GuessTheNumber();
        win.setupWindow();
    }
}