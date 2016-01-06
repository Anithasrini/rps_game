import org.junit.*;
import org.junit.Assert;

public class randomRockPaperScissorSelectorTest {
  @Test
  public void randomRockPaperScissorSelector_randomNumberGeneratorThatReturnsString_String(){
    RandomRockPaperScissorSelector rRPS = new RandomRockPaperScissorSelector;

    assertEquals(String, rRPS.randomRockPaperScissorSelector());
  }
}
