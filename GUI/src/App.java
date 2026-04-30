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

        mainFrame.setLayout(new GridLayout(3, 1, 10, 10)); // (rows, cols, hgap, vgap)

        JPanel topPanel = new JPanel();
        JButton GenerateButton = new JButton ("generate");
        topPanel.add(GenerateButton);
        mainFrame.add(topPanel);

        JPanel sentencePanel = new JPanel();
        JLabel sentenceLabel = new JLabel("Your Sentence will appear here");
        sentencePanel.add(sentenceLabel);
        mainFrame.add(sentencePanel);

        JPanel topPanel2 = new JPanel();
        JButton GenerateButton2 = new JButton ("Add");
        topPanel2.add(GenerateButton2);
        mainFrame.add(topPanel2);

        JButton GenerateButton3 = new JButton ("Remove");
        topPanel2.add(GenerateButton3);


        JPanel centralPanel = new JPanel();
        JTextField WTypePanel = new JTextField(10);
        centralPanel.add(WTypePanel);
        mainFrame.add(centralPanel);

        JPanel bottomPanel = new JPanel();
        JTextField Instructions = new JTextField("Enter Your New Word in the Text Box to the Left", 30);
        bottomPanel.add(Instructions);
        mainFrame.add(bottomPanel);


        GenerateButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String selectedChoice = (String) cb.getSelectedItem();
            String newWord = WTypePanel.getText(); // gets the text from the TextField component
            Instructions.setText(newWord + " (" + selectedChoice + ") has been added"); // updates the message on the label
        }
    });

      mainFrame.setVisible(true); // this must be the last statement
   }

}

