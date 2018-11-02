package Train.RailwayCarriages.Freight;

import Train.RailwayCarriages.Freights;

public class Lorry extends Freights {
    private final String MODEL = "Lorry";
    private int id;
    private double weight;

    public Lorry(int id, double weight){
        this.id = id;
        this.weight = weight;
    }

    public String getMODEL() {
        return MODEL;
    }

    public double getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }
}
