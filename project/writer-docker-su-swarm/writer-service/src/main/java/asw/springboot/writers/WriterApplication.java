package asw.springboot.writers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
// import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
// @EnableZuulProxy 
public class WriterApplication {

	public static void main(String[] args) {
		SpringApplication.run(WriterApplication.class, args);
	}
}
