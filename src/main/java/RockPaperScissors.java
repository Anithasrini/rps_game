import java.util.Random;

public class RockPaperScissors {

  public String randomRockPaperScissorSelector() {
    Random myRandomInt = new Random();

    int randomNumber = myRandomInt.nextInt(2);

    switch(randomNumber) {
      case 0:
        return "rock";
      case 1:
        return "paper";
      case 2:
        return "scissors";
      default:
        return "error";
    } // End Switch
  }// End randomRockPaperScissorSelector

  public String calculateWinner(String player1, String player2, String gameMode) {
    String winner = "";

    if(player1 == "rock" && player2 == "paper" && gameMode == "2player") {
      winner = "player2";
    } // End if
    else if(player1 == "rock" && player2 == "scissors" && gameMode == "2player") {
      winner = "player1";
    } // End else if
    else if(player1 == "rock" && player2 == "rock" && gameMode == "2player") {
      winner = "tie";
    } // End else if
    return winner;
  }
}
