package com.mycompany.practica4;
public abstract class Empleado {
    public String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    public abstract double CalSalMen();

    @Override
    public String toString() {
        return "El nombre del empleado es "+ nombre;
    }
    
}
