package co.com.prueba.automatizada.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Dropdown;
import org.openqa.selenium.By;

public class SearchPage extends PageObject {
    public static final Target CATEGORY = Target.the("select the category").located(By.xpath("//*[@id=\"menu-item-10\"]/a"));
    public static final Target CHOOSE_ELEMENT = Target.the("search element").located(By.xpath("//*[@id=\"wrapper\"]/div[5]/ul/li[2]/a/img"));
    public static final SearchableTarget SELECT_TALLA = Dropdown.withNameOrId("pa_talla");
    }
