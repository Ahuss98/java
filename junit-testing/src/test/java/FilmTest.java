import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilmTest {

    private Film film18 = new Film("Alien", Film.RATING_18);
    private Film film15 = new Film("Aliens", Film.RATING_15);
    private Film film12 = new Film("Spiderman", Film.RATING_12);
    private Film filmPG = new Film("Coco", Film.RATING_PG);
    private Film filmU = new Film("Chitty Chitty Bang Bang", Film.RATING_U);
    private Film filmNull = new Film("Chitty Chitty Bang Bang", "");


    //methodName_StateUnderTest_ExpectedBehaviour

    @Test
    @DisplayName("testing when rating is null")
    void isAllowedToViewNull_ValidInput_correctBoolean() {
    assertFalse(filmNull.isAllowedToView(999));
    }

    @Test
    @DisplayName("testing above 18 method")
    void isAllowedToView18_ValidInput_correctBoolean() {
        assertTrue(film18.isAllowedToView(18));
        assertFalse(film18.isAllowedToView(17));
    }

    @Test
    @DisplayName("testing above 15 method")
    void isAllowedToView15_ValidInput_correctBoolean() {
        assertTrue(film15.isAllowedToView(18));
        assertFalse(film15.isAllowedToView(14));
    }

    @Test
    @DisplayName("testing above 12 method")
    void isAllowedToView12_ValidInput_correctBoolean() {
        assertTrue(film12.isAllowedToView(18));
        assertFalse(film12.isAllowedToView(11));
    }

    @Test
    @DisplayName("testing above PG method")
    void isAllowedToViewPG_ValidInput_correctBoolean() {
        assertTrue(filmPG.isAllowedToView(18));
        assertFalse(filmPG.isAllowedToView(4));
    }

    @Test
    @DisplayName("age above required returns true")
    void isAllowedToViewU_ValidInput_correctBoolean() {
        assertTrue(filmU.isAllowedToView(12));
    }



//        assertTrue(filmPG.isAllowedToView(7));
//        assertTrue(film12.isAllowedToView(12));
//        assertTrue(film15.isAllowedToView(15));
}
