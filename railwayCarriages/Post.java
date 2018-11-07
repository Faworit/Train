package train.railwayCarriages;

import train.RailwayCarriage;

public class Post extends RailwayCarriage {
    private String TYPE = "Post";
    private double weight = 72;
    private int id;

    public Post(int id, double weight){
        super(weight);
        this.weight = weight;
    }

    @Override
    public String getTYPE() {
        return TYPE;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }
}
