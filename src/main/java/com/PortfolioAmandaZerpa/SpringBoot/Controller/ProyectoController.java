package com.PortfolioAmandaZerpa.SpringBoot.Controller;

import com.PortfolioAmandaZerpa.SpringBoot.Entity.Proyecto;
import com.PortfolioAmandaZerpa.SpringBoot.Interface.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectoController {
    @Autowired IProyectoService iproyectoService;
    
    @GetMapping("/proyecto/traer")
    public List<Proyecto> getProyecto(){
        return iproyectoService.getProyecto();
    }
    
    @PostMapping("/proyecto/crear")
    public String createProyecto(@RequestBody Proyecto proyecto){
        iproyectoService.saveProyecto(proyecto);
        return "El proyecto fue creado correctamente.";
    }
    
    @DeleteMapping("/proyecto/borrar/{id}")
    public String deleteProyecto(@PathVariable("id") Long Id){
        iproyectoService.deleteProyecto(Id);
        return "El proyecto fue eliminado correctamente.";
    }
    
    @PutMapping("/proyecto/editar/{id}")
    public Proyecto editProyecto(@PathVariable("id")Long Id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("descripcion") String nuevoDescripcion,
                               @RequestParam("tecnologias") String nuevoTecnologias,
                               @RequestParam("fecha") String nuevoFecha,
                               @RequestParam("imagen") String nuevoImagen){
        Proyecto proyecto = iproyectoService.findProyecto(Id);
        
        proyecto.setNombre(nuevoNombre);
        proyecto.setDescripcion(nuevoDescripcion);
        proyecto.setTecnologias(nuevoTecnologias);
        proyecto.setFecha(nuevoFecha);
        proyecto.setImagen(nuevoImagen);
        
        iproyectoService.saveProyecto(proyecto);
        return proyecto;
    }
}
