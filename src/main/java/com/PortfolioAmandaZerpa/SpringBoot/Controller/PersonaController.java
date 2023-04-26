package com.PortfolioAmandaZerpa.SpringBoot.Controller;

import com.PortfolioAmandaZerpa.SpringBoot.Entity.Persona;
import com.PortfolioAmandaZerpa.SpringBoot.Interface.IPersonaService;
import java.util.List;
import javax.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://azportafolio-19a6e.web.app")
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    @RolesAllowed("ROLE_ADMIN")
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente.";
    }
    
    @RolesAllowed("ROLE_ADMIN")
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable("id") Long Id){
        ipersonaService.deletePersona(Id);
        return "La persona fue eliminada correctamente.";
    }
    
    @RolesAllowed("ROLE_ADMIN")
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable("id")Long Id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam("email") String nuevoEmail,
                               @RequestParam("descripcion") String nuevoDescripcion,
                               @RequestParam("img") String nuevoImg){
        Persona persona = ipersonaService.findPersona(Id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setEmail(nuevoEmail);
        persona.setDescripcion(nuevoDescripcion);
        persona.setImg(nuevoImg);
        
        ipersonaService.savePersona(persona);
        return persona;
    }
    
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaService.findPersona((long)2);
    }
}
