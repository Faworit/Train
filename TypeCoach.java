package train;

public enum TypeCoach {
    COUPE("Coupe"),
    ECONOM("Econom"),
    RESTOURANT("Restaurant"),
    POST("Post");

    String type;

    TypeCoach(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
