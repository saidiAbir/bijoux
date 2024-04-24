package com.abir.bijoux.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abir.bijoux.entities.Bijoux;

public interface BijouxRepository extends JpaRepository<Bijoux, Long> {

}
