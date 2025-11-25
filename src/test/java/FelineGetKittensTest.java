import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FelineGetKittensTest {

    @Test
    public void getKittensWithoutParamShouldReturnOne() {
        Feline feline = new Feline();
        assertEquals("getKittens() без параметра должен возвращать 1", 1, feline.getKittens());
    }
}