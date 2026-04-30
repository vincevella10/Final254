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
      Color lightBlue = new Color(173, 216, 230);
        mainFrame.setBackground(lightBlue);
   

        mainFrame.setLayout(new GridLayout(5, 5, 10, 10)); // (rows, cols, hgap, vgap)

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
        JLabel Instructions = new JLabel("Enter Your New Word or word you want to remove in the Text Box to the above");
        bottomPanel.add(Instructions);
        mainFrame.add(bottomPanel);


        String[] choices = { "Verb","Adjective", "Noun",};

            final JComboBox<String> cb = new JComboBox<String>(choices);

            cb.setVisible(true);
            topPanel2.add(cb);


        GenerateButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String selectedChoice = (String) cb.getSelectedItem();
            String newWord = WTypePanel.getText(); // gets the text from the TextField component
            Instructions.setText(newWord + " (" + selectedChoice + ") has been added"); // updates the message on the label
        }
    });

    GenerateButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String selectedChoice = (String) cb.getSelectedItem();
            String newWord = WTypePanel.getText(); // gets the text from the TextField component
            Instructions.setText(newWord + " (" + selectedChoice + ") has been removed"); // updates the message on the label
            }
        });
    GenerateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String newSentence = "";
            sentenceLabel.setText("Your Sentence is: " + newSentence); // updates the message on the label
        }
    });
      mainFrame.getContentPane().setBackground(lightBlue);
      topPanel.setBackground(lightBlue);
      topPanel2.setBackground(lightBlue);
      centralPanel.setBackground(lightBlue);
      bottomPanel.setBackground(lightBlue);
      sentencePanel.setBackground(lightBlue);
      mainFrame.setVisible(true); // this must be the last statement
    }

}