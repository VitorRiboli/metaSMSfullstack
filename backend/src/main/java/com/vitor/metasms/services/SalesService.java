package com.vitor.metasms.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault()); /*Cria uma data com o dia atual do sistema */
		
		
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate); /*Se o minDate for igual a uma string vazia, utilize a variavel today - 365 dias */
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate); /*se maxDate for igual a uma string vazia, use a variavel today, se não use a data que foi passada (CONDIOÇÃO TERNARIA TESTADA) */
		
		return repository.findSales(min, max, pageable);  /*Retorna uma busca completa(findAll) do repository  */
	}
}
