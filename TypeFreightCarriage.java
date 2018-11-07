package train;

public enum TypeFreightCarriage {
    CISTERN("Cistern"),
    CONTAINER("Container"),
    LORRY("Lorry");

    String type;

    TypeFreightCarriage(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
