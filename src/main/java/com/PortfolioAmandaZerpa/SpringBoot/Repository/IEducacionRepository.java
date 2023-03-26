package com.PortfolioAmandaZerpa.SpringBoot.Repository;

import com.PortfolioAmandaZerpa.SpringBoot.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository <Educacion,Long>{
    
}
