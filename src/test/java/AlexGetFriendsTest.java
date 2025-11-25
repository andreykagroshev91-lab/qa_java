import com.example.Alex;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexGetFriendsTest {

    @Mock
    Feline felineMock;

    @Test
    public void getFriendsShouldReturnCorrectList() throws Exception {
        Alex alex = new Alex(felineMock);
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        assertEquals("Друзья Алекса должны быть Марти, Глория, Мелман",
                expectedFriends, alex.getFriends());
    }
}