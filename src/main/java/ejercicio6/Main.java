/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cronida
 */
public class Main {
    public static void main(String[] args) {
        String idFichero = "ejercicio3.txt";
        String[] tokens, ocurrencia;
        String linea;
        int cont = 0, posJ, posV;
        ArrayList<String> encontrado = new ArrayList<>();

        System.out.println("Leyendo el fichero: " + idFichero);
        
        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new File(idFichero))){

            System.out.println("Separando cada elemento del fichero: ");
            System.out.println("");

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split(",");
                ocurrencia = linea.split("j,v");
                
                
                System.out.println(linea);
                
                /*for(String i : tokens){
                    System.out.print(i+",");
                }
                System.out.println("");*/
                if(ocurrencia.length > 1){
                    for(int i = 0; i < tokens.length; i++){                       
                        if(i < (tokens.length-1) && tokens[i].equals("j")){
                            if(tokens[i+1].equals("v")){
                               posJ = i;
                               posV = i+1;
                               encontrado.add("En la linea "+cont+" se ha encontrado una ocurrencia y ocupan la posicion "+posJ+" y "+posV);
                            }
                            
                        }
                    }                       
                }
                cont++;
            }
            System.out.println("");
            
            for(String i : encontrado){
                System.out.println(i);
            }
           
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
    }
}
