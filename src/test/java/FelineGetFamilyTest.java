import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FelineGetFamilyTest {

    @Test
    public void getFamilyShouldReturnFeline() {
        Feline feline = new Feline();
        assertEquals("Семейство должно быть 'Кошачьи'", "Кошачьи", feline.getFamily());
    }
}