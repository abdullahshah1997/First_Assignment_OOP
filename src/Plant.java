public abstract class Plant implements PlantInterface{
    private double length;
    private String name;
    public Plant(){

    }
    protected String plantType = this.getClass().getName();
    public Plant(double length, String name) {
        this.length = length;
        this.name = name;
    }

    public double getLength() {
        return length;
    }
    public String getName() {
        return name;
    }

}