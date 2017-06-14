package asw.springboot.writers;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class MasterpieceServiceImpl implements MasterpieceService{
	@Autowired
	private MasterpieceClient masterpieceClient;

	@HystrixCommand(fallbackMethod="getFallbackMasterpieceByName")
	public String getMasterpieceByName(String author){
		return masterpieceClient.getMasterpieceByName(author);
	}
	public String getFallbackMasterpieceByName() {
		return "Someone does something"; 
	}


}