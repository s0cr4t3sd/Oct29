/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author cronida
 */
public class Main {
    public static void main(String[] args) {
        Random rdn = new Random();
      
        
        String nomFichero = "ejercicio3.txt";
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(nomFichero))){            
            String letra;

            for(int i = 0; i < 50; i++){               
                flujo.write(("Linea "+(i+1)+" :"));
                do{
                   int aleatorio = rdn.nextInt(26)+65;
                   char caracter = ((char) aleatorio);
                   letra = String.valueOf(caracter); 
                   
                   switch(rdn.nextInt(2)){
                        case 0:
                            letra = letra.toLowerCase();
                            break;

                        case 1:
                            letra = letra.toUpperCase();
                            break;
                    }
                    
                    if(letra.equalsIgnoreCase("x")){
                        flujo.write(letra);
                    }else{                           
                        flujo.write(letra+", ");
                    }
                   
                }while(!letra.equalsIgnoreCase("x"));
                flujo.newLine();
                flujo.flush(); 
            }                                                                                                           
                      
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } 
        
    }
}
