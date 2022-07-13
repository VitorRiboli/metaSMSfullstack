package com.vitor.metasms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.metasms.entities.Sale;

/*componente do sistema responsável por acessar o banco de dados
 * Salvar uma venda
 * deletar uma venda
 * buscar vendas
 * atualizar vendas...*/
public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}

	
