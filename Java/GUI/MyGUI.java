import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyGUI extends JFrame {

    JTextArea text;
    JTextField userText;
    JButton appendButton, setButton;

    public MyGUI() {
        setLayout(new FlowLayout());

        text = new JTextArea(20, 50);
        text.setEnabled(false);

        JLabel userTextLabel = new JLabel("What would you like to say? ");
        userText = new JTextField(30);

        appendButton = new JButton("Append Text");
        appendButton.addActionListener(new Action());

        setButton = new JButton("Set Text");
        setButton.addActionListener(new Action());



        add(text);
        add(userTextLabel);
        add(userText);
        add(appendButton);
        add(setButton);
    }

    private class Action implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == appendButton) {
                text.append(userText.getText() + "\n");
            } else if (e.getSource() == setButton) {
                text.setText(userText.getText() + "\n");
            }
            
        }


    }



}
