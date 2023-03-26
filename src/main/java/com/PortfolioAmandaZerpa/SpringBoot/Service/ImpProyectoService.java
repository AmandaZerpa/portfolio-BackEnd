package com.PortfolioAmandaZerpa.SpringBoot.Service;

import com.PortfolioAmandaZerpa.SpringBoot.Entity.Proyecto;
import com.PortfolioAmandaZerpa.SpringBoot.Interface.IProyectoService;
import com.PortfolioAmandaZerpa.SpringBoot.Repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProyectoService implements IProyectoService {
    @Autowired IProyectoRepository iproyectoRepository;

    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> proyecto = iproyectoRepository.findAll();
        return proyecto;
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        iproyectoRepository.save(proyecto);
    }

    @Override
    public void deleteProyecto(Long Id) {
        iproyectoRepository.deleteById(Id);
    }

    @Override
    public Proyecto findProyecto(Long Id) {
        Proyecto proyecto = iproyectoRepository.findById(Id).orElse(null);
        return proyecto;
    }
    
}
