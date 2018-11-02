package Train;

import Train.Transport;

public abstract class RailwayCarriage extends Transport {
    private double weidth;
    private double length;
    private double weight;
    private double height;
    private final String TYPE = "Passenger";

    public double getWeidth() {
        return weidth;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getTYPE() {
        return TYPE;
    }
}
