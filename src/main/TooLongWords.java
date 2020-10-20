import java.util.*;
import java.util.function.Function;

public class TooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        String wordCount = sc.next();

        for (int i = 0; i < Integer.parseInt(wordCount); i++) {
            result.add(sc.next());
        }

        TooLongWords.shortenWords(result)
                .forEach(System.out::println);
    }

    public static List<String> shortenWords (List<String> words) {
        List<String> result = new ArrayList<>(words);
        Function<String, String> shortenWord = longWord -> longWord.charAt(0) + String.valueOf(longWord.length() - 2) + longWord.charAt(longWord.length() - 1);

        words.stream()
                .filter(word -> word.length() > 10)
                .forEach(longWord -> result.set(
                        words.indexOf(longWord),
                        shortenWord.apply(longWord)
                ));

        return result;
    }
}
