package train;

public abstract class Transport {
    private double weidth;
    private double length;
    private double weight;
    private double height;

    public Transport(double weight){
        this.weight = weight;
    }

    public Transport() {

    }

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

    public void setWeidth(double weidth) {
        this.weidth = weidth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
