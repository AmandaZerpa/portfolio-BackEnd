package com.PortfolioAmandaZerpa.SpringBoot.Repository;

import com.PortfolioAmandaZerpa.SpringBoot.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepository  extends JpaRepository <Proyecto,Long>{
    
}
