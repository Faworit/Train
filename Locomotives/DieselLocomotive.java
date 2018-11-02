package Train.Locomotives;

import Train.Locomotive;

public class DieselLocomotive extends Locomotive {
    private final String TYPE = "Diesel";
    private int id;
    private double power;
    private double weight;

    public DieselLocomotive(int id, double power, double weight){
        super();
        this.id = id;
        this.power = power;
        this.weight = weight;
    }

    public String getTYPE() {
        return TYPE;
    }

    public double getPower() {
        return power;
    }

    public double getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }
}
