package com.PortfolioAmandaZerpa.SpringBoot.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    
    @NotNull
    @Size(min = 1, max = 50, message ="No cumple con la longitud.")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message ="No cumple con la longitud.")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 50, message ="No cumple con la longitud.")
    private String email;
    
    @NotNull
    @Size(min = 1, max = 500, message ="No cumple con la longitud.")
    private String descripcion;
    
    
    @Size(min = 1, max = 500, message ="No cumple con la longitud.")
    private String img;
    
}
