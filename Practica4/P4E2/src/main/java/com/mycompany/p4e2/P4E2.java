package com.mycompany.p4e2;
import java.util.Random;
public class P4E2 {

    public static void main(String[] args) {
        Figura[] figuras=new Figura[5];
        Random r=new Random();
        String[] colores={"Rojo","Morado","Verde","Turquesa"};
        for(int i=0;i<5;i++){
            int tipo=r.nextInt(2)+1;
            String color=colores[r.nextInt(colores.length)];
            if(tipo==1){
                int lado=r.nextInt(10)+1;
                figuras[i]=new Cuadrado(lado,color);
            }else{
                double radio=1+r.nextInt()*9;
                figuras[i]=new Circulo(radio,color);
            }
        }
        for(Figura f: figuras){
            System.out.println(f.toString());
            System.out.println("El Area es:"+f.Area());
            System.out.println("El Perimetro es:"+f.Perimetro());
            if(f instanceof Coloreado){
                System.out.println("Coloreado:"+((Coloreado) f).comoColorear());
            }
            System.out.println("-----------------------------------------------");
        }
    }
}
