package app.netlify.bugbank.testcases;

import app.netlify.bugbank.utils.BaseTest;
import app.netlify.bugbank.utils.Property;
import app.netlify.bugbank.webdrivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BugBankTestCase extends BaseTest {

    @Test(
            description = "Criar duas contas com saldo e realizar uma transferência valor para outra.",
            priority = 1,
            groups = {"web"}
    )
    public void BugBank() {
        WebDriver driver = DriverManager.getDriver();
        driver.get(Property.get("url"));
    }
}