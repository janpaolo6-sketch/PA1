package org.example;

public class Actividad4PA1 {

    public static void main(String[] args) {

        System.out.println("=== ACTIVIDAD 4: MATRICES ESPECIALES ===");

        Punto1MatrizCuadrada();

        Punto2MatrizPocoDensa();

        Punto3EjemploAcademico();

    }

    // PUNTO 1: MATRIZ CUADRADA
    public static void Punto1MatrizCuadrada() {

        System.out.println("\n--- PUNTO 1: MATRIZ CUADRADA ---");

        // Creamos una matriz cuadrada de 3 filas y 3 columnas
        int[][] matriz = {
                {10, 15, 20},
                {12, 18, 25},
                {14, 16, 22}
        };

        System.out.println("Una matriz cuadrada tiene el mismo numero de filas y columnas.");

        System.out.println("\nRepresentacion de una matriz de 3x3:");

        // Recorremos las filas
        for (int i = 0; i < matriz.length; i++) {

            // Recorremos las columnas
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + "\t");

            }

            System.out.println();

        }

    }

    // PUNTO 2: MATRIZ POCO DENSA
    public static void Punto2MatrizPocoDensa() {

        System.out.println("\n--- PUNTO 2: MATRIZ POCO DENSA ---");

        // Matriz de 4 aulas y 5 horarios
        // El valor 0 indica que no hay estudiantes registradosr

        int[][] ocupacion = {
                {0, 0, 15, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 20, 0, 0, 0},
                {0, 0, 0, 12, 0}
        };

        System.out.println("Una matriz poco densa contiene una gran cantidad de elementos iguales a cero.");

        System.out.println("\nRepresentacion de la ocupacion de aulas y horarios:");

        // Recorremos las filas y columnas
        for (int i = 0; i < ocupacion.length; i++) {

            for (int j = 0; j < ocupacion[i].length; j++) {

                System.out.print(ocupacion[i][j] + "\t");

            }

            System.out.println();

        }

    }
    // PUNTO 3: REPRESENTACION DISPERSA DE LA MATRIZ
    public static void Punto3EjemploAcademico() {

        System.out.println("\n--- PUNTO 3: REPRESENTACION DISPERSA ---");

        // Cada fila almacena: aula, horario y cantidad de estudiantes.
        // Solo registramos las posiciones con valores diferentes de cero.

        int[][] datos = {
                {0, 2, 15},
                {2, 1, 20},
                {3, 3, 12}
        };

        System.out.println("Registro de ocupacion de aulas y horarios:");

        System.out.println("Aula\tHorario\tEstudiantes");

        // Recorremos los registros almacenados
        for (int i = 0; i < datos.length; i++) {

            System.out.println(
                    (datos[i][0] + 1) + "\t" +
                            (datos[i][1] + 1) + "\t" +
                            datos[i][2]
            );

        }

    }

}