package co.com.heroku.app.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "C:\\Users\\QV-4106\\Documents\\Ejercicios\\Herokuapp\\src\\test\\resources\\features\\addremove.feature",
        glue = "co/com/heroku/app/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AddRemoveRunner {
}
