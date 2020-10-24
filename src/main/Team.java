import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Problem> problems = new ArrayList<>();

        int problemCount = sc.nextInt();

        for (int i = 0; i < problemCount; i++) {
            int[] solutions = new int[3];
            for (int k = 0; k < 3; k++) {
                solutions[k] = sc.nextInt();
            }
            problems.add(new Problem(solutions[0], solutions[1], solutions[2]));
        }

        System.out.println(getSolvedCount(problems));
    }

    public static String getSolvedCount(List<Problem> problems){
        return String.valueOf(
                problems.stream()
                        .map(Problem::isSolvable)
                        .filter(number -> number)
                        .count()
        );
    }

    public static class Problem {
        int petya, vasya, tonya;

        Problem (int petya, int vasya, int tonya) {
            this.petya = petya;
            this.vasya = vasya;
            this.tonya = tonya;
        }

        public boolean isSolvable() {
            List<Integer> result = List.of(this.petya, this.vasya, this.tonya);

            return result.stream()
                    .filter(number -> number == 1)
                    .count() > 1;
        }
    }
}
