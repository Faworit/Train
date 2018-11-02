package Train;

import Train.Transport;

public abstract class Locomotive extends Transport {
    private double power;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public double getPower() {
        return power;
    }
}
