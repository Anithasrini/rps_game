import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest_h1() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Welcome to the Ro-Sham-Beaux game");
  }

  @Test
  public void rootTest_2playerbtn() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("2 Player Game");
  }
}
