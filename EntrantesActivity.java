package com.midominio.restaurante;

public class Entrante {

    public String nombre;
    public String descripcion;
    public double precio;

    public Entrante(String nombre, String descripcion, double precio){

        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;
    }
    @Override
    public String toString(){

      return nombre;
    }
}
