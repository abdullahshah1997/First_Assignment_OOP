public class Cactus extends Plant{

    public Cactus(){}
    public Cactus(double length, String name) {
        super(length,name);
    }
    public String foodAmount(){
        return "Kaktusen " + this.getName() + " behöver 0.2 liter " +
                FoodTypeEnum.ENRICHEDWATER.toLowerCase + " per dag";
    }
}
