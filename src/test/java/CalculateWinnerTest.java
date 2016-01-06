import org.junit.*;
import static org.junit.Assert.*;

public class CalculateWinnerTest {

  @Test
  public void calculateWinner_Player1RockPlayer2Paper2PlayerMode_Player2() {
    RockPaperScissors rps = new RockPaperScissors();
    assertEquals("player2", rps.calculateWinner("rock", "paper", "2player"));
  }

  @Test
  public void calculateWinner_Player1RockPlayer2Scissors2PlayerMode_Player1() {
    RockPaperScissors rps = new RockPaperScissors();
    assertEquals("player1", rps.calculateWinner("rock", "scissors", "2player"));
  }

  @Test
  public void calculateWinner_Player1RockPlayer2Rock2PlayerMode_tie() {
    RockPaperScissors rps = new RockPaperScissors();
    assertEquals("tie", rps.calculateWinner("rock", "rock", "2player"));
  }
} // End CalculateWinnerTest
