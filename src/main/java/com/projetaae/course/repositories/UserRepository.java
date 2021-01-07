package com.projetaae.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetaae.course.entities.User;

//Não é necessario inserir a annotation "@Repository" pois a interface UserRepository
//está herdando a annotation do JpaRepository
public interface UserRepository extends JpaRepository<User, Long>{

    
}
