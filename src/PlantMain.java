import javax.swing.*;
import java.util.ArrayList;
public class PlantMain {


    public static void main(String[] args) {
        Plant palm = new Palm(5, "Laura");
        Plant palmTwo = new Palm(1, "Putte");
        Plant cactus = new Cactus(0.2,"Igge");
        Plant carnivore = new Carnivore (0.7,"Meatloaf");
        ArrayList<Plant> plantList = new ArrayList<>();
        plantList.add(palm);
        plantList.add(palmTwo);
        plantList.add(cactus);
        plantList.add(carnivore);
        String[] plantArray = new String[5];
        for(int i = 0 ; i<4 ; i++)
            plantArray[i] = plantList.get(i).getName();

        plantArray[4] = "Ingen av de ovanstående";

        String chosenPlant = (String) JOptionPane.showInputDialog(
                null,
                "Vilken växt ska få mat?",
                "Näringsprogram",
                JOptionPane.QUESTION_MESSAGE,
                null,
                plantArray,
                plantArray[0]);

        //Här är polymorfismen
        for(PlantInterface plant:plantList)
            if(chosenPlant.equalsIgnoreCase(plant.getName()))
            JOptionPane.showMessageDialog(null,plant.foodMessage());


        }

    }