public class Palm extends Plant {

    public Palm(){}

    public Palm(double length, String name) {

        super(length, name);
    }
    public String foodAmount() {
        return "Palmen " + this.getName() + " behöver " + (this.getLength() * 0.5) + " liter " +
                FoodTypeEnum.TAPWATER.toLowerCase + " per dag.";

    }
}
