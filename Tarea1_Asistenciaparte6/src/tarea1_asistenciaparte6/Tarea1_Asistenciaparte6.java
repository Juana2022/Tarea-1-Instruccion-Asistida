/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1_asistenciaparte6;

import java.util.Random;
import java.util.Scanner;
enum Estado {SI, NO};
/**
 *
 * @author jalcivar4379@utm.edu.ec
 */
public class Tarea1_Asistenciaparte6 {

    Scanner entrada = new Scanner(System.in);

private int x = 6; 
private int y = 6; 
private Random Aleatorios = new Random();
private int numero1; 
private int numero2;
private int intentos = 0;
private int aciertos = 0;


public void menu(){           
    int i;  
    Estado continuar = Estado.SI;
    
    while (Estado.SI == continuar){       
        x = 6;
        y = 6;
        while( 5  < x || 1 > x ){
             System.out.print("\nDigite el numero de cifras 1 a 5 ");
             x = entrada.nextInt();
        }
        while( 5  < y || 1 > y ){
          System.out.print("\nPor favor introduce un numero (1 a 5) ");
           System.out.print(" para elegir la operacion: 1 suma, 2 resta, 3 multiplicacion");
           System.out.print(" 4 divisio y 5 una combinacion aleatoria de las anteriores.\n");
           y = entrada.nextInt();
        }
      
    }
    System.out.println("\nQuiere seguir jugando? (1. para Si, 2. para No)");
        i = entrada.nextInt();
        if ( 1 == i)
            continuar = Estado.SI;
        else
        continuar = Estado.NO; 
 }   
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
