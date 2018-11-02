package Train.RailwayCarriages.Passenger;

import Train.RailwayCarriages.Carriage;

public class EconomClass extends Carriage {
    private final String MODEL = "EconomClass";
    private int id;
    private int countPassengers;
    private double weight;

    public EconomClass(int id, int countPassengers, double weight){
        super();
        this.id = id;
        this.countPassengers = countPassengers;
        this.weight = weight;
    }

    public String getMODEL() {
        return MODEL;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public double getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }
}
