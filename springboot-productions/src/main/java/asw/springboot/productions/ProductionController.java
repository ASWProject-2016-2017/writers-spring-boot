package asw.springboot.productions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class ProductionController {

    @Value("${productions}")
    private String productions;

    private final Logger logger = Logger.getLogger("asw.springboot.productions");

    @RequestMapping("/")
    public String getProductions() {
        String[] productionsArray = productions.split(",");
        int position = (int) (Math.round(Math.random()*(productionsArray.length-1)));
        String production = productionsArray[position];
        logger.info("getProductions(): " + production);
        return production;
    }
}
