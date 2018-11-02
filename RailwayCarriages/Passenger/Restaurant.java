package Train.RailwayCarriages.Passenger;

import Train.RailwayCarriages.Carriage;

public class Restaurant extends Carriage {
    private final String MODEL = "Restaurant";
    private int id;
    private int countPassengers;
    private double weight;

    public Restaurant(int id, int countPassengers, double weight){
        super();
        this.id = id;
        this.countPassengers = countPassengers;
        this.weight = weight;

    }

    public int getId() {
        return id;
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
}