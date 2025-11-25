import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetKittensWithCountTest {

    private int inputCount;
    private int expectedCount;
    private Feline feline = new Feline();

    public FelineGetKittensWithCountTest(int inputCount, int expectedCount) {
        this.inputCount = inputCount;
        this.expectedCount = expectedCount;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {0, 0},
                {1, 1},
                {3, 3},
                {5, 5}
        });
    }

    @Test
    public void getKittensWithParamShouldReturnCorrectCount() {
        assertEquals("getKittens(count) должен возвращать переданное количество",
                expectedCount, feline.getKittens(inputCount));
    }
}