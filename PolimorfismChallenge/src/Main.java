class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Mazda extends Car {
    public Mazda(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mazda -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mazda -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mazda -> brake()";
    }
}

class Lada extends Car {
    public Lada(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Lada -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Lada -> accelerate()";
    }

    @Override
    public String brake() {
        return "Lada -> brake()";
    }
}

class Seat extends Car {
    public Seat(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Seat -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Seat -> accelerate()";
    }

    @Override
    public String brake() {
        return "Seat -> brake()";
    }
}


public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println();

        Mazda mazda = new Mazda(8, "Mazda");
        System.out.println(mazda.startEngine());
        System.out.println(mazda.accelerate());
        System.out.println(mazda.brake());
        System.out.println();

        Lada lada = new Lada(5, "Lada");
        System.out.println(lada.startEngine());
        System.out.println(lada.accelerate());
        System.out.println(lada.brake());
        System.out.println();

        Seat seat = new Seat(8, "Seat");
        System.out.println(seat.startEngine());
        System.out.println(seat.accelerate());
        System.out.println(seat.brake());
    }
}
