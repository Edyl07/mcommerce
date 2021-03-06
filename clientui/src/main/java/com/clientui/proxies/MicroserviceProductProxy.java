package com.clientui.proxies;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.clientui.beans.ProductBean;

@FeignClient(name = "microservice-produits", url = "http://localhost:9001")
public interface MicroserviceProductProxy {

	 @GetMapping(value = "/Produits")
	 List<ProductBean> listeDesProduits();
	 
	 @GetMapping( value = "/Produits/{id}")
	 ProductBean recupererUnProduit(@PathVariable("id") int id);
}
