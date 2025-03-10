package br.com.jota.nao_matriculado.api.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.jota.nao_matriculado.api.entities.Product;
import br.com.jota.nao_matriculado.api.repository.ProductRepository;

public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public void store(Product product)
	{
		productRepository.save(product);
	}
	
	public List<Product> list()
	{
		return productRepository.findAll();
	}
}
