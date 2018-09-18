import org.junit.Test;

import static org.junit.Assert.*;

public class PluralizeTest {

    @Test
    public void pluralizeNoDogsTest() {
        String expected = "I own 0 dogs";
        String actual = Pluralize.pluralize("dog", 0);
        assertEquals(expected, actual);
    }

    @Test
    public void pluralizeOneTurtleTest(){
        String expected = "I own 1 turtle";
        String actual = Pluralize.pluralize("turtle",1);
        assertEquals(expected,actual);
    }

    @Test
    public void pluralizeEmptyTest(){
        String expected = "I own no animals";
        String actual = Pluralize.pluralize("",1);
        assertEquals(expected,actual);
    }


    @Test
    public void pluralizeThreeHorsesTest(){
        String expected = "I own 3 horses";
        String actual = Pluralize.pluralize("horse",3);
        assertEquals(expected,actual);
    }

}