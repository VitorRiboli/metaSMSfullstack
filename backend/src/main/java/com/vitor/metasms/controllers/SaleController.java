package com.vitor.metasms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vitor.metasms.entities.Sale;
import com.vitor.metasms.services.SalesService;

/*Vai implementar a API, controller vai disponibilizar os EndPoints que o
 * FrontEnd vai precisar para acessar o BackEnd 
 * */

@RestController /*Configura que é um componente, um controlador */
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired 
	private SalesService service;

	/*Metodo para disponibilizar as vendas para o frontEnd */
	@GetMapping /*Anotation para responder via web atraves do HTTP */
	public Page<Sale> findSales(
			@RequestParam(value = "minDate", defaultValue = "") String minDate, 
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate, 
			Pageable pageable) { /*Page vai voltar apenas as 20 primeiras, em um resultado paginado */
		return service.findSales(minDate, maxDate, pageable);
	}
}
