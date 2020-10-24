import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TeamTest {

    @Test
    public void getSolvedCount () {
        List<Team.Problem> problems = new ArrayList<>();
        problems.add(new Team.Problem(1, 1, 0));
        problems.add(new Team.Problem(1, 1, 1));
        problems.add(new Team.Problem(1, 0, 0));
        String expected = "2";
        String actual = Team.getSolvedCount(problems);

        assertEquals(expected, actual);
    }

    @Test
    public void isSolvable() {
        assertTrue(new Team.Problem(1, 0, 1).isSolvable());
    }
}
