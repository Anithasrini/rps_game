import java.util.HashMap;
import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/form2Player", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/form2Player.vtl");

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/form1Player", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/form1Player.vtl");

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/main", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/main.vtl");

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/output", (request, response) -> {
      HashMap model = new HashMap();

      String p1 = request.queryParams("player1");
      String p2 = request.queryParams("player2");

      RockPaperScissors rps = new RockPaperScissors();
      if(p2 == null){
        p2 = rps.randomRockPaperScissorSelector();
      }

      String rpsWinner = rps.calculateWinner(p1, p2);
      model.put("p2", p2);
      model.put("rpsWinner", rpsWinner);
      model.put("template", "templates/output.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
