import org.junit.jupiter.api.Test;

class TestPlants {

    Palm palm = new Palm(2,"Palmis");
    Cactus cactus = new Cactus(10,"Sticky");
    Carnivore carnivore = new Carnivore(10,"Hajen");

    @Test
    void testFoodAmount() {

        assert (palm.foodAmount() == 1);
        assert (cactus.foodAmount() == 0.02);
        assert (carnivore.foodAmount() == 2.1);


    }
}