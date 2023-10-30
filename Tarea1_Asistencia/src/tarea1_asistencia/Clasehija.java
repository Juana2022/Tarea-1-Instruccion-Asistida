/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1_asistencia;

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

enum Estado {SI, NO};


public class Clasehija {
    
    Scanner entrada = new Scanner(System.in);

private int x = 6; 
private int y = 6; 
private Random Aleatorios = new Random();
private int numero1; 
private int numero2;
private int intentos = 0;
private int aciertos = 0;
    
 
public void Especificar(){           
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
        Generar_Ejercicios();
        System.out.println("\nQuiere seguir jugando? (1. para Si, 2. para No)");
        i = entrada.nextInt();
        if ( 1 == i)
            continuar = Estado.SI;
        else
        continuar = Estado.NO; 
   
      }         

System.out.printf("\nEn esta sesión hizo %d intentos,", intentos);
System.out.printf(" de los cuales %d fueron correctos\n", aciertos); 
System.out.printf("\nSu porcentaje de efectividad es: %f\n", (double) aciertos/intentos);
System.out.printf("\nRegrese pronto!\n");
}            


public void Generar_Ejercicios(){           
    int dado;

switch (y){
case 1: 
Suma();
break;
case 2: 
Resta();
break;
case 3:
Multiplicacion();
break;
case 4:
Division();
break;
case 5:
dado = 1 +  Aleatorios.nextInt(4);
switch (dado)
{  // Abre switch añidado
case 1:
Suma();
break;
case 2:
Resta();
break;
case 3:
Multiplicacion();
break;
case 4:
Division();
break;
default:
System.out.println("\nRevise este metodo!");
break;
} 

break; 
default: 
System.out.println("\nRevise este metodo!");
break;
   
}  
}         


public void Suma(){
    int auxiliars = 0;
    int suma = -1;
    numero1 = (int)Math.pow(10,x - 1) + Aleatorios.nextInt((int)Math.pow(10, x) - (int)Math.pow(10, x -1));  
    numero2 = (int)Math.pow(10,x - 1) + Aleatorios.nextInt((int)Math.pow(10, x) - (int)Math.pow(10, x -1));  
    do{
        if (0 != auxiliars)
        Anima();
        intentos++;
        System.out.printf("\nCuanto es %d + %d?\n", numero1, numero2);
        suma = entrada.nextInt();
        auxiliars++;
    }while (( numero1 + numero2 != suma ) && (10 > auxiliars));
    if ( numero1 + numero2 == suma){
        Felicita();
        aciertos++;
    }else
        System.out.println("\nDeberias pedir ayuda a tu profesor con este tipo de problemas.");
    }



public void Resta(){
    int auxiliarr = 0;
    int resta;
    numero1 = (int)Math.pow(10,x - 1) + Aleatorios.nextInt((int)Math.pow(10, x) - (int)Math.pow(10, x -1));  
    numero2 = (int)Math.pow(10,x - 1) + Aleatorios.nextInt((int)Math.pow(10, x) - (int)Math.pow(10, x -1));  
    do{
        if (0 != auxiliarr)
            Anima();
            intentos++;
            System.out.printf("\nCuanto es %d - %d?\n", numero1, numero2);
            resta = entrada.nextInt();
            auxiliarr++;
    }while (( numero1 - numero2 != resta) && (10 > auxiliarr));
    if ( numero1 - numero2 == resta){ 
        Felicita();
        aciertos++;
    }else
        System.out.println("\nDeberias pedir ayuda a tu profesor con este tipo de problemas.");

}   



public void Multiplicacion(){
    int auxiliarm = 0;
    int multiplicacion;
    numero1 = (int)Math.pow(10,x - 1) + Aleatorios.nextInt((int)Math.pow(10, x) - (int)Math.pow(10, x -1));  
    numero2 = (int)Math.pow(10,x - 1) + Aleatorios.nextInt((int)Math.pow(10, x) - (int)Math.pow(10, x -1));  
    do{ 
        if ( 0 != auxiliarm)
            Anima();
            intentos++;
            System.out.printf("\nCuanto es %d * %d?\n", numero1, numero2);
            multiplicacion = entrada.nextInt();
            auxiliarm++;
  
    }while( ( numero1 * numero2 != multiplicacion) && (10 > auxiliarm) );
    if (numero1 * numero2 == multiplicacion){
        Felicita();
        aciertos++;
    }else
        System.out.println("\nDeberias pedir ayuda a tu profesor con este tipo de problemas.");
}



public void Division(){
    int division;
    int auxiliard = 0;
    numero1 = (int)Math.pow(10,x - 1) + Aleatorios.nextInt((int)Math.pow(10, x) - (int)Math.pow(10, x -1));  
    numero2 = (int)Math.pow(10,x - 1) + Aleatorios.nextInt((int)Math.pow(10, x) - (int)Math.pow(10, x -1));  
    do{
        if ( 0 != auxiliard)
            Anima();
            intentos++;
            System.out.printf("\nCuanto es %d / %d? (introduzca solo la parte entera) \n", numero1, numero2);
            division = entrada.nextInt();
            auxiliard++;
    }while (( numero1 / numero2 != division) && (10 > auxiliard));
    if (numero1/numero2 == division){
        Felicita();
        aciertos++;
    }else
        System.out.println("\nDeberias pedir ayuda a tu profesor con este tipo de problemas.");
}       




void Felicita()
{        // Abre metodo Felicita
int auxiliar; 
auxiliar = 1 + Aleatorios.nextInt(4);
switch (auxiliar) 
{     // Abre switch
case 1:
System.out.println("\n¡Muy bien!");
break;
case 2:
System.out.println("\n¡Excelente!");
break;
case 3:
System.out.println("\n¡Buen trabajo!");
break;
case 4:
System.out.println("\nSigue asi!");
break;
default:
System.out.println("\nRevise");
break;
} 
}          


public void Anima(){      
    int auxiliar;
    auxiliar = 1 + Aleatorios.nextInt(4);
    switch (auxiliar) {
        case 1:
            System.out.println("\nNo. Por favor intentar de nuevo!");
            break;
        case 2:
            System.out.println("\nIncorrecto.Intenta una vez mas!");
            break;
        case 3:
            System.out.println("\n¡No te rindas!");
            break;
        case 4:
            System.out.println("\n¡No.Sigue intentando!");
            break;
        default:
            System.out.println("\nRevise");
            break;
    }
} 
}
