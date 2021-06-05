package Book;

import java.util.InputMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Jisuan {


        public static double getVo1ume(String s) {
            Scanner scanner = new Scanner(s);

            scanner.useDelimiter("[^0123456789.]+");
            double volume = 1;

            while (scanner.hasNext()) {
                try {
                    double distance = scanner.nextDouble();
                    volume = volume * distance;
                } catch (InputMismatchException exp) {
                    String t = scanner.next();
                }

            }
            return volume;
        }
    }


