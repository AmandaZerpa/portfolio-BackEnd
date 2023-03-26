package com.PortfolioAmandaZerpa.SpringBoot.Repository;

import com.PortfolioAmandaZerpa.SpringBoot.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository <Persona,Long> {
    
}
