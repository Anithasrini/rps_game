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

  public String calculateWinner(String player1, String player2) {
    String winner = "";

    if(player1.equals("rock") && player2.equals("paper")) {
      winner = "player2";
    } // End if
    else if(player1.equals("rock") && player2.equals("scissors")) {
      winner = "player1";
    } // End else if
    else if(player1.equals("paper") && player2.equals("rock")) {
      winner = "player1";
    } // End else if
    else if(player1.equals("paper") && player2.equals("scissors")) {
      winner = "player2";
    } // End else if
    else if(player1.equals("scissors") && player2.equals("rock")) {
      winner = "player2";
    } // End else if
    else if(player1.equals("scissors") && player2.equals("paper")){
      winner = "player1";
    } // End else if
    else {
      winner = "tie game play again";
    }// End else
    return winner;
  }// End calculateWinner
}// End RockPaperScissors
