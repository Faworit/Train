package train;

import train.RailwayCarriage;

public class Carriage extends RailwayCarriage {
    private String typeCarriage;
    private int id;
    private int countPassenger;

    public Carriage(String typeCarriage, int id, int countPassenger, double weight){
        super(weight);
        this.typeCarriage = typeCarriage;
        this.id = id;
        this.countPassenger = countPassenger;

    }

    public Carriage(String typeCarriage, int id, double weight){
        super(weight);
        this.typeCarriage = typeCarriage;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getCountPassenger() {
        return countPassenger;
    }
}
