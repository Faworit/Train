package train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainTrain {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        TrainEquepment train = new TrainEquepment();
        String typeOfTrain = train.selectTypeOfTrain();
        if(typeOfTrain.equals("passenger")){
            double power;
            double weight;
            int count;
            int partOfCarriageId;
            int numberOfCarriage;
            String selection;
            ArrayList<Transport> passengerTrain = new ArrayList<>();
            Locomotive locomotive = train.selectLocomotive();
            power = locomotive.getPower() - locomotive.getWeight();
            passengerTrain.add(locomotive);

           while(power>0){
               partOfCarriageId = locomotive.getId();
               numberOfCarriage = passengerTrain.size();
               RailwayCarriage railwayCarriage = train.selectCarriage(partOfCarriageId, numberOfCarriage);
               weight = railwayCarriage.getWeight();
               power -= weight;
               if(power>0){
                   passengerTrain.add(railwayCarriage);
               }

               do {
                   System.out.println("Do you want to add RailwayCarriage? \n yes \n no ");
                   selection = rd.readLine();
                   if (selection.equals("no")) {
                       break;
                   }
                   if (!selection.equals("yes") && !selection.equals("no")){
                       System.out.println("You entered not correct data");
                   }
               }
               while(!selection.equals("yes") && !selection.equals("no"));
               if (selection.equals("no")) {
                   break;
               }
           }
           rd.close();
           System.out.println("Full train");
           count = passengerTrain.size();
           System.out.println(count);

        }
        else{
            double power;
            double weight;
            int count;
            int partOfCarriageId;
            int numberOfCarriage;
            String selection;
            ArrayList<Transport> freightTrain = new ArrayList<>();
            Locomotive locomotive = train.selectLocomotive();
            power = locomotive.getPower() - locomotive.getWeight();
            freightTrain.add(locomotive);

            while(power>0){
                partOfCarriageId = locomotive.getId();
                numberOfCarriage = freightTrain.size();
                RailwayCarriage railwayCarriage = train.selectFreight(partOfCarriageId, numberOfCarriage);
                weight = railwayCarriage.getWeight();
                power -= weight;
                if(power>0){
                    freightTrain.add(railwayCarriage);
                }
                do {
                    System.out.println("Do you want to add RailwayCarriage? \n yes \n no ");
                    selection = rd.readLine();
                    if (selection.equals("no")) {
                        break;
                    }
                    if (!selection.equals("yes") && !selection.equals("no")){
                        System.out.println("You entered not correct data");
                    }
                }
                while(!selection.equals("yes") && !selection.equals("no"));
                if (selection.equals("no")) {
                    break;
                }
            }
            rd.close();
            System.out.println("Full train");
            count = freightTrain.size();
            System.out.println("number of railways in train " +count);

        }
    }
}
