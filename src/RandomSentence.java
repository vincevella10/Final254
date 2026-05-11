
import java.util.ArrayList;
import java.util.Random;

/**
 * Description: This is the RandomSentence class which contains the methods for generating random sentences, adding new words to the lists, viewing the current words, and removing words from the lists.
 * @Author: Vince Vella
 * @Author Dane Andreasen
 * @Since 4/23/2026
 */
public class RandomSentence {
    
    private ArrayList<String> nouns;
    private ArrayList<String> verbs;
    private ArrayList<String> articles;
    private ArrayList<String> prepositions;
    private ArrayList<String> adjectives;
    private Random randWord = new Random();

    RandomSentence() {
        this.nouns = new ArrayList<String>();
        this.verbs = new ArrayList<String>();
        this.articles = new ArrayList<String>();
        this.prepositions = new ArrayList<String>();
        this.adjectives = new ArrayList<String>();

        // Initialize the lists with some default words
        nouns.add("kid");
        nouns.add("worker");
        nouns.add("monkey");
        nouns.add("man");
        nouns.add("dog");
        verbs.add("jumps");
        verbs.add("looks");
        verbs.add("runs");
        verbs.add("eats");
        verbs.add("walks");
        articles.add("the");
        articles.add("a");
        prepositions.add("over");
        prepositions.add("under");
        prepositions.add("on top of");
        prepositions.add("next to");
        prepositions.add("near");
        prepositions.add("to");
        prepositions.add("from");
        prepositions.add("by");
        prepositions.add("towards");
        prepositions.add("around");
        prepositions.add("near");
        adjectives.add("happy");
        adjectives.add("sad");
        adjectives.add("angry");
        adjectives.add("excited");
        adjectives.add("sleepy");
    }

public StringBuilder generateSentence() {

    String wordNoun = nouns.get(randWord.nextInt(nouns.size()));
    String wordVerb = verbs.get(randWord.nextInt(verbs.size()));
    String wordArticle = articles.get(randWord.nextInt(articles.size()));
    String wordPrep = prepositions.get(randWord.nextInt(prepositions.size()));
    String wordNoun2 = nouns.get(randWord.nextInt(nouns.size()));
    String wordArticle2 = articles.get(randWord.nextInt(articles.size()));
    String wordAdjective = adjectives.get(randWord.nextInt(adjectives.size()));
    String wordAdjective2 = adjectives.get(randWord.nextInt(adjectives.size()));
    wordArticle = wordArticle.substring(0,1).toUpperCase() + wordArticle.substring(1); //should capitalize the first letter (index 0) of the first article.
    return new StringBuilder().append(wordArticle).append(" ").append(wordAdjective).append(" ").append(wordNoun).append(" ").append(wordVerb).append(" ").append(wordPrep).append(" ").append(wordArticle2).append(" ").append(wordAdjective2).append(" ").append(wordNoun2).append(".");
}
    public void setNouns(ArrayList<String> nouns) {
        this.nouns = nouns;
    }
    public void setVerbs(ArrayList<String> verb) {
        this.verbs = verb;
    }
    public void setArticles(ArrayList<String> articles) {
        this.articles = articles;
    }
    public void setPrepositions(ArrayList<String> prepositions) {
        this.prepositions = prepositions;
    }
    public void setAdjectives(ArrayList<String> adjectives) {
        this.adjectives = adjectives;
    }


    public void addNoun(String noun) {
        nouns.add(noun);
    }
    public void addVerb(String verb) {
        verbs.add(verb);
    }
    public void addAdjective(String adjective) {
        adjectives.add(adjective);
    }


    public void removeNoun(String noun) {
        nouns.remove(noun);
    }

    public void removeVerb(String verb) {
        verbs.remove(verb);
    }

    public void removeAdjective(String adjective) {
        adjectives.remove(adjective);
    }
    public ArrayList<String> getNoun() {
        return nouns;
    }

    public ArrayList<String> getVerb() {
        return verbs;
    }

    public ArrayList<String> getArticle() {
        return articles;
    }

    public ArrayList<String> getPreposition() {
        return prepositions;
    }

    public ArrayList<String> getAdjective() {
        return adjectives;
    }

}