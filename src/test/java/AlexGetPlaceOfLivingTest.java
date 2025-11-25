import com.example.Alex;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexGetPlaceOfLivingTest {

    @Mock
    Feline felineMock;

    @Test
    public void getPlaceOfLivingShouldReturnNewYorkZoo() throws Exception {
        Alex alex = new Alex(felineMock);
        assertEquals("Алекс должен жить в Нью-Йоркском зоопарке",
                "Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }
}