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
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    
    @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la longitud.")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la longitud.")
    private   String descripcion;
    
    @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la longitud.")
    private   String tecnologias;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud.")
    private   String fecha;
    
    
    @Size(min = 1, max = 500, message = "No cumple con la longitud.")
    private   String imagen;
}
