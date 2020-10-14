/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author cronida
 */
public class Main {
    public static void main(String[] args) {
        String idFichero = "matriz.txt";
        ArrayList<Integer> suma = new ArrayList<>();
        int num, resul=0;

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        System.out.println("Leyendo el fichero: " + idFichero);
        
        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new File(idFichero))){

            System.out.println("Separando cada elemento del fichero: ");

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split("\t");

                for (int i = 0; i < tokens.length; i++) {
                    if(!tokens[i].equals("")){
                        num = Integer.parseInt(tokens[i]);
                        suma.add(num);
                    }
                    
                }
                
                for(String i : tokens){
                    System.out.print(i+"\t");
                }

                for (Integer i : suma) {
                    resul += i;                   
                } 
                System.out.println("");
            }
            System.out.println("El resultado es: "+resul);
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
    }
}
