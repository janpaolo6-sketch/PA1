package org.example;

public class Actividad3PA {
    public static void main(String[] args) {
        // 1. Propuesta de matriz válida (4 filas x 5 columnas)
        // Filas: Aulas (0 a 3) | Columnas: Bloques Horarios (0 a 4)
        int[][] matriz = {
            { 20, 15,  0, 25, 10 }, // Aula 0
            { 12, 18, 30,  0, 15 }, // Aula 1
            {  0, 22, 25, 28,  0 }, // Aula 2
            { 15,  0, 20, 10, 35 }  // Aula 3
        };

        // 2. Calcular el total de estudiantes por aula (Recorrido por Filas)
        System.out.println("=== TOTAL DE ESTUDIANTES POR AULA ===");
        for (int f = 0; f < 4; f++) {
            int sumaAula = 0;
            for (int c = 0; c < 5; c++) {
                sumaAula += matriz[f][c];
            }
            System.out.println("Aula " + f + ": " + sumaAula + " estudiantes.");
        }

        // 3. Calcular el total de estudiantes por horario (Recorrido por Columnas)
        System.out.println("\n=== TOTAL DE ESTUDIANTES POR HORARIO ===");
        for (int c = 0; c < 5; c++) {
            int sumaHorario = 0;
            for (int f = 0; f < 4; f++) {
                sumaHorario += matriz[f][c];
            }
            System.out.println("Horario (Bloque " + c + "): " + sumaHorario + " estudiantes.");
        }

        // 4. Identificar la celda con mayor ocupación
        int maximo = -1;
        int aulaMax = 0;
        int horarioMax = 0;

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 5; c++) {
                if (matriz[f][c] > maximo) {
                    maximo = matriz[f][c];
                    aulaMax = f;
                    horarioMax = c;
                }
            }
        }
        System.out.println("\n=== CELDA CON MAYOR OCUPACIÓN ===");
        System.out.println("La mayor ocupacion es de " + maximo + " alumnos.");
        System.out.println("Ubicacion: Aula " + aulaMax + ", Bloque Horario " + horarioMax + ".");
    }
}
