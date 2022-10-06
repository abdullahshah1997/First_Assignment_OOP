//Här sker arv
public class Palm extends Plant {

    public Palm(){}

    public Palm(double length, String name) {

        super(length, name);
    }

    public double foodAmount() {
        return this.getLength() * 0.5;
    }
    //Nyttjar enum nedan samt implementerar metoden från interface.
    public String foodMessage() {
        return "Palmen " + this.getName() + " behöver " + foodAmount() + " liter " +
                FoodTypeEnum.TAPWATER.toLowerCase + " per dag.";

    }
}
