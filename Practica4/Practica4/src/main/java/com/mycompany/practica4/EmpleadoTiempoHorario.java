package com.mycompany.practica4;
public class EmpleadoTiempoHorario extends Empleado{
    private double horasT;
    private double Tarifxh;

    public EmpleadoTiempoHorario(double horasT, double Tarifxh, String nombre) {
        super(nombre);
        this.horasT = horasT;
        this.Tarifxh = Tarifxh;
    }
    @Override
    public double CalSalMen(){
        return (Tarifxh*horasT)/12;
    }

    @Override
    public String toString() {
        return " de tiempo parcial trabajo" + horasT + "horas con una Tarifa x hora de" + Tarifxh;
    }
    
}
