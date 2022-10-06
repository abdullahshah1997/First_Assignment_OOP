//Här implementeras interfacet
public abstract class Plant implements PlantInterface{
    //Inkapsling med privata variabler och en konstruktor samt getters.
    private double length;
    private String name;
    public Plant(){

    }

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