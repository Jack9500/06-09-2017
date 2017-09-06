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
public class ejercicio3 {
    public static void main(String[] args) {
     
        int num, x = 0;
        Scanner multi = new Scanner(System.in);
        Random aletorio = new Random();
        int n = 1 + aletorio.nextInt(100);
        int a = 1 + aletorio.nextInt(100);
        System.out.println("Teclea el resultado de la multiplicacion de: " + n +"*"+a);
        int resultado = multi.nextInt();
        num = resultado;
        if(resultado == n*a){
            System.out.println("Excelente, Respuesta correcta");
        }
        else{
            System.out.println("Error, Respuesta incorrecta");
            while(x<5){
                System.out.println("Teclea el resultado de la multiplicacion");
                resultado = multi.nextInt();
                if(resultado == n*a){
                System.out.println("Excelente, Respuesta correcta");
                //x++;
                }
                x++;
                
            }System.out.println("La respuesta correcta es: "+ n*a);
        }
    }      
}
