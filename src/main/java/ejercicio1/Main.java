/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author cronida
 */
public class Main {
    public static void main(String[] args){
        
        final int FILA = 4, COLUMNA = 4;
        int i = 0, j = 100, cont;
        
        ArrayList<Integer> matriz = new ArrayList<>();
        
       for (i = 0; i < FILA; i++) {
            int max = j + COLUMNA;
            cont = 0;
            
            for (j = j; j < max; j++) {
                matriz.add(j);
                cont++;
            }
            j += 100 - cont;
            
        }
        
        String nomFichero = "matriz.txt";
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(nomFichero))){
            cont = 0;
            for(i = 0; i< FILA; i++){
                for(j = 0; j < COLUMNA; j++){
                    flujo.write("\t"+matriz.get(cont));
                    cont++;
                }
                flujo.newLine();
            }
            flujo.flush();
           

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } 

        
    }
}
