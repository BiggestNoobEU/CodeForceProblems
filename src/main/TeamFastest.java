import java.util.Scanner;

class TestFastest {
    public static void main (String []args){
        Scanner s = new Scanner (System.in);
        int problemCount = s.nextInt();
        int Petya, Vasya, Tonya, solutionCount = 0;

        for(int i = 0; i < problemCount; i++){
            Petya = s.nextInt();
            Vasya = s.nextInt();
            Tonya = s.nextInt();

            solutionCount += Petya + Vasya + Tonya > 1 ? 1 : 0;
        }
        System.out.println(solutionCount);
    }
}
