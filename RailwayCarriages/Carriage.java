package Train.RailwayCarriages;

import Train.RailwayCarriage;

public abstract class Carriage extends RailwayCarriage {
    private final String TYPE = "Passenger";

    public String getTYPE() {
        return TYPE;
    }
}
