package JAVA;

public class Cycle {
    public void play(){
        System.err.println("Cycle");
    }
}

class Unicycle extends Cycle {
        public void play(){
            System.err.println("Unicycle");
        }
    }
class Bicycle extends Cycle {
    public void play(){
        System.err.println("Bicycle");
    }
}
class Tricycle extends Cycle {
    public void play(){
        System.err.println("Tricycle");
    }
}
class Ride{

    public static void ride(Cycle cycle){
        cycle.play();
    }

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        ride(unicycle);
        ride(bicycle);
        ride(tricycle);

    }
}

