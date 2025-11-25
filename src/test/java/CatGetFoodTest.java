import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatGetFoodTest {

    @Mock
    Feline felineMock;

    @Test
    public void getFoodShouldReturnMeat() throws Exception {
        Mockito.when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(felineMock);
        assertEquals("Кот должен есть мясо",
                List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}