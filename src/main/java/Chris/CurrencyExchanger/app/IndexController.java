package Chris.CurrencyExchanger.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String convert() {
        return "convert-currency";
    }
}
