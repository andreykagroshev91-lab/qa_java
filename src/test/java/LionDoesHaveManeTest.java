import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(MockitoJUnitRunner.class)
public class LionDoesHaveManeTest {

    @Mock
    Feline felineMock;

    @Test
    public void maleLionShouldHaveMane() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        assertTrue("Самец должен иметь гриву", lion.doesHaveMane());
    }

    @Test
    public void femaleLionShouldNotHaveMane() throws Exception {
        Lion lion = new Lion("Самка", felineMock);
        assertFalse("Самка не должна иметь гриву", lion.doesHaveMane());
    }
}