import org.junit.jupiter.api.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class WatermelonTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void getAnswerTestYES () {
        ByteArrayInputStream sampleInput = new ByteArrayInputStream("6".getBytes());
        System.setIn(sampleInput);
        Watermelons.main(null);

        assertEquals("YES", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void getAnswerTestNO () {
        ByteArrayInputStream sampleInput = new ByteArrayInputStream("2".getBytes());
        System.setIn(sampleInput);
        Watermelons.main(null);

        assertEquals("NO", outputStreamCaptor.toString()
                .trim());
    }
}