package Train.RailwayCarriages;

import Train.RailwayCarriage;

public class Post extends RailwayCarriage {
    private final String TYPE = "Post";
    private double weight = 72;
    private int id;

    public Post(int id, double weight){
        super();
        this.weight = weight;
    }
}
