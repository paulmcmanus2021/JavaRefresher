import animals.*;
import foods.Food;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class AnimalTest {

    Animal animal1;
    Animal animal2;
    Animal animal3;
    Animal animal4;

    Food food1;

    @Before
    public void before(){
        animal1 = new Dog("Fido","Woof","Pedigree",5);
        animal2 = new Dog("Rex","Woof","Pedigree",3);
        animal3 = new Cat("Felix","Meow","Whiskers",3);
        animal4 = new Human("Human", "Hello", "Vegetarian", 7);
    }

    @Test
    public void canGetName() {
    assertEquals("Fido", animal1.getName());
    }

    @Test
    public void canGetVoice() {
    assertEquals("Woof", animal2.getVoice());
    }

    @Test
    public void canGetDiet() {
    assertEquals("Pedigree", animal1.getDiet());
    }

    @Test
    public void canGetHungerLevel() {
    assertEquals(3, animal2.getHungerLevel());
    }

    @Test
    public void canSetName() {
    animal3.setName("Mittens");
    assertEquals("Mittens", animal3.getName());
    }

    @Test
    public void canSetVoice() {
    animal1.setVoice("Bark");
    assertEquals("Bark", animal1.getVoice());
    }

    @Test
    public void canSetDiet() {
    animal4.setDiet("Carnivore");
    assertEquals("Carnivore", animal4.getDiet());
    }

    @Test
    public void canSetHungerLevel() {
    animal2.setHungerLevel(1);
    assertEquals(1, animal2.getHungerLevel());
    }

}
