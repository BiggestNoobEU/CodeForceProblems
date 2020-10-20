import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TooLongWordsTest {

    @Test
    public void shortenWords () {
        List<String> expected = List.of("word", "l10n", "i18n", "p43s");
        List<String> input = List.of("word", "localization", "internationalization", "pneumonoultramicroscopicsilicovolcanoconiosis");

        assertEquals(expected, TooLongWords.shortenWords(input));
    }
}
