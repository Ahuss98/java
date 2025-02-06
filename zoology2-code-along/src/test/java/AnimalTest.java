import com.nology.zoology.animal.Animal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {
     Animal animal1 ;


    @BeforeEach
        void setUp(){
        animal1 = new Animal(1,"josh", 44);

    }
        //methodName_StateUnderTest_ExpectedBehaviour

    @Test
    @DisplayName("test for getId")
        void getId_showsId_returns1(){
        assertEquals(1,animal1.getId());
    }

    @Test
    @DisplayName("test for id setter")
        void setID_canSetIdTo4_returns4(){
        animal1.setId(4);
        assertEquals(4,animal1.getId());
    }

    @Test
    @DisplayName("test for hunger level to be as expected")
        void getHunger_hunger_returns50(){
        assertEquals(50,animal1.getHunger());
    }

    @Test
    @DisplayName("testing setHunger")
        void getHunger_canRetrieveHungerLevel(){
        animal1.setHunger((short)20);
        assertEquals(20, animal1.getHunger());
    }

    @Test
    @DisplayName("testing if i can feed the animal")
        void feed_canFeedAnimal_HungerDecreasesBy10(){
        animal1.feed();
        assertEquals(40, animal1.getHunger());

    }

    @Test
    @DisplayName("getters for name")
        void getName_canRetreiveName(){
        assertEquals("josh",animal1.getName());
    }

    @Test
    @DisplayName("setters for name")
        void setName_canSetNameToBrad_returnsBrad(){
        animal1.setName("brad");
        assertEquals("brad",animal1.getName());
    }

    @Test
    @DisplayName("getters for age")
        void getName_canRetreiveAge(){
        assertEquals(44,animal1.getAge());
    }

    @Test
    @DisplayName("setters for age")
        void setName_canSetAgeTo23_returnsBrad(){
        animal1.setAge(23);
        assertEquals(23,animal1.getAge());
    }
}
