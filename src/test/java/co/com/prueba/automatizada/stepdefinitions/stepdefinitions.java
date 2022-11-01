package co.com.prueba.automatizada.stepdefinitions;

import co.com.prueba.automatizada.questions.Validation;
import co.com.prueba.automatizada.tasks.Login;
import co.com.prueba.automatizada.tasks.OpenUp;
import co.com.prueba.automatizada.tasks.Search;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

public class stepdefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que quiero acceder al sitio de compras con mi datos de usuario$")
    public void queQuieroAccederAlSitioDeComprasConMiDatosDeUsuario(DataTable table) {
        List<List<String>> data = table.asLists(String.class);
        String username = data.get(1).get(0);
        String password = data.get(1).get(1);

        OnStage.theActorCalled("Eva").wasAbleTo(OpenUp.thePage(), Login.OnThePage(username, password));
    }


    @When("^eliga la opcion zapatos$")
    public void eligaLaOpcionZapatos() {
        OnStage.theActorCalled("Eva").attemptsTo(Search.the());
    }

    @Then("^escojo la talla$")
    public void escojoLaTalla(DataTable table) {
        List<List<String>> data = table.asLists(String.class);
        String talla = data.get(1).get(0);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validation.Talla(talla)));

    }
}
