package com.projetaae.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetaae.course.entities.Order;

//Não é necessario inserir a annotation "@Repository" pois a interface UserRepository
//está herdando a annotation do JpaRepository
public interface OrderRepository extends JpaRepository<Order, Long>{

    
}
