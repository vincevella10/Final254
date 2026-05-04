public class AppRandSent {
    public static void main(String[] args) throws Exception {
        RandomSentence rs = new RandomSentence();

        System.out.println(rs.generateSentence());
    }


    public static void menu() {
        System.out.println("Welcome to Dane and Vince's Random Sentence Generator!");
        System.out.println("Please select an option:");
        System.out.println("1. Generate a random sentence");
        System.out.println("2. add another verb");
        System.out.println("3. add another noun");
        System.out.println("4. Exit");
    }
// incorporate exception handling in final
// stringBuilder for sentence generation

}