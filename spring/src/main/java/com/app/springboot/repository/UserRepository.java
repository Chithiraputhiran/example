package com.app.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.springboot.model.Bike;

@Repository
public interface UserRepository extends JpaRepository<Bike, Long>{

}