package Book;

public class AmericanPeople extends People {
    public void speakHello(){
        System.out.println("How do you do");
    }
    public void averageHeight() {
        height = 176;
        System.out.println("American's average height:" + height + "cm");
    }
    public void americanBoxing(){
        System.out.println("直拳，勾拳，组合拳");
    }

}
