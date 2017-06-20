package asw.springboot.writers.service;

import asw.springboot.writers.client.MasterpieceClient;
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
	public String getFallbackMasterpieceByName(String author) {
		return "masterpiece doesn't work"; 
	}

}