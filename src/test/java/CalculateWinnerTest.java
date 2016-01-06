import org.junit.*;
import static org.junit.Assert.*;

public class CalculateWinnerTest {

  @Test
  public void calculateWinner_Player1RockPlayer2Paper2PlayerMode_Player2() {
    RockPaperScissors rps = new RockPaperScissors();
    assertEquals("player2", rps.calculateWinner("rock", "paper"));
  }

  @Test
  public void calculateWinner_Player1RockPlayer2Scissors2PlayerMode_Player1() {
    RockPaperScissors rps = new RockPaperScissors();
    assertEquals("player1", rps.calculateWinner("rock", "scissors"));
  }

  @Test
  public void calculateWinner_Player1PaperPlayer2Rock2PlayerMode_Player1() {
    RockPaperScissors rps = new RockPaperScissors();
    assertEquals("player1", rps.calculateWinner("paper", "rock"));
  }

  @Test
  public void calculateWinner_Player1PaperPlayer2Scissors2PlayerMode_Player2() {
    RockPaperScissors rps = new RockPaperScissors();
    assertEquals("player2", rps.calculateWinner("paper", "scissors"));
  }

  @Test
  public void calculateWinner_Player1ScissorsPlayer2Rock2PlayerMode_player2() {
    RockPaperScissors rps = new RockPaperScissors();
    assertEquals("player2", rps.calculateWinner("scissors", "rock"));
  }

  @Test
  public void calculateWinner_Player1ScissorsPlayer2paper2PlayerMode_player1() {
    RockPaperScissors rps = new RockPaperScissors();
    assertEquals("player1", rps.calculateWinner("scissors", "paper"));
  }

  @Test
  public void calculateWinner_Player1ScissorsPlayer2Scissor2PlayerMode_tie() {
    RockPaperScissors rps = new RockPaperScissors();
    assertEquals("tie", rps.calculateWinner("scissors", "scissor"));
  }

  @Test
  public void calculateWinner_Player1paperPlayer2paper2PlayerMode_tie() {
    RockPaperScissors rps = new RockPaperScissors();
    assertEquals("tie", rps.calculateWinner("paper", "paper"));
  }

  @Test
  public void calculateWinner_Player1RockPlayer2Rock2PlayerMode_tie() {
    RockPaperScissors rps = new RockPaperScissors();
    assertEquals("tie", rps.calculateWinner("rock", "rock"));
  }
} // End CalculateWinnerTest
