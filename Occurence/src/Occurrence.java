import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Occurrence {
    public List<String> getTopOccurrences(File textFile) {
        List<String> topOccurrences = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(textFile);
            Map<String, Integer> wordFrequencyMap = new HashMap<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");

                for (String word : words) {
                    wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                }
            }

            // Sort words based on their frequencies
            List<Map.Entry<String, Integer>> entries = new ArrayList<>(wordFrequencyMap.entrySet());
            entries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            // Add the top 10 occurrences to the result list
            for (int i = 0; i < Math.min(11, entries.size()); i++) {
                topOccurrences.add(entries.get(i).getKey());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return topOccurrences;
    }
}
