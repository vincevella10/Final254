
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

    /**
     * Description:the constructor for the RandomSentence class.
     */
    RandomSentence() {
        this.nouns = new ArrayList<String>();
        this.verbs = new ArrayList<String>();
        this.articles = new ArrayList<String>();
        this.prepositions = new ArrayList<String>();
        this.adjectives = new ArrayList<String>();

        // Initialize the lists with some default words
        nouns.add("kid");
        nouns.add("worker");
        nouns.add("fishermen");
        nouns.add("pterodactyl");
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
        prepositions.add("off");
        prepositions.add("around");
        prepositions.add("on top of");
        prepositions.add("next to");
        prepositions.add("near");
        prepositions.add("to");
        prepositions.add("from");
        prepositions.add("by");
        prepositions.add("towards");
        adjectives.add("happy");
        adjectives.add("bald");
        adjectives.add("sad");
        adjectives.add("angry");
        adjectives.add("sleepy");
    }

    /**
     * Description: This method generates a random sentence using the words in the lists.
     * @return StringBuilder the generated sentence
     */
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

    /**
     * Description: This method sets the list of nouns.
     * @param nouns the list of nouns to be set
     */
    public void setNouns(ArrayList<String> nouns) {
        this.nouns = nouns;
    }

    /**
     * Description: This method sets the list of verbs.
     * @param verbs the list of verbs to be set
     */
    public void setVerbs(ArrayList<String> verbs) {
        this.verbs = verbs;
    }

    /**
     * Description: This method sets the list of articles.
     * @param articles the list of articles to be set
     */
    public void setArticles(ArrayList<String> articles) {
        this.articles = articles;
    }

    /**
     * Description: This method sets the list of prepositions.
     * @param prepositions the list of prepositions to be set
     */
    public void setPrepositions(ArrayList<String> prepositions) {
        this.prepositions = prepositions;
    }

    /**
     * Description: This method sets the list of adjectives.
     * @param adjectives the list of adjectives to be set
     */
    public void setAdjectives(ArrayList<String> adjectives) {
        this.adjectives = adjectives;
    }

    /**
     * Description: This method adds a new nouns.
     * @param noun the noun to be added
     */
    public void addNoun(String noun) {
        nouns.add(noun);
    }

    /**
     * Description: This method adds a new verb.
     * @param verb
     */
    public void addVerb(String verb) {
        verbs.add(verb);
    }

    /**
     * Description: This method adds a new adjective.
     * @param adjective
     */
    public void addAdjective(String adjective) {
        adjectives.add(adjective);
    }

    /**
     * Description: This method removes a nouns.
     * @param noun the noun to be removed
     */
    public void removeNoun(String noun) {
        nouns.remove(noun);
    }

    /**
     * Description: This method removes a verbs.
     * @param verb the verb to be removed
     */
    public void removeVerb(String verb) {
        verbs.remove(verb);
    }

    /**
     * Description: This method removes a adjectives.
     * @param adjective the adjective to be removed
     */
    public void removeAdjective(String adjective) {
        adjectives.remove(adjective);
    }

    /**
     * Description: This method returns the list of nouns. getter for nouns.
     * @return ArrayList<String> the list of nouns
     */
    public ArrayList<String> getNoun() {
        return nouns;
    }
    /**
     * Description: This method returns the list of verbs. getter for verbs.
     * @return ArrayList<String> the list of verbs
     */
    public ArrayList<String> getVerb() {
        return verbs;
    }

    /**
     * Description: This method returns the list of articles. getter for articles.
     * @return ArrayList<String> the list of articles
     */
    public ArrayList<String> getArticle() {
        return articles;
    }

    /**
     * Description: This method returns the list of prepositions. getter for prepositions.
     * @return ArrayList<String> the list of prepositions
     */
    public ArrayList<String> getPreposition() {
        return prepositions;
    }

    /**
     * Description: This method returns the list of adjectives. getter for adjectives.
     * @return ArrayList<String> the list of adjectives
     */
    public ArrayList<String> getAdjective() {
        return adjectives;
    }

}
