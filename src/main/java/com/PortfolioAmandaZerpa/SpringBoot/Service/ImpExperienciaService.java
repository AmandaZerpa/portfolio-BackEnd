package com.PortfolioAmandaZerpa.SpringBoot.Service;

import com.PortfolioAmandaZerpa.SpringBoot.Entity.Experiencia;
import com.PortfolioAmandaZerpa.SpringBoot.Repository.IExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class ImpExperienciaService {
    @Autowired IExperienciaRepository iexperienciaRepository;
    
    public List<Experiencia> list() {
        return iexperienciaRepository.findAll();
    }

    public Optional<Experiencia> getOne(int id){
         return iexperienciaRepository.findById(id);
     }
     
     public Optional<Experiencia> getByNombre(String nombre){
         return iexperienciaRepository.findByNombre(nombre);
     }
     
     public void save(Experiencia expe){
         iexperienciaRepository.save(expe);
     }
     
     public void delete(int id){
         iexperienciaRepository.deleteById(id);
     }
     
     public boolean existsById(int id){
         return iexperienciaRepository.existsById(id);
     }
     
     public boolean existsByNombre(String nombre){
         return iexperienciaRepository.existsByNombre(nombre);
     }
    
}
