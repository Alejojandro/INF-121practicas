package com.mycompany.aplicacion1;
public class Aplicacion1 {
    public static void main(String[] args) {
        JuegoAdivinaNumero jug1=new JuegoAdivinaNumero(3);
        System.out.println("----------Primer jug--------");
        jug1.Juega();
        JuegoAdivinaPar jug2=new JuegoAdivinaPar(3);
        JuegoAdvinaImpar jug3=new JuegoAdvinaImpar(3);
        System.out.println("Segundo jug");
        jug2.Juega();
        System.out.println("Tercer Jug");
        jug3.Juega();
    }
}
