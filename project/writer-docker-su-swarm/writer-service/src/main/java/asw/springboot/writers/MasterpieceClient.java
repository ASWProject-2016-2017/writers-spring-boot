package asw.springboot.writers;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("masterpiece")
public interface MasterpieceClient {

	@RequestMapping(value="/masterpiece/{author}", method=RequestMethod.GET)
	public String getMasterpieceByName(@PathVariable(value = "author") String author);

}