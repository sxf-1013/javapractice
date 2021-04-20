package Practice;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber2 {
    public GuessNumber2() {
    }

    public static void main(String[] args) {
        System.out.print("我来猜你心里想的1-100的数：");
        Random random = new Random();
        Scanner reader = new Scanner(System.in);
        int lastGuessL = 1;
        int lastGuessR = 100;
        int programGuess = random.nextInt(100) + 1;
        System.out.print("你心里的数字是" + programGuess + "吗？");

        for(int result = reader.nextInt(); result != 2; result = reader.nextInt()) {
            if (result == 1) {
                lastGuessR = programGuess - 1;
            } else if (result == 0) {
                lastGuessL = programGuess + 1;
            }

            programGuess = lastGuessL + random.nextInt(lastGuessR - lastGuessL + 1);
            System.out.print("你心里的数字是" + programGuess + "吗？");
        }

        System.out.println("哇哦，我猜对了！！!!!");
    }
}



