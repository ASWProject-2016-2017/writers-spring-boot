package asw.springboot.writers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@RestController
public class MasterpieceController {
    private final Logger logger = Logger.getLogger("asw.springboot.writers");

    @Value("${production.uri}")
    private String productionUri;
    @Value("${masterpiece}")
    private String masterpiecetUri;

    @Value("${production.path}")
    private String productionPath;

    @RequestMapping("/writer/{name}")
    public String getWriter(@PathVariable String name) {
        String writer = "Lo scrittore" + " " + name.substring(0,1).toUpperCase() + name.substring(1) + " è famoso per "+ getMasterpiecetUri() +
        " e nella sua vita ha realizzato " + getProductionByName(name) + " opere." ;
        logger.info("getWriter(): " + writer);
        return writer;
    }
    private String getWord(String uri) {
        return new RestTemplate().getForObject(uri,String.class);
    }
    public String getMasterpiecetUri() {
        return getWord(masterpiecetUri);
    }

    public String getProductionByName(String name) {

        return new RestTemplate().getForObject(productionUri+productionPath+"/{name}",String.class,name);
    }
}

