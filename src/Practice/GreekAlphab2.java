package Practice;

public class GreekAlphab2 {
    public GreekAlphab2() {
    }

    public static void main(String[] args) {
        System.out.println("前一百个字符在unicode表中的位置：");

        for(int i = 1; i <= 100; ++i) {
            char c = (char)i;
            System.out.print(" " + c);
            System.out.print("");
        }

    }
}

