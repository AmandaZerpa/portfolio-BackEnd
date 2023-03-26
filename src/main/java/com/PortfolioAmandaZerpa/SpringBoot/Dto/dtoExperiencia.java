package com.PortfolioAmandaZerpa.SpringBoot.Dto;


import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombre;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String fecha;
    @NotBlank
    private String imagen;
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombre, String descripcion, String fecha, String imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.imagen = imagen;
    }
    //Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}
