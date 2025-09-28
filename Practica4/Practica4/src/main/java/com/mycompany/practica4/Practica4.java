package com.mycompany.practica4;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Practica4 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner sc=new Scanner(System.in);
        Empleado[] empleados = new Empleado[5];

        System.out.println("Ingrese datos de 3 empleados a tiempo completo:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Salario anual: ");
            double salario = Double.parseDouble(sc.nextLine());
            empleados[i] = new EmpleadoTiempoComp(salario,nombre);
        }
        System.out.println("Ingrese datos de 2 empleados a tiempo horario:");
        for (int i = 3; i < 5; i++) {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Horas trabajadas: ");
            double horas = Double.parseDouble(sc.nextLine());
            System.out.print("Tarifa por hora: ");
            double tarifa = Double.parseDouble(sc.nextLine());
            empleados[i] = new EmpleadoTiempoHorario(horas, tarifa, nombre);
        }

        System.out.println("\nInformación de empleados:");
        for (Empleado emp : empleados) {
            System.out.println(emp.toString());
            System.out.println("Salario mensual: " + df.format(emp.CalSalMen()));
            System.out.println("-----------------------------");
        }
    }
}
