/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SimulacionDAO {
    
    // Ruta relativa: se guardará directamente en la carpeta principal del proyecto
    private static final String RUTA_ARCHIVO = "partida_simulacion.txt";

    public void guardarEstado(List<String> datos) {
        // El 'false' indica que sobrescribe el archivo cada vez que guarda.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA_ARCHIVO, false))) {
            for (String linea : datos) {
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Partida guardada correctamente en " + RUTA_ARCHIVO);
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public List<String> cargarEstado() {
        List<String> datosLeidos = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                datosLeidos.add(linea);
            }
            System.out.println("Partida cargada correctamente.");
        } catch (IOException e) {
            System.err.println("No se pudo cargar el archivo (quizás no existe aún): " + e.getMessage());
        }
        
        return datosLeidos;
    }
}