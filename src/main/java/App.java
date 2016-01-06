import java.util.HashMap;
import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/form", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/form.vtl");

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/output", (request, response) -> {
      HashMap model = new HashMap();

      String p1 = request.queryParams("player1");
      String p2 = request.queryParams("player2");

      RockPaperScissors rps = new RockPaperScissors();
      String rpsWinner = rps.calculateWinner(p1, p2);

      model.put("rpsWinner", rpsWinner);
      model.put("template", "templates/output.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
