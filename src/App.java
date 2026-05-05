import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


public class App extends JFrame {
    public static void main(String[] args) throws Exception {
        JFrame mainFrame = new JFrame();
        mainFrame.setTitle("Welcome to Dane and Vince's Random Sentence Generator!");
        mainFrame.setSize(400, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color lightBlue = new Color(173, 216, 230);
        mainFrame.setBackground(lightBlue);

        RandomSentence rs = new RandomSentence();// initializes the RandomSentence class to use its methods for sentence generation and word management


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
        JButton addButton = new JButton ("Add");
        topPanel2.add(addButton);
        mainFrame.add(topPanel2);

        JButton removeButton = new JButton ("Remove");
        topPanel2.add(removeButton);


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


        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String selectedChoice = (String) cb.getSelectedItem();
                    String newWord = WTypePanel.getText(); // gets the text from the TextField component

                    numberCheck(newWord);
                    duplicateCheck(rs, newWord, selectedChoice);

                     if (selectedChoice.equals("Noun")) {
                        rs.addNoun(newWord);
                    } else if (selectedChoice.equals("Verb")) {
                        rs.addVerb(newWord);
                    } else if (selectedChoice.equals("Adjective")) {
                        rs.addAdjective(newWord);
                    }
                    Instructions.setText(newWord + " (" + selectedChoice + ") has been added"); // updates the message on the label
                    } catch (Exception exept) {
                    JOptionPane.showMessageDialog(mainFrame, "Error: " + exept.getMessage()); // updates the message on the label with an error message
            }
            }
        });
      
    

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String selectedChoice = (String) cb.getSelectedItem();
                    String newWord = WTypePanel.getText(); // gets the text from the TextField component

                    numberCheck(newWord);
                    
                    if (selectedChoice.equals("Noun")) {
                        rs.removeNoun(newWord);
                    } else if (selectedChoice.equals("Verb")) {
                        //rs.removeVerb(newWord);
                    } else if (selectedChoice.equals("Adjective")) {
                        //rs.removeAdjective(newWord);
                    }
                    Instructions.setText(newWord + " (" + selectedChoice + ") has been removed"); // updates the message on the label
                    } catch (ArrayIndexOutOfBoundsException exept) {
                        JOptionPane.showMessageDialog(mainFrame, "Error: Please enter a valid word to remove."); // updates the message on the label with an error message
                }
            }
        });
        GenerateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                String newSentence = rs.generateSentence(); // generates a new sentence using the RandomSentence class
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

          public static void numberCheck(String newWord){
             if(newWord.matches(".*\\d.*")){
                        throw new IllegalArgumentException("Numbers are not allowed!");
        }
        }
        public static void duplicateCheck(RandomSentence rs, String word, String type) {

        ArrayList<String> list;

            if (type.equals("Noun")) {
                list = rs.getNoun();
            } else if (type.equals("Verb")) {
                list = rs.getVerb();
            } else {
                list = rs.getAdjective();
            }

            for (String w : list) {
                if (w.equalsIgnoreCase(word)) {
                    throw new IllegalArgumentException(type + " already exists!");
                }
            }
    }
      
}

  
//JOptionPane.showMessageDialog(null, "Your Sentence is: " + newSentence);
//showMessageDialog(null, "Your Sentence is: " + newSentence); for error message
