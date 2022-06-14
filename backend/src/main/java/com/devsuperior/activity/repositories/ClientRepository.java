package com.devsuperior.activity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.activity.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
