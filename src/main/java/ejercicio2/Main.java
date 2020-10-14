/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author cronida
 */
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        String nomFichero = "teclado.txt";
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(nomFichero))){
            String linea = "";
            
            while(!linea.equals("EOF")){
                System.out.println("Dime la linea a escribir");
                linea = scn.nextLine();
                
                if(!linea.equals("EOF")){
                    flujo.write(linea);
                }
                
                flujo.newLine();
            }                                                                                               
            flujo.flush();           
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } 
        
    }
}
