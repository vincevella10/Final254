
import java.util.ArrayList;
import java.util.Random;
public class RandomSentence {
    private ArrayList<String> nouns;
    private ArrayList<String> verbs;
    private ArrayList<String> articles;
    private ArrayList<String> prepositions;

    RandomSentence() {
        this.nouns = new ArrayList<String>();
        this.verbs = new ArrayList<String>();
        this.articles = new ArrayList<String>();
        this.prepositions = new ArrayList<String>();

        // Initialize the lists with some default words
        nouns.add("kid");
        nouns.add("worker");
        nouns.add("monkey");
        verbs.add("jumps");
        verbs.add("looks");
        articles.add("the");
        articles.add("a");
        prepositions.add("over");
        prepositions.add("under");
        prepositions.add("on top of");
    }

public String generateSentence() {
    Random rand = new Random();

    String wordNoun = nouns.get(rand.nextInt(nouns.size()));
    String wordVerb = verbs.get(rand.nextInt(verbs.size()));
    String wordArticle = articles.get(rand.nextInt(articles.size()));
    String wordPrep = prepositions.get(rand.nextInt(prepositions.size()));
    String wordNoun2 = nouns.get(rand.nextInt(nouns.size()));
    String wordArticle2 = articles.get(rand.nextInt(articles.size()));
    return wordArticle + " " + wordNoun + " " + wordVerb + " " + wordPrep + " " + wordArticle2 + " " + wordNoun2;
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

    public String getString(){
        StringBuilder sentence = new StringBuilder();
        sentence.append(this.articles).append(" ").append(this.nouns).append(" ").append(this.verbs).append(" ").append(this.prepositions).append(" ").append(this.articles).append(" ").append(this.nouns);
        return sentence.toString();
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

}