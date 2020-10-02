package ExamplesTesting;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TextAreaExample extends JFrame
{
    JTextArea jta1 = new JTextArea(10,25);
    //JScrollPane areaScrollPane = new JScrollPane(jta1);
    JButton button = new JButton("Add some Text");
    public TextAreaExample()
    {
        super("Example");
        setSize(300,300);
        //setLayout(new FlowLayout());
      //  add(comp, BorderLayout.EAST);
        add(jta1, BorderLayout.NORTH);
        JScrollPane jScroll = new JScrollPane(jta1,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        add(jScroll,BorderLayout.CENTER);
         // we add the scrollPane and not the text area.
        add(button, BorderLayout.SOUTH);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String txt = JOptionPane.showInputDialog(null,"Insert some text");

                jta1.append(txt);
                //jta1.append("\n");
                //jta1.append(ae.toString());
                jta1.append("\n");

            }
        });
    }
    public static void main(String[]args)
    {
        new TextAreaExample().setVisible(true);
    }
}
