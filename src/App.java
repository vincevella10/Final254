import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Description: This is the App class which creates the GUI for the Random Sentence Generator. It allows users to generate random sentences, add new words to the lists, view the current lists of words, and remove words from the lists. The GUI is built using Java Swing components and includes error handling for invalid input.
 * Author: Vince Vela
 * @Author Dane Andreasen
 * @Since 4/23/2026
 */
public class App extends JFrame {

    /**
     * Description: This is the main method of the program which makes a GUI for the Random sentence generator.
     * @Param: args the command line arguments
     * @Throws: Exception if there is an error with the GUI components or the RandomSentence class methods
     */
    public static void main(String[] args) throws Exception {
        JFrame mainFrame = new JFrame();
        mainFrame.setTitle("Welcome to Dane and Vince's Random Sentence Generator!");
        mainFrame.setSize(400, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color lightBlue = new Color(173, 216, 230);
        mainFrame.setBackground(lightBlue);

        RandomSentence rs = new RandomSentence();// sets the RandomSentence class to use.

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

        JButton viewButton = new JButton ("View Words");
        topPanel2.add(viewButton);


        JPanel centralPanel = new JPanel();
        JTextField WTypePanel = new JTextField(10);
        centralPanel.add(WTypePanel);
        mainFrame.add(centralPanel);

        JPanel bottomPanel = new JPanel();
        JLabel Instructions = new JLabel("Enter Your New Word or word you want to remove in the Text Box above");
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
                    JOptionPane.showMessageDialog(mainFrame, "Error: " + exept.getMessage()); // opens a new window with an error message showing exception
                }
            }
        });

        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String selectedChoice = (String) cb.getSelectedItem();
                    if (selectedChoice.equals("Noun")) {
                        JOptionPane.showMessageDialog(mainFrame, "list of nouns: " + rs.getNoun()); // updates the message on the label
                    } else if (selectedChoice.equals("Verb")) {
                        JOptionPane.showMessageDialog(mainFrame, "the list of verbs: " + rs.getVerb()); // updates the message on the label
                    } else if (selectedChoice.equals("Adjective")) {
                        JOptionPane.showMessageDialog(mainFrame, "the list of adjectives: " + rs.getAdjective()); // updates the message on the label
                    }
                }catch (Exception exept) {
                JOptionPane.showMessageDialog(mainFrame, "Error: " + exept.getMessage());
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
                        rs.removeVerb(newWord);
                    } else if (selectedChoice.equals("Adjective")) {
                        rs.removeAdjective(newWord);
                    }
                    Instructions.setText(newWord + " (" + selectedChoice + ") has been removed"); // updates the message on the label
                    } catch (Exception exept) {
                         JOptionPane.showMessageDialog(mainFrame, "Error: " + exept.getMessage()); // updates the message on the label with an error message
                }
            }
        });
        GenerateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                        StringBuilder newSentence = rs.generateSentence(); // generates a new sentence using the RandomSentence class
                        sentenceLabel.setText("Your Sentence is: " + newSentence); // updates the message on the label
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(mainFrame, "Error: No words left to generate a sentence.");
                    }
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

    
    /**
     * Description: This method checks for numbers in the input word. It takes in the new word as a parameter and uses a regular expression to check if it contains any digits. If it does, it throws an IllegalArgumentException with a message indicating that numbers are not allowed.
     * @Param: newWord the new word to be checked for numbers
     * @Throws: IllegalArgumentException if the new word contains any digits
    */
    public static void numberCheck(String newWord){
        if(newWord.matches(".*\\d.*")){
            throw new IllegalArgumentException("Numbers are not allowed!");
        }
    }
    /**
     * Description: This method checks for duplicate words in the lists before adding a new word. It takes in the RandomSentence object, the new word to be added, and the type of word (Noun, Verb, or Adjective) as parameters. It throws an IllegalArgumentException if the word already exists in the corresponding list.
     * @Param: rs the RandomSentence object to access the lists of words
     * @Param: word the new word to be added
     * @Param: type the type of word (Noun, Verb, or Adjective)
     */
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

    /**
     * Description: This method checks if the input word exists in the corresponding list. It takes in the RandomSentence object, the new word to be checked, and the type of word (Noun, Verb, or Adjective) as parameters. If the word does not exist, it throws an IllegalArgumentException with a message indicating that the word does not exist.
     * @Param: rs the RandomSentence object to access the lists of words
     * @Param: newWord the new word to be checked for existence
     * @Param: type the type of word (Noun, Verb, or Adjective)
     * @Throws: IllegalArgumentException if the new word does not exist in the corresponding list
     */
    public static void nonWordCheck(RandomSentence rs, String newWord, String type) { //need to fix does not

        ArrayList<String> list;

        if (type.equals("Noun")) {
            list = rs.getNoun();
        } else if (type.equals("Verb")) {
            list = rs.getVerb();
        } else {
            list = rs.getAdjective();
        }
        Boolean found = false;
        for(int i = 0; i < list.size(); i++) {
                if (list.get(i).equalsIgnoreCase(newWord)) {
                    found = true;
                    break;
                }
            }
        if (!found) {
        throw new IllegalArgumentException(type + " does not exist");
    }
    }
    public static void nonWordCheck(RandomSentence rs, String word, String type) {

        ArrayList<String> list;

        if (type.equals("Noun")) {
            list = rs.getNoun();
        } else if (type.equals("Verb")) {
            list = rs.getVerb();
        } else {
            list = rs.getAdjective();
        }

            for (String w : list) {
                if (!w.equalsIgnoreCase(word)) {
                    throw new IllegalArgumentException(type + " does not exist");
                }
            }
    }
}


//JOptionPane.showMessageDialog(null, "Your Sentence is: " + newSentence);
//showMessageDialog(null, "Your Sentence is: " + newSentence); for error message
