package Train.RailwayCarriages.Freight;

import Train.RailwayCarriages.Freights;

public class Container extends Freights {
    private final String MODEL = "Container";
    private int id;
    private double weight;

    public Container(int id, double weight){
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
