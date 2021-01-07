package com.projetaae.course.repositories;

import com.projetaae.course.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{

    
}
