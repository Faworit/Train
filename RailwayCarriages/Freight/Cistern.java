package Train.RailwayCarriages.Freight;

import Train.RailwayCarriages.Freights;

public class Cistern extends Freights {
    private final String MODEL = "Cistern";
    private int id;
    private double weight;

    public Cistern(int id, double weight){
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
