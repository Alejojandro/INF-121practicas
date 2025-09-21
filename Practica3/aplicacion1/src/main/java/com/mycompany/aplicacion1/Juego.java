package com.mycompany.aplicacion1;
public class Juego {
    public int numeroDeVid;
    public int record;
    
    public Juego(int numeroDeVid, int record) {
        this.numeroDeVid = numeroDeVid;
        this.record = record;
    }
    
    public void reiniciarPartida(){
        numeroDeVid = 3;
    }
    public void actualizarRecord(){
        record = record+100;
    }
    public boolean quitaVida(){
        if(numeroDeVid >= 0){
            return true;
        }else{
            return false;
        }
    }
}
