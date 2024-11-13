class Vehicle {
    void bugatti() {
    };
}

class Start extends Vehicle {
    @Override
    void bugatti() {
        System.out.println("Engine Start.");
    }
}

class Move extends Start {
    @Override
    void bugatti() {
        super.bugatti();
        System.out.println("Driving at 1000 km per hour.");
    }
}

class Stop extends Move {
    @Override
    void bugatti() {
        super.bugatti();
        System.out.println("Engine Stop.");
    }
}

public class VehicleMove {

    public static void main(String[] args) {
        Stop vehicle = new Stop();
        vehicle.bugatti();
    }

}