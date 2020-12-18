package br.com.feing;

import java.util.List;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients(basePackageClasses = ApiServiceProxy.class)
public class ApiController implements ApiServiceProxy {
	
	private ApiServiceProxy proxy;

	
	public ApiController(ApiServiceProxy proxy) {
		this.proxy = proxy;
	}


	@Override
	@GetMapping("/posts")
	public List<Object> getPosts() {
		return proxy.getPosts();
	}
	
	

}
