public abstract class Plant implements PlantInterface{
    private double length;
    private String name;
    public Plant(){

    }
    protected String plantType = this.getClass().getName();
    private String foodType;
    private String foodAmount;
    public Plant(double length, String name) {
        this.length = length;
        this.name = name;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public double getLength() {
        return length;
    }
    public String getFoodType() {
        return foodType;
    }
    public String getName() {
        return name;
    }
    public abstract String foodAmount();
}