package co.com.prueba.automatizada.tasks;


import co.com.prueba.automatizada.userinterface.BonBonitePage;
import co.com.prueba.automatizada.userinterface.BonBonitePageElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Login OnThePage(String username, String password) {
        return Tasks.instrumented(Login.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(Click.on(BonBonitePageElement.LOGIN_BUTTON),
                Enter.theValue(username).into(BonBonitePageElement.INPUT_USER),
                Enter.theValue(password).into(BonBonitePageElement.INPUT_PASSWORD),
                Click.on(BonBonitePageElement.ENTER_BUTTON));
    }
}
