package train;

public class Locomotive extends Transport {
    private double power;
    private int id;

    public Locomotive(double weight, int id, double power){
        super(weight);
        this.power = power;
        this.id = id;
    }

    public double getPower() {
        return power;
    }

    public int getId() {
        return id;
    }
}
