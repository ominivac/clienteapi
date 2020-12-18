package br.com.feing;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "api-service")
public interface ApiServiceProxy extends ApiService{

}
