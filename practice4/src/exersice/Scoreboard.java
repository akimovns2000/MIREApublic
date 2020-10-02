package exersice;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Scoreboard extends JFrame
{
    //JTextField jta1 = new JTextField(10);
    //JTextField jta2 = new JTextField(10);
    JButton jbMilan = new JButton("AC Milan");
    JButton jbMadrid = new JButton("Real Madrid");
    JLabel jlScore = new JLabel("Result: 0 X 0");
    JLabel jlLast = new JLabel("Last scorer: N/A");
    JLabel jlResult = new JLabel("Winner: DRAW");
    int nMilan = 0;
    int nMadrid = 0;


    Font fnt = new Font("Times new roman",Font.BOLD,20);

    Scoreboard()
    {
        super("Scoreboard");
        setLayout(new GridLayout(5, 1));
        setSize(200,200);
        add(jbMilan);
        add(jbMadrid);
        add(jlScore);
        add(jlLast);
        add(jlResult);
        //add(jta2);

        jbMadrid.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                    jlScore.setText("Result: " + nMilan + " X " +  ++nMadrid );
                    jlLast.setText("Last scorer: Real Madrid");
                    if (nMadrid == nMilan)
                    jlResult.setText("Winner: DRAW");
                    else if (nMadrid > nMilan)
                        jlResult.setText("Winner: Real Madrid");
            }
        });
        jbMilan.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                jlScore.setText("Result: " + ++nMilan + " X " + nMadrid);
                jlLast.setText("Last scorer: AC Milan");
                if (nMadrid == nMilan)
                    jlResult.setText("Winner: DRAW");
                else if (nMadrid < nMilan)
                    jlResult.setText("Winner: AC Milan");
            }
        });
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new Scoreboard();
    }
}