
import java.lang.reflect.Array;
java.util.ArrayList;
java.util.Random;
java.util.Scanner;
public class RandomSentence {

    private ArrayList<String> nouns;
    private ArrayList<String> verbs;
    private ArrayList<String> articles;
    private ArrayList<String> prepositions;

    RandomSentence() {
        nouns = new ArrayList<String>();
        verbs = new ArrayList<String>();
        articles = new ArrayList<String>();
        prepositions = new ArrayList<String>();

        // Initialize the lists with some default words
        nouns.add("cat");
        nouns.add("dog");
        verbs.add("runs");
        verbs.add("jumps");
        articles.add("the");
        articles.add("a");
        prepositions.add("over");
        prepositions.add("under");
    }
}