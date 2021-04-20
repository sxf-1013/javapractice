package Book;

public class Vehicle {
    double speed;
    int power;

    public Vehicle() {
    }

    void brake() {
        this.speed = 0.0D;
    }

    void speedUp(int s) {
        this.speed += (double)s;
    }

    void speedDown(int d) {
        this.speed -= (double)d;
    }

    void setPower(int p) {
        this.power = p;
    }

    int getPower() {
        return this.power;
    }

    double getSpeed() {
        return this.speed;
    }
}

