package com.mycompany.p2ejer1;
import java.util.Scanner;
public class P2Ejer1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese tamaño de los vectores:");
        int n=sc.nextInt();
        double[] a=new double[n];
        double[] b=new double[n];
        Vector(a,n);
        Vector(b,n);
        AlgebraVectorial com1=new AlgebraVectorial(a,b,n);
        /*double[]z=new double [n];
        z=com1.ProyeccionAB();*/
        System.out.println("a es ortogonal o perpendicular a b:"+com1.Perpendicular());
        System.out.println("a es mutuamente ortogonal a b:"+com1.Perpendicular(true));
        System.out.println("a es ortogonal a b:"+com1.Perpendicular(0));
        System.out.println("Tambien a es ortogonal a b:"+com1.Perpendicular(2.5));
        System.out.println("a es paralela a b:"+com1.Paralela(2));
        System.out.println("O a es paralela a b:"+com1.Paralela());
        System.out.println("La proyeccion de a en b es:"); AlgebraVectorial.mostrar(com1.ProyeccionAB());
        System.out.println("La componente de a en b es:"+com1.ComponenteAB());
    }

    private static void Vector(double[] x, int n) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Llene el vector");
        for (int i=0;i<n;i++){
            x[i]=sc.nextDouble();
        }
    }
}
