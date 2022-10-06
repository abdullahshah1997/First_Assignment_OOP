//Här sker arv
public class Cactus extends Plant{

    public Cactus(){}
    public Cactus(double length, String name) {
        super(length,name);
    }

    public double foodAmount() {
        return 0.02;
    }

    //Nyttjar enum nedan samt implementerar metoden från interface.
    public String foodMessage(){
        return "Kaktusen " + this.getName() + " behöver "+foodAmount()+" liter " +
                FoodTypeEnum.ENRICHEDWATER.toLowerCase + " per dag";
    }
}
