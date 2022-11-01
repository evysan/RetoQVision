package co.com.prueba.automatizada.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BonBonitePageElement extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to Login").located(By.xpath("//*[@id=\"wrapper\"]/header/div[1]/div[2]/div[2]"));
    public static final Target INPUT_USER = Target.the("space where do we write the user").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password").located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("do to click to login").located(By.name("login"));

}
