
import java.util.ArrayList;
import java.util.Random;
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
        nouns.add("fishermen");
        nouns.add("pterodactyl");
        nouns.add("monkey");
        verbs.add("jumps");
        verbs.add("shaves");
        verbs.add("looks");
        articles.add("the");
        articles.add("a");
        prepositions.add("over");
        prepositions.add("under");
        prepositions.add("off");
        prepositions.add("around");
        prepositions.add("on top of");
        adjectives.add("happy");
        adjectives.add("bald");
        adjectives.add("sad");
        adjectives.add("nerdy");
        adjectives.add("boneheaded");
        adjectives.add("hairy");
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
