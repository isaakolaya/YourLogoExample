package questions;

import model.TablaDatosFeature;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.PaymentMethodSectionInterface;

public class Answer implements Question {

    private final TablaDatosFeature tablaDatosFeature;

    public static Question<Boolean> toThe(TablaDatosFeature tablaDatosFeature) {
        return new Answer(tablaDatosFeature);
    }

    public Answer(TablaDatosFeature tablaDatosFeature) {
        this.tablaDatosFeature = tablaDatosFeature;
    }

    @Override
    public Object answeredBy(Actor actor) {
        boolean result;
        String question = tablaDatosFeature.getValidation();
        String nameCourse = Text.of(PaymentMethodSectionInterface.NAME_QUESTION).viewedBy(actor).asString();

        if (question.equals(nameCourse)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
