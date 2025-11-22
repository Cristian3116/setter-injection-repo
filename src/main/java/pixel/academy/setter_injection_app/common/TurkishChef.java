package pixel.academy.setter_injection_app.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TurkishChef  implements Chef{
    @Override
    public String getDailyRecipe() {
        return "Prepararea kebab si lucum";
    }
}
