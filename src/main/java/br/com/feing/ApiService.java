package br.com.feing;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

/*
 * Define os endpoints para o consumo da api
 */
public interface ApiService {

	@GetMapping("/posts")
	public List<Object> getPosts();
	
	
}
