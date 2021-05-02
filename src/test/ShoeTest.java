package test;
import org.junit.Test;
import static test.Shoe.*;
import static org.junit.Assert.assertEquals;
public class ShoeTest {
    Shoe[] col = new Shoe[2];
    @Test
    public void getIndexOfAShoe() {
        Shoe s1 = new Shoe("Nike", "Red");
        Shoe s2 = new Shoe("Puma", "Black");
        col[0] = s1;
        col[1] = s2;
        int output = getIndexOfShoe(col, s1);
        assertEquals(0, output);
    }
    @Test
    public void getShoesOfOnlyOneColor() {
        Shoe s1 = new Shoe("Nike", "Red");
        Shoe s2 = new Shoe("Puma", "Red");
        Shoe s3 = new Shoe("Adidas", "White");
        Shoe s4 = new Shoe("New Balance", "Silver");
        Shoe s5 = new Shoe("Adidas", "Blue");
        insertNewShoe(col, s1);
        insertNewShoe(col, s2);
        insertNewShoe(col, s3);
        insertNewShoe(col, s4);
        insertNewShoe(col, s5);
        Shoe[] output = getAllShoesWithColor(col, "Red");
        Shoe[] expec = {s1, s2};
        assertEquals(expec, output);
    }

}
