import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionGetKittensTest {

    @Mock
    Feline felineMock;

    @Test
    public void getKittensShouldReturnFromFeline() throws Exception {
        Mockito.when(felineMock.getKittens()).thenReturn(3);
        Lion lion = new Lion("Самец", felineMock);
        assertEquals("Lion.getKittens() должен возвращать значение из Feline", 3, lion.getKittens());
    }
}