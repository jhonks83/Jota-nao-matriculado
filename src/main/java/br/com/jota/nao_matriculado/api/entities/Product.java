package br.com.jota.nao_matriculado.api.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
	private Long id;
	private String name;
	private double price;
	private int stock;
}