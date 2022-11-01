package co.com.prueba.automatizada.questions;

import co.com.prueba.automatizada.userinterface.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.SelectedValue;
import net.serenitybdd.screenplay.questions.Text;

public class Validation implements Question {

    private String questions;

    public Validation(String question){
        this.questions = question;
    }

    public static Validation Talla(String question) {
        return new Validation(question);
    }

    @Override
    public Object answeredBy(Actor actor) {
        boolean result;
        String talla = actor.asksFor(SelectedValue.of(SearchPage.SELECT_TALLA));
        result = questions.equals(talla);
        return result;
    }
}
