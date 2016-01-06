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
    }
  }
}
