package Train.RailwayCarriages.Passenger;

import Train.RailwayCarriages.Carriage;

public class Coupe extends Carriage {
    private int id;
    private final String MODEL = "Coupe";
    private int countPassenger;
    private double weight;

    public Coupe(int id, int countPassenger, double weight){
        super();
        this.id = id;
        this.countPassenger = countPassenger;
        this.weight = weight;
    }

    public String getMODEL() {
        return MODEL;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public double getWeight() {
        return weight;
    }


}
