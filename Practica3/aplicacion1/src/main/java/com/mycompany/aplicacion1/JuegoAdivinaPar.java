package com.mycompany.aplicacion1;
public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    
    public JuegoAdivinaPar(int numeroDeVid) {
        super(numeroDeVid);
    }
    @Override
    public boolean validNum(int n){
        if(n<=10 && n>0 && n%2==0){
            return true;
        }else{
            System.out.println("El numero debe ser par y cumplir el rango de 1-10");
            return false;
        }
    }
}
