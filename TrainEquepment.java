package train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrainEquepment {
    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

    public int idOfCarriage(int partOfId, int typeOfCarriage, int numberOfCarriage){
        String firstPartId = String.valueOf(partOfId);
        String secondPartId = String.valueOf(typeOfCarriage);
        String thirdPartId = String.valueOf(numberOfCarriage);
        String fullId = firstPartId + secondPartId + thirdPartId;
        int id = Integer.parseInt(fullId);
        return id;
    }

    public int isDigit() throws IOException {
        int digit;
        boolean checkString;
        String forCheck;
        do {
            forCheck = rd.readLine();
            checkString = forCheck.matches("[1-9]+");
            if(!checkString){
                System.out.println("You enter not correct data");
            }
        }
        while(!checkString);

        digit = Integer.parseInt(forCheck);
        return digit;
    }

    public String selectTypeOfTrain() throws IOException {
        String type;
        int numberOfTypeTrain;
        do {
            System.out.println("Select number of type train: \n 1. passenger \n 2. freight");
            numberOfTypeTrain = isDigit();
        }
        while(!(numberOfTypeTrain == 1) && !(numberOfTypeTrain == 2));

        if(numberOfTypeTrain == 1){
            type = "passenger";
            return type;
        }
        else {
            type = "freight";
            return type;
        }
    }

    public Locomotive selectLocomotive() throws IOException {
        int num;
        do{
            System.out.println("Select Locomotive, enter num 1-4: \n 1. Type - Electricity, power - 3524 t/h," +
                        " weight - 188 tons");
            System.out.println("2. Type - Electricity, power - 3769 t/h, weight - 164 tons");
            System.out.println("3. Type - Diesel, power - 11016 t/h, weight - 276 tons");
            System.out.println("4. Type - Diesel, power - 1260 t/h, weight - 81 tons");
            num = isDigit();
            if(!(num > 0 && num <= 4)) {
                System.out.println("You entered not correct data");
            }
        }
        while(!(num > 0 && num <= 4));

        Locomotive locomotive;
        if(num==1){
            locomotive = new Locomotive(188, 1, 3524);
        }
        else if(num==2){
            locomotive = new Locomotive(164,2,3769);
        }
        else if(num==3){
            locomotive = new Locomotive(276, 3,11016);
        }
        else{
            locomotive = new Locomotive(81,4,260);
        }
        return locomotive;
    }


    public Carriage selectCarriage(int idOfLoco, int numberOfCarriage) throws IOException {
        int numOfType;
        int id;
        String typeCarriage;
        Carriage carriage;
        TypeCoach[] type = TypeCoach.values();

        do {
            System.out.println("Select number (type) of carriage:");
            for( int i = 0; i<type.length; i++ ){
                System.out.println((i+1) + ". " + type[i].getType());
            }
            numOfType = isDigit();
            if(!(numOfType > 0 && numOfType <type.length )){
                System.out.println("You entered not correct data");
            }
        }
        while(!(numOfType > 0 && numOfType <type.length ));
        id = idOfCarriage(idOfLoco, numOfType, numberOfCarriage);
        if(type[numOfType].getType().equals("Coupe")){
            TypeCoach coupe = TypeCoach.COUPE;
            typeCarriage = coupe.getType();
            carriage = new Carriage(typeCarriage, id, 36, 96);
        }   else if(type[numOfType].getType().equals("Econom")){
                TypeCoach econom = TypeCoach.ECONOM;
                typeCarriage = econom.getType();
                carriage = new Carriage(typeCarriage, id, 56, 105);
        }   else if(type[numOfType].getType().equals("Restaurant")){
                TypeCoach restourant = TypeCoach.RESTOURANT;
                typeCarriage = restourant.getType();
                carriage = new Carriage(typeCarriage, id, 32, 88);
        }   else{
                TypeCoach post = TypeCoach.POST;
                typeCarriage = post.getType();
                carriage = new Carriage(typeCarriage, id, 72);
        }
        return carriage;
    }

    public RailwayCarriage selectFreight(int idOfLoco, int numberOfCarriage) throws IOException {
        int numOfType;
        int id;
        String typeCarriage;
        Carriage carriage;
        TypeFreightCarriage[] type = TypeFreightCarriage.values();

        do {
            System.out.println("Select type of carriage: ");
            for( int i = 0; i<type.length; i++ ){
                System.out.println((i+1) + ". " + type[i].getType());
            }
            numOfType = isDigit();
            if(!(numOfType > 0 && numOfType <= 4)){
                System.out.println("You entered not correct data");
            }
        }
        while(!(numOfType > 0 && numOfType <= 4));
        id = idOfCarriage(idOfLoco, numOfType, numberOfCarriage);


        if (type[numOfType].getType().equals("Cistern")) {
            TypeFreightCarriage cistern = TypeFreightCarriage.CISTERN;
            typeCarriage = cistern.getType();
            carriage = new Carriage(typeCarriage, id, 78.5);
        }   else if(type[numOfType].getType().equals("Container")){
                TypeFreightCarriage container = TypeFreightCarriage.CONTAINER;
                typeCarriage = container.getType();
                carriage = new Carriage(typeCarriage, id, 70);
        }   else {
                TypeFreightCarriage lorry = TypeFreightCarriage.LORRY;
                typeCarriage = lorry.getType();
                carriage = new Carriage(typeCarriage, id, 80);
        }

        return carriage;
    }
}
