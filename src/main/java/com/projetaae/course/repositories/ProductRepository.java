package com.projetaae.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetaae.course.entities.Product;

//Não é necessario inserir a annotation "@Repository" pois a interface ProductRepository
//está herdando a annotation do JpaRepository
public interface ProductRepository extends JpaRepository<Product, Long>{

    
}
