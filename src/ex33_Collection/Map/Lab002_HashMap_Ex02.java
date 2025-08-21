package ex33_Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab002_HashMap_Ex02 {
    public static void main(String[] args) {

        Map <String, Integer> vehicles = new HashMap<>();
        vehicles.put("BMW", 1);
        vehicles.put("Tata", 1);
        vehicles.put("Activa", 1);
        vehicles.put("Skoda", 2);
        vehicles.put("Audi", 5);

        System.out.println(vehicles);

        System.out.println("Total Vehicles : "+ vehicles.size());

        // Iterator over the Map

        for(String key : vehicles.keySet()){
            System.out.println(key + " -> "+vehicles.get(key));
        }


        // Checking if key exists
        if(vehicles.containsKey("Audi")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


        // Clearing the map
        vehicles.clear();
        System.out.println("After clear operation, size: " + vehicles.size());
    }
}
