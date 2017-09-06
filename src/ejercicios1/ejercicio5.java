/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;

/**
 *
 * @author jehiel
 */
import java.util.Scanner;
import java.util.Random;

public class ejercicio5 {

Scanner leer = new Scanner(System.in);
Random r1 = new Random();

int numero = r1.nextInt(100)+1;
int adivina = leer.nextInt();
            
 while(numero!=adivina){
    if(adivina < numero){
        System.out.println("Ingresa un numero mayor");
    }else{
        System.out.println("Ingresa un numero menor");
    }
    adivina = leer.nextInt();    
    System.out.println("Adivinaste");
 }
}
