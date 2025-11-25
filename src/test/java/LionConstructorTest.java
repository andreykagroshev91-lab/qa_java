import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class LionConstructorTest {

    private final String sex;                    // добавил final
    private final Boolean expectedHasMane;      // добавил final
    private final Boolean shouldThrowException; // добавил final
    private final Feline felineMock = Mockito.mock(Feline.class); // добавил final

    public LionConstructorTest(String sex, Boolean expectedHasMane, Boolean shouldThrowException) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
        this.shouldThrowException = shouldThrowException;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"Самец", true, false},
                {"Самка", false, false},
                {"Неизвестный", null, true}
        });
    }

    @Test
    public void lionConstructorShouldWorkCorrectly() throws Exception {
        if (shouldThrowException) {
            try {
                new Lion(sex, felineMock);
                fail("Должно быть выброшено исключение для невалидного пола");
            } catch (Exception e) {
                assertEquals("Сообщение об ошибке должно быть корректным",
                        "Используйте допустимые значения пола животного - самец или самка", e.getMessage());
            }
        } else {
            Lion lion = new Lion(sex, felineMock);
            assertEquals("Грива должна соответствовать полу", expectedHasMane, lion.doesHaveMane());
        }
    }
}