import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class App extends JFrame {
    public static void main(String[] args) throws Exception {

        JFrame mainFrame = new JFrame();
        mainFrame.setTitle("Welcome");
        mainFrame.setSize(400, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.setLayout(new GridLayout(5, 4, 10, 10)); // (rows, cols, hgap, vgap)
        

        JPanel topPanel = new JPanel();
        JButton GenerateButton = new JButton ("generate Sentence");
        topPanel.add(GenerateButton);
        mainFrame.add(topPanel);


        JPanel topPanel2 = new JPanel();
        JButton GenerateButton2 = new JButton ("Add");
        topPanel2.add(GenerateButton2);
        mainFrame.add(topPanel2);
        


        JPanel centralPanel = new JPanel();
        JTextField WTypePanel = new JTextField(20);
        centralPanel.add(WTypePanel);
        mainFrame.add(centralPanel);

        JPanel bottomishPanel = new JPanel();
        JLabel Instructions = new JLabel("Enter Your New Word in the Text Box above and Click Add");
        bottomishPanel.add(Instructions);
        mainFrame.add(bottomishPanel);


        GenerateButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String newWord = WTypePanel.getText(); // gets the text from the TextField component
            Instructions.setText(newWord + " Has been added"); // updates the message on the label
        }
    });

      mainFrame.setVisible(true); // this must be the last statement
    }

}

