package tests.TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        monochrome = true,

        features = {"src/main/resources/features"}
        , glue = {"tests"}
          , plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},


      tags = "@missingEmail or   @invalidEmailFormat or @Phone_Purchase"
)
public class TestRunner extends AbstractTestNGCucumberTests  {
}
