package Train;

import Train.Locomotives.DieselLocomotive;
import Train.Locomotives.ElectricityLocomotive;
import Train.RailwayCarriages.Carriage;
import Train.RailwayCarriages.Freight.Cistern;
import Train.RailwayCarriages.Freight.Container;
import Train.RailwayCarriages.Freight.Lorry;
import Train.RailwayCarriages.Passenger.Coupe;
import Train.RailwayCarriages.Passenger.EconomClass;
import Train.RailwayCarriages.Passenger.Restaurant;
import Train.RailwayCarriages.Post;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TrainEquepment {
    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

    public boolean isDigit(String name) {
        return name.matches("[1-9]+");
    }

    public String typeOfTrain() throws IOException {
        String type;
        do {
            System.out.println("Select number of type train: \n 1. passenger \n 2. freight");
            type = rd.readLine();
            if(!type.equals("1") && !type.equals("2")){
                System.out.println("You enter not correct data");
            }
        }
        while(!type.equals("1") && !type.equals("2"));
        if(type.equals("1")){
            type = "passenger";
            return type;
        }
        else {
            type = "freight";
            return type;
        }
    }

    public Locomotive selectLocomotive() throws IOException {
        String selectLocomotive;
        int num;
        boolean b;
        do {
            do {
                System.out.println("Select Locomotive, enter num 1-4: \n 1. Type - Electricity, power - 3524 t/h," +
                        " weight - 188 tons");
                System.out.println("2. Type - Electricity, power - 3769 t/h, weight - 164 tons");
                System.out.println("3. Type - Diesel, power - 11016 t/h, weight - 276 tons");
                System.out.println("4. Type - Diesel, power - 1260 t/h, weight - 81 tons");
                selectLocomotive = rd.readLine();
                b = isDigit(selectLocomotive);
                if(!b){
                    System.out.println("You entered not correct data");
                }
            }
            while(!b);
            num = Integer.parseInt(selectLocomotive);
            if(!(num > 0 && num <= 4)){
                System.out.println("You entered not correct data");
            }
        }
        while(!(num > 0 && num <= 4));



        switch(num) {
            case(1): return creator(1);
            case(2): return creator(2);
            case(3): return creator(3);
            default: return creator(4);
        }

    }

    private Locomotive creator(int num){
        switch(num){
            case(1) :  ElectricityLocomotive vl82 = new ElectricityLocomotive(1,3524, 188);
            return vl82;

            case(2) : ElectricityLocomotive chs7 = new ElectricityLocomotive(2,3769, 164);
            return chs7;

            case(3) : DieselLocomotive dt116 = new DieselLocomotive(3,11016, 276);
            return dt116;

            default: DieselLocomotive pa2 = new DieselLocomotive(4,260, 81);
            return pa2;
        }
    }

    public RailwayCarriage selectCarriage() throws IOException {
        String selectCarriage;
        int num;
        boolean b;
        do {
            do {
                System.out.println("Select number (type) of carriage: 1. Coupe \n 2. Econom class \n 3. restaurant \n 4. post");
                selectCarriage = rd.readLine();
                b = isDigit(selectCarriage);
                if (!b) {
                    System.out.println("You entered not correct data");
                }
            }
            while(!b);
            num = Integer.parseInt(selectCarriage);

            if(!(num > 0 && num <= 4)){
                System.out.println("You entered not correct data");
            }
        }
        while(!(num > 0 && num <= 4));
        switch(num) {
            case(1): return creatorCarriage(1);
            case(2): return creatorCarriage(2);
            case(3): return creatorCarriage(3);
            default: return creatorCarriage(4);
        }
    }

    public RailwayCarriage creatorCarriage(int num) throws IOException {
        boolean b;
        String numOfId;
        do {
            System.out.println("Enter id of railway carriage:");
            numOfId = rd.readLine();
            b = isDigit(numOfId);
            if(!b){
                System.out.println("You entered not correct data");
            }
        }
        while(!b);
        int id = Integer.parseInt(numOfId);
        switch(num){
            case(1): Coupe coupe = new Coupe(id, 36, 96);
                return coupe;
            case(2): EconomClass economClass = new EconomClass(id, 56, 105);
                return economClass;
            case(3): Restaurant restaurant = new Restaurant(id, 32, 88);
                return restaurant;
           default: Post post = new Post(id, 72);
                return post;
        }
    }

    public RailwayCarriage selectFreight() throws IOException {
        String selectFreight;
        int num;
        boolean b;
        do {
            do {
                System.out.println("Select type of carriage: 1. Cistern \n 2. Container \n 3. Lorry \n 4. post");
                selectFreight = rd.readLine();
                b = isDigit(selectFreight);
                if (!b) {
                    System.out.println("You entered not correct data");
                }
            }
            while(!b);

            num = Integer.parseInt(selectFreight);

            if(!(num > 0 && num <= 4)){
                System.out.println("You entered not correct data");
            }
        }
        while(!(num > 0 && num <= 4));

        switch(num) {
            case(1): return creatorFreight(1);
            case(2): return creatorFreight(2);
            case(3): return creatorFreight(3);
            default: return creatorFreight(4);
        }
    }

    public RailwayCarriage creatorFreight(int num) throws IOException {
        boolean b;
        String numOfId;
        do {
            System.out.println("Enter id of freight carriage:");
            numOfId = rd.readLine();
            b = isDigit(numOfId);
            if(!b){
                System.out.println("You entered not correct data");
            }
        }
        while(!b);
        int id = Integer.parseInt(numOfId);
        switch(num){
            case(1): Cistern cistern = new Cistern(id, 78.5);
                return cistern;
            case(2): Container container = new Container(id, 70);
                return container;
            case(3): Lorry lorry = new Lorry(id, 80);
                return lorry;
            default: Post post = new Post(id, 72);
                return post;
        }
    }


}
