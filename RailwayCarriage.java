package train;

public abstract class RailwayCarriage extends Transport {

    private static final String TYPE = "railway";
    private static double railwayGauge;

    public RailwayCarriage(double weight){
        super(weight);
    }

    public String getTYPE() {
        return TYPE;
    }

    public static void setRailwayGauge(double railwayGauge) {
        RailwayCarriage.railwayGauge = railwayGauge;
    }
}
