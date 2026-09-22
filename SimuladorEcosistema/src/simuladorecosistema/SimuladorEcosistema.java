/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuladorecosistema;
import java.util.Scanner;
/**
 *
 * @author Educacion
 */
public class SimuladorEcosistema {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("       SIMULADOR DE ECOSISTEMA       ");
        System.out.println("=====================================");

        boolean configuracionAceptada = false;
        Ecosistema eco = null;
        int maxTurnos = 0;

        //Configuración Inicial Validada
        while (!configuracionAceptada) {
            int numPlantas = pedirEnteroEnRango("Porfavor ingresá la cantidad inicial de Plantas (5 - 30): ", 5, 30);
            int numConejos = pedirEnteroEnRango("Porfavor ingresá la cantidad inicial de Conejos (2 - 15): ", 2, 15);
            int numLobos = pedirEnteroEnRango("Porfavor ingresá la cantidad inicial de Lobos (1 - 5): ", 1, 5);
            maxTurnos = pedirEnteroEnRango("Porfavor ingresá la cantidad total de Turnos (10 - 50): ", 10, 50);
            Clima climaInicial = seleccionarClima();

            System.out.println("\n--- Resumen de Configuracion ---");
            System.out.println("Plantas: " + numPlantas);
            System.out.println("Conejos: " + numConejos);
            System.out.println("Lobos: " + numLobos);
            System.out.println("Turnos: " + maxTurnos);
            System.out.println("Clima Inicial: " + climaInicial);
            System.out.print("Deseas iniciar con estos valores? (s/n): ");
            String confirmacion = sc.nextLine().trim().toLowerCase();

            if (confirmacion.equals("s") || confirmacion.equals("si")) {
                configuracionAceptada = true;
                eco = new Ecosistema(climaInicial);

                for (int i = 0; i < numPlantas; i++) eco.agregarEntidad("planta", 40.0);
                for (int i = 0; i < numConejos; i++) eco.agregarEntidad("conejo", 50.0);
                for (int i = 0; i < numLobos; i++) eco.agregarEntidad("lobo", 60.0);
            } else {
                System.out.println("Reiniciando configuracion...\n");
            }
        }

        System.out.println("\nPresiona ENTER para comenzar el primer turno...");
        sc.nextLine();

        int turnoContador = 1;
        while (turnoContador <= maxTurnos && !eco.ecosistemaColapsado()) {
            eco.procesarTurno();

            if (eco.ecosistemaColapsado()) {
                System.out.println("\n[ALERTA] El ecosistema ha colapsado!");
                break;
            }

            if (turnoContador % 3 == 0 && turnoContador < maxTurnos) {
                gestionarIntervencion(eco);
            }

            if (turnoContador < maxTurnos) {
                System.out.print(">>> Presiona ENTER para continuar al siguiente turno...");
                sc.nextLine();
            }
            turnoContador++;
        }

        eco.generarReporteFinal();
    }

    private static int pedirEnteroEnRango(String mensaje, int min, int max) {
        int valor;
        while (true) {
            System.out.print(mensaje);
            String input = sc.nextLine().trim();
            try {
                valor = Integer.parseInt(input);
                if (valor >= min && valor <= max) {
                    return valor;
                }
                System.out.println("Error: el numero debe estar entre " + min + " y " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un numero entero valido.");
            }
        }
    }

    private static Clima seleccionarClima() {
        System.out.println("\nSelecciona el Clima:");
        System.out.println("1. Soleado");
        System.out.println("2. Lluvioso");
        System.out.println("3. Sequia");
        System.out.println("4. Invierno");
        int opc = pedirEnteroEnRango("Opcion (1-4): ", 1, 4);
        switch (opc) {
            case 1: return Clima.SOLEADO;
            case 2: return Clima.LLUVIOSO;
            case 3: return Clima.SEQUIA;
            default: return Clima.INVIERNO;
        }
    }

    private static void gestionarIntervencion(Ecosistema eco) {
        System.out.println("\n=========================");
        System.out.println("   MENU DE INTERVENCION    ");
        System.out.println("===========================");
        System.out.println("1. Cambiar clima (Actual: " + eco.getClimaActual() + ")");
        System.out.println("2. Agregar entidad");
        System.out.println("3. Solo avanzar sin intervenir");

        int opcion = pedirEnteroEnRango("Elige una opcion (1-3): ", 1, 3);

        if (opcion == 1) {
            Clima nuevoClima = seleccionarClima();
            System.out.print("Confirmas cambiar el clima a " + nuevoClima + "? (si/no): ");
            if (sc.nextLine().trim().equalsIgnoreCase("si")) {
                eco.cambiarClima(nuevoClima);
            }
        } else if (opcion == 2) {
            System.out.print("Que entidad deseas agregar? (planta / conejo / lobo): ");
            String tipo = sc.nextLine().trim().toLowerCase();
            if (tipo.equals("planta") || tipo.equals("conejo") || tipo.equals("lobo")) {
                System.out.print("Confirmas agregar un(a) " + tipo + "? (si/no): ");
                if (sc.nextLine().trim().equalsIgnoreCase("si")) {
                    eco.agregarEntidad(tipo);
                    System.out.println("Se agrego un(a) " + tipo + " al ecosistema.");
                }
            } else {
                System.out.println("Tipo no reconocido. No se realizo ninguna intervencion.");
            }
        } else {
            System.out.println("Avanzando sin aplicar cambios.");
        }
    }
}
