package com.PortfolioAmandaZerpa.SpringBoot.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    
    private   String descripcion;
    private   String nombre;
    private   String fecha;
    private   String imagen;

    public Experiencia() {
    }

    public Experiencia(String descripcion, String nombre, String fecha, String imagen) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.fecha = fecha;
        this.imagen = imagen;
    }
    
}
