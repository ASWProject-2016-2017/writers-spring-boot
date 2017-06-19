package asw.springboot.writers;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient("production")
public interface ProductionClient {

	@RequestMapping(value="/{author}", method=RequestMethod.GET)
	public String getProductionByName(@PathVariable(value= "author") String author);
	
	@RequestMapping(value="/{author}/{year}", method=RequestMethod.GET)
	public String getProductionByNameAndYear(@PathVariable(value="author") String author,@PathVariable(value = "year") int year);

}