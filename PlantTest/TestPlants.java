import org.junit.jupiter.api.Test;

class TestPlants {

    Palm palm = new Palm(2,"Palmis");
    Cactus cactus = new Cactus(10,"Sticky");
    Carnivore carnivore = new Carnivore(10,"Hajen");

    @Test
    void testFoodAmount() {

        //Testar om det metoden returnerar korrekt värde samt om ett felaktigt värde inte returneras.
        //Alla tester gick igenom, så uträkningsmetoden funkar.
        assert (palm.foodAmount() == 1);
        assert (cactus.foodAmount() == 0.02);
        assert (carnivore.foodAmount() == 2.1);
        assert (!(palm.foodAmount() == 10));
        assert (!(cactus.foodAmount() == 1));
        assert (!(carnivore.foodAmount() == 5));


    }
}