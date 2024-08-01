/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package condicionales;

import java.util.Scanner;

/**
 * Una Pequeá Dispensa Desea Cobrar El Sueldo De Los Empleados
 *
 * @author DREP
 */
public class EjerciciosCondicionales {

    public static void main(String[] args) {
        //Declaracion de Variables
        Scanner sc = new Scanner(System.in);
        int fila, asiento;
        String respuesta;
        char asientos[][] = new char[10][10];
        boolean bandera = false;
        
        //Cargamos Matriz de Datos
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                asientos[f][c] = 'L';
            }
        }
        
        //Bienvenido al Sistema
        System.out.println("******BIENVENIDO AL SISTEMA DE RESERVAS*********");
        
        
        //Reserva de Asientos
        while (bandera != true) {
                //Visualizacion de Mapa
                System.out.println("¿Desea Ver Los Asientos Disponible? S:Si Cualquier Otra Letra: No");
                String verAsientos = sc.next();
                if(verAsientos.equalsIgnoreCase(verAsientos)){
                pintarMapa(asientos);
                }
                
                //Reserva
                System.out.println("");
                System.out.println("Ingrese Filas y Asientos a Reservar");
                System.out.print("Fila entre 0 y 9: ");
                fila = sc.nextInt();
                System.out.print("Asiento entre 0 y 9: ");
                asiento = sc.nextInt();
                System.out.println("No Se Permite Sobre Venta");

            if (asientos[fila][asiento] == 'L') {
                asientos[fila][asiento] = 'X';
                System.out.println("Asiento Reservado con Exito");
            } else {
                System.out.println("El Asiento Esta Ocupado. Por Favor Eliga Otro");
            }
            System.out.println("Desea Finalizar La Reserva? S:Si , cualquier otra letra: No");
            respuesta = sc.next();//GUARDAR TEXTO
            if (respuesta.equalsIgnoreCase("S")) {
                bandera = true;
            }

        }

    }

    static void pintarMapa(char asientos[][]) {
        for (int f = 0; f < 10; f++) {
            System.out.print(f + " ");
            for (int c = 0; c < 10; c++) {

                System.out.print("[ " + asientos[f][c] + "] ");
            }
            System.out.println("");
        }
    }

}
