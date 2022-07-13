package com.vitor.metasms.entities;

import java.time.LocalDate;  /*Importando da biblioteca */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity /*Anotation é uma palavra especial que bota perto de uma classe, atributo, elemento... para que seja feito um pre-processamento para compilar o projeto */
@Table(name = "tb_sales")
public class Sale {
	
	@Id /*Essa anotation faz com que o id nao se repita */
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*Serve para que cada venda receba o proximo ID, seguindo uma sequencia*/
	private Long id; /*Long é um tipo de dado neste caso um número inteiro */
	private String sellerName; /*String é um tipo de dado de texto */
	private Integer visited; /*Integer tambem é um tipo de dado númerico, mas aceita valores menores, o que vai poupar memoria neste caso */
	private Integer deals;
	private Double amount; /*Double é um tipo de dado numerico para números quebrados  */
	private LocalDate date; /*Tipo de dado que vem nas bibliotecas, para importa-lo ctrl + shift + O */

	/* declarando um função que serve criar o objeto, função construtora */
	
	public Sale() {
		
	}
	
	/*Metodos de acesso que serve para acessar os dados private a partir de outras classes*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
	
}
