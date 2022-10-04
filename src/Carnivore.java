public class Carnivore extends Plant{
    private double baseLevel;
    private double addedFood;

    public Carnivore() {

    }

    public Carnivore(double length, String name) {
        super(length,name);
        baseLevel = 0.1;
        addedFood = 0.2;
    }
    public String foodAmount(){
        return "Den köttätande växten " + this.getName() + " behöver " +
                (baseLevel + (addedFood*this.getLength())) + " liter " + this.foodType(new Carnivore()) + " per dag";
    }
}
