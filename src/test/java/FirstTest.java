import org.junit.Assert;
import org.junit.Test;

public class FirstTest {

    @Test
    public void firstTest(){
        Assert.assertEquals(5, 5);
    }

    @Test
    public void secondTest(){
        Assert.assertNotEquals(10 / 2 , 6);
    }
}
