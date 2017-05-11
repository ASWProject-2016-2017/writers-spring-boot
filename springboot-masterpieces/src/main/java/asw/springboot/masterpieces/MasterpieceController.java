package asw.springboot.masterpieces;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class MasterpieceController {

    @Value("${masterpieces}")
    private String masterpieces;

    private final Logger logger = Logger.getLogger("asw.springboot.masterpieces");

    @RequestMapping("/")
    public String getMasterpieces() {
        String[] masterpiecesArray = masterpieces.split(",");
        int position = (int) (Math.round(Math.random()*(masterpiecesArray.length-1)));
        String masterpiece = masterpiecesArray[position];
        logger.info("getMasterpieces(): " + masterpiece);
        return masterpiece;
    }
}
