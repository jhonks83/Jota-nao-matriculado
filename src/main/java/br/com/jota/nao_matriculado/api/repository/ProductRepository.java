package br.com.jota.nao_matriculado.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jota.nao_matriculado.api.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
