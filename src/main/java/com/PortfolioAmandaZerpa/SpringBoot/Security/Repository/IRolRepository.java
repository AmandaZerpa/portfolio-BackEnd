package com.PortfolioAmandaZerpa.SpringBoot.Security.Repository;

import com.PortfolioAmandaZerpa.SpringBoot.Security.Entity.Rol;
import com.PortfolioAmandaZerpa.SpringBoot.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
