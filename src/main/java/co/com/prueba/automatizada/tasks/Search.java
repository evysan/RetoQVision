package co.com.prueba.automatizada.tasks;

import co.com.prueba.automatizada.userinterface.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class Search implements Task {
    public static Search the() {
        return Tasks.instrumented(Search.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SearchPage.CATEGORY),
                Click.on(SearchPage.CHOOSE_ELEMENT),
                SelectFromOptions.byVisibleText("36").from(SearchPage.SELECT_TALLA)
        );
    }
}
