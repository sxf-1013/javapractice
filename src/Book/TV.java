package Book;

public class TV {
    int channel;

    public TV() {
    }

    void setChannel(int m) {
        if (m >= 1) {
            this.channel = m;
        }

    }

    int getChannel() {
        return this.channel;
    }

    void showProgram() {
        switch(this.channel) {
            case 1:
                System.out.println("综合频道");
                break;
            case 2:
                System.out.println("经济频道");
                break;
            case 3:
                System.out.println("文艺频道");
                break;
            case 4:
                System.out.println("国际频道");
                break;
            case 5:
                System.out.println("体育频道");
                break;
            default:
                System.out.println("不能收看" + this.channel + "频道");
        }

    }
}

