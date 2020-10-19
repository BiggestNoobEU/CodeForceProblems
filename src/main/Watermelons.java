import java.util.*;

public class Watermelons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.print(
                Watermelons.getAnswer(input)
        );
    }

    public static String getAnswer(int input) {
        return input != 2 && input % 2 == 0 ? "YES" : "NO";
    }
}
