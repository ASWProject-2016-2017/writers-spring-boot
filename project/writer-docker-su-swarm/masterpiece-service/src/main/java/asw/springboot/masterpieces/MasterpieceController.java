package asw.springboot.masterpieces;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.logging.Logger;

@RestController
public class MasterpieceController {

    @Value("${masterpiece}")
    private String masterpieces;
    private final Logger logger = Logger.getLogger("asw.springboot.masterpieces");
    
    @RequestMapping("/{name}")
    public String getMasterpieces(@PathVariable String name) {
        String[] masterpiecesArray = masterpieces.split(",");
        int position = (int) (Math.round(Math.random()*(masterpiecesArray.length-1)));
        String masterpiece = masterpiecesArray[position];
        logger.info("getMasterpiece("+ name +"): " + masterpiece);
        return masterpiece;
    }
}
