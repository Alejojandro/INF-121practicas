package com.mycompany.aplicacion1;
public class JuegoAdvinaImpar extends JuegoAdivinaNumero {
    
    public JuegoAdvinaImpar(int numeroDeVid) {
        super(numeroDeVid);
    }
    @Override
    public boolean validNum(int n){
        if(n<=10 && n>0 && n%2!=0){
            return true;
        }else{
            System.out.println("El numero debe ser impar y cumplir con el rango de 1-10");
            return false;
        }
    }
}
