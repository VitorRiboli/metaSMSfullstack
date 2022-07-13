package com.vitor.metasms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitor.metasms.entities.Sale;
import com.vitor.metasms.repositories.SaleRepository;

/*Responsavel por implementar operações de negocio, operação de buscar as vendas
 *Operação que busca no banco de dados as vendas  */

@Service /*Registrando como componente do sistema */
public class SalesService {
	
	@Autowired /*Anotation para autoimportação */
	private SaleRepository  repository;

	/*Função que retorna uma lista de vendas; List<tipoDeCadaObjeto> */
	public List<Sale> findSales() {
		return repository.findAll();  /*Retorna uma busca completa(findAll) do repository  */
	}
}
