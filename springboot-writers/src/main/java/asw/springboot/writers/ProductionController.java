package asw.springboot.writers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@RestController
public class ProductionController {
    private final Logger logger = Logger.getLogger("asw.springboot.writers");


    @Value("${masterpiece}")
    private String masterpiecetUri;

    @Value("${production}")
    private String productionUri;

    @RequestMapping("/writer/{name}/{year}")
    public String getWriter(@PathVariable String name,@PathVariable int year) {
        String writer = "Lo scrittore" + " " + name.substring(0,1).toUpperCase() + name.substring(1) + " è famoso per "+ getMasterpiecetUri() +
        " e nel " + year + " ha realizzato " + getProductionUri() + " opere." ;
        logger.info("getWriter(): " + writer);
        return writer;
    }


    private String getWord(String uri) {
        return new RestTemplate().getForObject(uri,String.class);
    }
    public String getMasterpiecetUri() {
        return getWord(masterpiecetUri);
    }

    public String getProductionUri() {
        return getWord(productionUri);
    }
}
