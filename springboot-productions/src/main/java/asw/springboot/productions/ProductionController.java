package asw.springboot.productions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class ProductionController {

    @Value("${productions}")
    private String productions;

    private final Logger logger = Logger.getLogger("asw.springboot.productions");

    @RequestMapping("/productions/{name}/{year}")
    public String getPubblicationsByNameAndYear(@PathVariable String name, @PathVariable int year) {
        String production = getRandomNumber();
        logger.info("getPubblicationsByNameAndYear("+name+" "+year+"): " + production);

        return production;
    }

    @RequestMapping("/productions/{name}")
    public String getPubblicationsByName(@PathVariable String name) {
        String production = getRandomNumber();
        logger.info("getPubblicationsByName("+name+"): " + production);

        return production;
    }

    public String getRandomNumber(){
        String[] productionsArray = productions.split(",");
        int position = (int) (Math.round(Math.random()*(productionsArray.length-1)));
        return productionsArray[position];
    }
}
