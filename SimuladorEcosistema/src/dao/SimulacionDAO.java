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

    private static final String RUTA_ARCHIVO = "partida_simulacion.txt";

    public boolean guardarEstado(List<String> datos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA_ARCHIVO, false))) {
            for (String linea : datos) {
                bw.write(linea);
                bw.newLine();
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public List<String> cargarEstado() {
        List<String> datosLeidos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                datosLeidos.add(linea);
            }
        } catch (IOException e) {
            return null;
        }
        return datosLeidos;
    }
}