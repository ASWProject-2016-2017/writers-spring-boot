package asw.springboot.writers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@RestController
public class WriterController {
    private final Logger logger = Logger.getLogger("asw.springboot.writers");

    @Value("${production.uri}")
    private String productionUri;
    @Value("${masterpiece.uri}")
    private String masterpieceUri;

    @Value("${masterpiece.path}")
    private String masterpiecePath;
    @Value("${production.path}")
    private String productionPath;

    @RequestMapping("/writer/{name}/{year}")
    public String getWriterByNameAndYear(@PathVariable String name,@PathVariable int year) {
        String writer = "Lo scrittore" + " " + name.substring(0,1).toUpperCase() + name.substring(1) + " è famoso per "+ getMasterpieceByName(name) +
        " e nel " + year + " ha realizzato " + getProductionByNameAndYear(name, year) + " opere." ;
        logger.info("getWriterByNameAndYear(): " + writer);
        return writer;
    }
    @RequestMapping("/writer/{name}")
    public String getWriterByName(@PathVariable String name) {
        String writer = "Lo scrittore" + " " + name.substring(0,1).toUpperCase() + name.substring(1) + " è famoso per "+ getMasterpieceByName(name) +
        " e nella sua vita ha realizzato " + getProductionByName(name) + " opere." ;
        logger.info("getWriterByName(): " + writer);
        return writer;
    }

    public String getMasterpieceByName(String name) {
        return new RestTemplate().getForObject(masterpieceUri+masterpiecePath+"/{name}",String.class,name);
    }

    public String getProductionByNameAndYear(String name, int year) {

        return new RestTemplate().getForObject(productionUri+productionPath+"/{name}/{year}",String.class,name,year);
    }
    public String getProductionByName(String name) {

        return new RestTemplate().getForObject(productionUri+productionPath+"/{name}",String.class,name);
    }
}
