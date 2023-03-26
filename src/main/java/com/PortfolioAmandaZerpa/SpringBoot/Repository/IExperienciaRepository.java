package com.PortfolioAmandaZerpa.SpringBoot.Repository;

import com.PortfolioAmandaZerpa.SpringBoot.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository <Experiencia,Integer> {
    public Optional<Experiencia> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    
}
