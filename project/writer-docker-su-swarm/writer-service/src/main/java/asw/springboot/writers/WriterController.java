package asw.springboot.writers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.logging.Logger;

@RestController
public class WriterController {
    private final Logger logger = Logger.getLogger("asw.springboot.writers");
    
    @Autowired
    private MasterpieceService masterpieceService;
    @Autowired 
    private ProductionService productionService;

    @RequestMapping("/{name}/{year}")
    public String getWriterByNameAndYear(@PathVariable String name,@PathVariable int year) {
        String writer = "Lo scrittore" + " " + name.substring(0,1).toUpperCase() + name.substring(1) + " è famoso per "+ masterpieceService.getMasterpieceByName(name) +
        " e nel " + year + " ha realizzato " + productionService.getProductionByNameAndYear(name, year) + " opere." ;
        logger.info("getWriterByNameAndYear(): " + writer);
        return writer;
    }
    @RequestMapping("/{name}")
    public String getWriterByName(@PathVariable String name) {
        String writer = "Lo scrittore" + " " + name.substring(0,1).toUpperCase() + name.substring(1) + " è famoso per "+ masterpieceService.getMasterpieceByName(name) +
        " e nella sua vita ha realizzato " + productionService.getProductionByName(name) + " opere." ;
        logger.info("getWriterByName(): " + writer);
        return writer;
    }
}
