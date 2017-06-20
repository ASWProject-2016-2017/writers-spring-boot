package asw.springboot.writers;

import asw.springboot.writers.client.ProductionClient;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ProductionServiceImpl implements ProductionService{
	@Autowired
	private ProductionClient productionClient;

	@HystrixCommand(fallbackMethod="getFallbackProductionByName")
	public String getProductionByName(String author){
		return productionClient.getProductionByName(author);
	}
	public String getFallbackProductionByName(String author) {
		return "production by name doesn't work"; 
	}
	@HystrixCommand(fallbackMethod="getFallbackProductionByNameAndYear")
	public String getProductionByNameAndYear(String author,int year){
		return productionClient.getProductionByNameAndYear(author,year);
	}
	public String getFallbackProductionByNameAndYear(String author,int year) {
		return "production by name and year doesn't work"; 
	}

}