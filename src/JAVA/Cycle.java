package JAVA;

public class Cycle {
    public void play() {
        System.err.println("Cycle");
    }

    public void wheels() {
        System.out.println("轮子的数量是" + "num");

    }
}


class Unicycle extends Cycle {
        public void play(){
            System.err.println("Unicycle");
        }
        public void wheels(){
            System.out.println("Unicycle wheels:4");
        }
    }
class Bicycle extends Cycle {
    public void play() {
        System.err.println("Bicycle");
    }
        public void wheels(){
            System.out.println("Bicycle wheels:2");
        }
    }


class Tricycle extends Cycle {
    public void play(){
        System.err.println("Tricycle");
    }
    public void wheels(){
        System.out.println("Bicycle wheels:3S");
    }
}
class Ride {

    public static void ride(Cycle cycle) {
        cycle.play();
    }

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        ride(unicycle);
        ride(bicycle);
        ride(tricycle);
        unicycle.wheels();
        bicycle.wheels();
        tricycle.wheels();

    }
}


