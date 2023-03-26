package com.PortfolioAmandaZerpa.SpringBoot.Interface;

import com.PortfolioAmandaZerpa.SpringBoot.Entity.Proyecto;
import java.util.List;

public interface IProyectoService {
    
    //Traer una lista
    public List<Proyecto> getProyecto();
    
    //Guardar un objeto
    public void saveProyecto(Proyecto proyecto);
    
    //Eliminar una educacion por ID
    public void deleteProyecto(Long Id);
    
    //Buscar una educacion por ID
    public Proyecto findProyecto(Long Id);
}
