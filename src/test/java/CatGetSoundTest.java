import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatGetSoundTest {

    @Mock
    Feline felineMock;

    @Test
    public void getSoundShouldReturnMeow() {
        Cat cat = new Cat(felineMock);
        assertEquals("Кот должен говорить 'Мяу'", "Мяу", cat.getSound());
    }
}