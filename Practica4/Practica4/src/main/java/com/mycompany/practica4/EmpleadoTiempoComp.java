package com.mycompany.practica4;
public class EmpleadoTiempoComp extends Empleado{
    private double salarioA;

    public EmpleadoTiempoComp(double salarioA, String nombre) {
        super(nombre);
        this.salarioA = salarioA;
    }
    @Override
     public double CalSalMen(){
         return salarioA/12;
    }

    @Override
    public String toString() {
        return super.toString()+" de tiempo coompleto percibe un " + "salario Anual de" + salarioA ;
    }
    
}
