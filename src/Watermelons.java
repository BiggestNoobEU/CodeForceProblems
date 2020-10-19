import java.util.*;

public class Watermelons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(
                input != 2 && input % 2 == 0 ? "YES" : "NO"
        );
    }
}
