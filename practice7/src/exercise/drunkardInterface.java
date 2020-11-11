package exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;



class drunkardInterface extends JFrame
{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton(" Играть");
    JButton button1 = new JButton(" Раздать");
    //JButton button2 = new JButton(" Посчитать все ходы");
    JLabel Result = new JLabel(" ");
    JCheckBox box = new JCheckBox("Играть до конца");
    JCheckBox box1 = new JCheckBox("случайно");
    Font fnt = new Font("Times new roman",Font.BOLD,20);

    int i=0;

    drunkardInterface()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,350);
        add(button1);
        add(box1);
        add(new JLabel("1st player"));
        add(jta1);
        add(new JLabel("2nd player"));
        add(jta2);

        add(button);
        add(box);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                i=0;
                if (box1.isSelected()) {
                    Stack<Card> deck = new Stack<>();
                    jta1.setText("");
                    jta2.setText("");

                    for (int j = 0; j < 10; j++) deck.add(new Card(j));
                    for (int j = 9; j >= 0; j--) {
                        int m = 0 + (int) (Math.random() * j);
                        jta1.setText(jta1.getText() + deck.get(m) + " ");
                        deck.remove(m);
                        m = 0 + (int) (Math.random() * (--j));
                        jta2.setText(jta2.getText() + deck.get(m) + " ");
                        deck.remove(m);
                    }
                }
            }
        });

        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                Scanner in1 = new Scanner(jta1.getText());
                Scanner in2 = new Scanner(jta2.getText());

                Stack<Card> deck1 = new Stack<>();
                Stack<Card> deck2 = new Stack<>();

                while(in1.hasNextInt()) {
                    deck1.add(new Card(in1.nextInt()));
                }

                while(in2.hasNextInt()) {
                    deck2.add(new Card(in2.nextInt()));
                }


                while(true) {
                    i++;
                    Card card1 = deck1.get(0);
                    deck1.remove(0);

                    Card card2 = deck2.get(0);
                    deck2.remove(0);

                    if (card1.compareTo(card2) > 0) {
                        deck1.add(card1);
                        deck1.add(card2);
                        if (deck2.size()==0) {
                            JOptionPane.showMessageDialog(null, "first " + i,"Success",JOptionPane.INFORMATION_MESSAGE);
                            break;}
                    } else {
                        deck2.add(card1);
                        deck2.add(card2);
                        if (deck1.size()==0) {
                            JOptionPane.showMessageDialog(null, "second " + i,"Success",JOptionPane.INFORMATION_MESSAGE);
                            break;}
                    }
                    String str="";
                    for(int k = 0; k< deck1.size(); k++) str+=deck1.get(k)+" ";
                    jta1.setText(str);
                    str="";
                    for(int k = 0; k< deck2.size(); k++) str+=deck2.get(k)+" ";
                    jta2.setText(str);
                    if (box.isSelected()==false) break;
                    if (i>=106) {
                        JOptionPane.showMessageDialog(null, "botva","Success",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }

            }

        });
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new drunkardInterface();
    }
}