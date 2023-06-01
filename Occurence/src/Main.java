import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Occurrence occurrence = new Occurrence();
        File inputFile = new File("/home/iasmina/IdeaProjects/Occurence/input");
        int n = 10; // Number of top words to retrieve
        occurrence.getTopOccurrences(new File("/home/iasmina/IdeaProjects/Occurence/input"));
        System.out.println(occurrence.getTopOccurrences(new File("/home/iasmina/IdeaProjects/Occurence/input")));

    }
}
