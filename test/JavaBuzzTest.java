import org.junit.*;

public class JavaBuzzTest {

    private JavaBuzz javaBuzz;

    @Before
    public void initialize() {
        javaBuzz = new JavaBuzz();
    }

    @Test
    public void returnsNumber() {
        String str = javaBuzz.play(1);
        Assert.assertEquals(str, "1");
    }

    @Test
    public void returnsDifferentNumber() {
        String str = javaBuzz.play(2);
        Assert.assertEquals(str, "2");
    }

    @Test
    public void returnsFizzForThree() {
        String str = javaBuzz.play(3);
        Assert.assertEquals(str, "Fizz");
    }

    @Test
    public void returnsFizzForSix() {
        String str = javaBuzz.play(6);
        Assert.assertEquals(str, "Fizz");
    }

    @Test
    public void returnsBuzzForFive() {
        String str = javaBuzz.play(5);
        Assert.assertEquals(str, "Buzz");
    }

    @Test
    public void returnsBuzzForTen() {
        String str = javaBuzz.play(10);
        Assert.assertEquals(str, "Buzz");
    }

    @Test
    public void returnsFizzBuzzForFifteen() {
        String str = javaBuzz.play(15);
        Assert.assertEquals(str, "FizzBuzz");
    }

    @Test
    public void returnsFizzBuzzForThirty() {
        String str = javaBuzz.play(30);
        Assert.assertEquals(str, "FizzBuzz");
    }
}
