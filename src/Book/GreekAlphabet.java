package Book;

public class GreekAlphabet {
    public GreekAlphabet() {
    }

    public static void main(String[] args) {
        char cStart = 945;
        char cEnd = 969;
        int startPosition = cStart;
        int endPosition = cEnd;
        System.out.println("希腊字母'α'在unicode表中的顺序位置：“+startPosition); " + cStart);
        System.out.println("希腊字母表：");

        for(int i = cStart; i <= endPosition; ++i) {
            char c = (char)i;
            System.out.print(" " + c);
            if ((i - startPosition + 1) % 10 == 0) {
                System.out.println("");
            }
        }

    }
}
