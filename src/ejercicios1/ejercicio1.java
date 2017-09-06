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

import java.util.Random;
public class ejercicio1 {
    //1
        //Evaluar el resultado del lanzamiento de 3 dados.
        //6 en los 3 dados = excelente
        //6 en 2 dados = Muy bien
        //6 en 1 dado = regular
        //Ningun 6 = pesimo
    
    public static void main(String[] args){
        
        int n = 6*3;
        int a = 6*2;
        int b = 6*1;
        int c = 5;
        
        int result;
        
        
        Random aletorio = new Random();
        
        for(int i=1; i>=16; i++){
               result = aletorio.nextInt(n);
               result = aletorio.nextInt(a);
               result = aletorio.nextInt(b);
               result = aletorio.nextInt(c);
              int ale = aletorio.nextInt(result);
              System.out.println("El numero es: " +result);
      
//            if(ale == n){
//            System.out.println("Excelente");  
//            }
//            if(ale == a){
//            System.out.println("Muy bien");  
//            }
//            if(ale == b){
//            System.out.println("Regular");  
//            }
//            if(ale == c){
//            System.out.println("Pesimo");  
//            }
//            else{
//                System.out.println("El numero es: " +ale);
//            }
            
        }
            }
        
        
        
        
        
//        int n = aletorio.nextInt(6*3);
//        int a = aletorio.nextInt(6)*2;
//        int b = aletorio.nextInt(6)*1;
//        int c = aletorio.nextInt(5);
        
    
}
