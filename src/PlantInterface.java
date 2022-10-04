public interface PlantInterface {
    default String foodType(Plant plant){
        if (plant.plantType.equalsIgnoreCase("carnivore"))
            return ("proteindryck");
        else if(plant.plantType.equalsIgnoreCase("cactus"))
            return ("mineralvatten");
        else if(plant.plantType.equalsIgnoreCase("palm"))
            return ("kranvatten");
        else
            return null;
    }

}
