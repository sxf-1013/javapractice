package Book;

public class Family {
    TV homeTV;

    public Family() {
    }

    void buyTV(TV tv) {
        this.homeTV = tv;
    }

    void remoteControl(int m) {
        this.homeTV.setChannel(m);
    }

    void seeTV() {
        this.homeTV.showProgram();
    }
}
