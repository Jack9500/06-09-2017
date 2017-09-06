/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;

import java.util.Scanner;

/**
 *
 * @author jehiel
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num = 0, x =0;
        int num1 = 0;
        int par = 2;
        int suma = 0;
         
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Se muestra la suma solo de numeros mayores que 20");
        System.out.println("El proceso termina cuando haya 5 numeros pares");
        //Inicia Captura--------
        //for(int a = 0; a >=num1; a++){
        System.out.println("Ingrese numero");
        num1 = leer.nextInt();
        for(int a=0; a<=num1; a++){
        if(num1%2==0){   
            while(par <=5){
                System.out.println("Ingrese numero");
                num1 = leer.nextInt();
                if (num1 >=20){
                  for(int i=20; i==num1; i++){
                    suma = num1 + num1 + i;
                    System.out.println("La suma es: "+suma+i);
                  }
                } 
                par++;
            }
            
        }  
         else{
            System.out.println("Ingrese numero");
            num1 = leer.nextInt();
        }
        }
       
    }

}
//}
      
        //if(numero <= 20){
                //System.out.println("Ingrese numero");
                //int resul = leer.nextInt();
          //      if (numero%2==0){
              //      System.out.println("Fin de captura");
            //        break;
                //}
                //else{
                  //  System.out.println("Ingrese numero");
                    //int resultado = leer.nextInt();
                //}
            //}
            //else{
              //  suma = numero;
              //  System.out.println("La suma es: "+suma);
           // }
           
        
        //for (int i = 1; i==numero; i++){
            //System.out.print(i);
            
            
        //}
        