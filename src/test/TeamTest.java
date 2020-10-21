import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeamTest {

    @Test
    public static void getSolvedCountTest () {
        List<Team.Problem> problems = new ArrayList<>();
        problems.add(new Team.Problem(true, true, false));
        problems.add(new Team.Problem(true, true, true));
        problems.add(new Team.Problem(true, false, false));
        String expected = "2";
        String actual = Team.getSolvedCountTest(problems);

        assertEquals(expected, actual);
    }
}
