package com.mycompany.aplicacion1;
public class Juego {
    public int numeroDeVid;
    public int record;
    
    public Juego() {
        this.record = 0;
    }
    
    public void reiniciarPartida(){
        numeroDeVid = 3;
    }
    public void actualizarRecord(){
        record = record+100;
    }
    public boolean quitaVida(){
        if(numeroDeVid >= 0){
            numeroDeVid--;
            return true;
        }else{
            return false;
        }
    }
}
