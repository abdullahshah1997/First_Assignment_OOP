import javax.swing.*;

public class PlantTest {
    public static void main(String[] args){
        double iggeFoodAmount = 0.02;
        double lauraFoodAmount = 0.5*5;
        double meatloafFoodAmount = 0.1+0.2*0.7;
        double putteFoodAmount = 0.5*1;
        String plantName = JOptionPane.showInputDialog("Vilken växt ska få mat?").trim();
        if(plantName.equalsIgnoreCase("Igge")){
            JOptionPane.showMessageDialog(null,"Mängd: "+iggeFoodAmount+" liter\nVätsketyp:" +
                    " Mineralvatten");

        }
        else if(plantName.equalsIgnoreCase("Laura")){
            JOptionPane.showMessageDialog(null,"Mängd: "+lauraFoodAmount+" liter\nVätsketyp:" +
                    " Kranvatten");

        }
        else if(plantName.equalsIgnoreCase("Meatloaf")){
            JOptionPane.showMessageDialog(null,"Mängd: "+meatloafFoodAmount+" liter\nVätsketyp:" +
                    " Proteindryck");

        }
        else if(plantName.equalsIgnoreCase("Putte")){
            JOptionPane.showMessageDialog(null,"Mängd: "+putteFoodAmount+" liter\nVätsketyp:" +
                    " Kranvatten");

        }

        Plant plant = new Carnivore(3, "favvisen");
        System.out.println(plant.plantType);

    }
}
