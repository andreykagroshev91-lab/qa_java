import com.example.Alex;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexGetKittensTest {

    @Mock
    Feline felineMock;

    @Test
    public void getKittensShouldReturnZero() throws Exception {
        Alex alex = new Alex(felineMock);
        assertEquals("У Алекса не должно быть котят", 0, alex.getKittens());
    }
}