package com.projetaae.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetaae.course.entities.Category;

//Não é necessario inserir a annotation "@Repository" pois a interface CategoryRepository
//está herdando a annotation do JpaRepository
public interface CategoryRepository extends JpaRepository<Category, Long>{

    
}
