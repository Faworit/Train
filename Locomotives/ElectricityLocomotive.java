package Train.Locomotives;

import Train.Locomotive;

public class ElectricityLocomotive extends Locomotive {
    private int id;
    private double power;
    private double weight;
    private final String TYPE = "Electricity";

    public ElectricityLocomotive(int id, double power, double weight){
        super();
        this.id = id;
        this.power = power;
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public double getWeight() {
        return weight;
    }

    public String getTYPE() {
        return TYPE;
    }

    public int getId() {
        return id;
    }
}
