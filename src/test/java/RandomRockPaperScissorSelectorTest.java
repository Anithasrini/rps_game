import org.junit.*;
import static org.junit.Assert.*;

public class RandomRockPaperScissorSelectorTest {

  @Test
  public void randomRockPaperScissorSelector_randomNumberGeneratorThatReturnsString_String(){
    RockPaperScissors rRPS = new RockPaperScissors();

    assertEquals(true, rRPS.randomRockPaperScissorSelector());
  }
}
