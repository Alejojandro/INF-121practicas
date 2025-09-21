package com.mycompany.aplicacion1;
import java.util.Scanner;
import java.util.Random;
public class JuegoAdivinaNumero extends Juego {
    private int numeroAadiv;

    public JuegoAdivinaNumero(int numeroDeVid) {
        super();
        this.numeroDeVid=numeroDeVid;
    }
    public void Juega(){
        reiniciarPartida();
        Random rand = new Random();
        numeroAadiv = rand.nextInt(11);
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numnero de 1-10:");
            int n=sc.nextInt();
            if(validNum(n)){
                if(n==numeroAadiv){
                System.out.println("Felicidades adivinaste");
                actualizarRecord();
                }else{
                    for(int i=0; i<=numeroDeVid;i++){
                        if(quitaVida()){
                            System.out.println("Ingrese un numero de nuevo");
                            int m=sc.nextInt();
                            if(m == numeroAadiv){
                                System.out.println("Felicidades adivinaste");
                                actualizarRecord();
                                break;
                            }else{
                                System.out.println("Fallaste pero si tienes vidas vuelve a intentarlo");
                            }
                        }else{
                            System.out.println("Fin del juego");
                        }   
                    }
                    System.out.println("Tu puntuacion es:"+record);
                }
            }else{
                System.out.println("El numero se encuentra fuera de rango");
            }
        }
    public boolean validNum(int n){
        return (n<=10 && n>0);
    }
}
