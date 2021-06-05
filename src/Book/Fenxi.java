package Book;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fenxi {
    public static double getTotalScore(String s) {
        Scanner scanner = new Scanner(s);
        scanner.useDelimiter("[^0123456789.]+");
        double totalScore = 0;
        double count=3;
        double average=0;
        while (scanner.hasNext()) {
            try {
                double score = scanner.nextDouble();
                totalScore = totalScore + score;
            } catch (InputMismatchException exp) {
                String t = scanner.next();

            }
                Scanner input = new Scanner(System.in);
            double avg=0;
             avg=totalScore/count;


                    System.out.println("本次考试的平均分为："+avg);
                }
                return totalScore;
            }
        }
