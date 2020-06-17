package com.clientui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clientui.beans.ProductBean;
import com.clientui.proxies.MicroserviceProductProxy;

@Controller
public class ClientController {
	
	@Autowired
	MicroserviceProductProxy mProductProxy;

	@RequestMapping("/")
	public String index(Model model) {
		
		List<ProductBean> produits = mProductProxy.listeDesProduits();
		
		model.addAttribute("produits", produits);
		
		return "Index";
	}
}
