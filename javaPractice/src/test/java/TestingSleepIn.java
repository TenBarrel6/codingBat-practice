import org.testng.Assert;
import org.testng.annotations.Test;
import warmup1.SleepIn;

public class TestingSleepIn {

    @Test
    public void sleepIn_Test_1(){
        Assert.assertTrue(SleepIn.sleepInTest(false, false));
    }

    @Test
    public void sleepIn_Test_2(){
        Assert.assertFalse(SleepIn.sleepInTest(true, false));
    }

    @Test
    public void sleepIn_Test_3(){
        Assert.assertTrue(SleepIn.sleepInTest(false, true));
    }

    @Test
    public void sleepIn_Test_4(){
        Assert.assertTrue(SleepIn.sleepInTest(true, true));
    }
}
