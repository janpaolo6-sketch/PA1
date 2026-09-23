package org.example;

import java.util.Arrays;

public class Actividad2PA {

    public static void main(String[] args) {
        System.out.println("=== ACTIVIDAD 2: VECTORES ===");

        Punto1Representar();
        Punto2EncontrarMayorMenor();
        Punto3InsertarValor();
        Punto4OrdenarVector();
        Punto5ExplicarCosto();

        // 1. Representación gráfica
        // 2. Mayor y menor
        // 3. Insertar valor
        // 4. Ordenamiento
        // 5. Explicación del costo

    }

    // 1. Representar el vector indicando índices y valores
    public static void Punto1Representar() {
        System.out.println("\n-- PUNTO 1: REPRESENTACIÓN GRÁFICA --");

        int[] inscritos = {28, 15, 34, 21, 19, 40, 12, 26};

        System.out.println("Vector completo: " + Arrays.toString(inscritos));
        System.out.println("Tamaño del vector: " + inscritos.length);

        for (int i = 0; i < inscritos.length; i++) {
            System.out.println("Índice " + i + " -> " + inscritos[i]);
        }
    }

    // 2. Encontrar el valor mayor y el valor menor
    public static void Punto2EncontrarMayorMenor() {
        System.out.println("\n-- PUNTO 2: VALOR MAYOR Y MENOR --");

        int[] inscritos = {28, 15, 34, 21, 19, 40, 12, 26};

        int mayor = inscritos[0];
        int menor = inscritos[0];

        for (int i = 0; i < inscritos.length; i++) {
            if (inscritos[i] > mayor) {
                mayor = inscritos[i];
            }
            if (inscritos[i] < menor) {
                menor = inscritos[i];
            }
        }

        System.out.println("El valor mayor es: " + mayor);
        System.out.println("El valor menor es: " + menor);
    }

    // 3. Insertar un nuevo valor
    public static void Punto3InsertarValor() {
        System.out.println("\n- PUNTO 3: INSERTAR UN NUEVO VALOR -");

        // Usamos un arreglo con espacio mayor al de la lista que ya tenía
        int[] inscritos = new int[10];

        // Llenamos los primeros 8 valores
        inscritos[0] = 28;
        inscritos[1] = 15;
        inscritos[2] = 34;
        inscritos[3] = 21;
        inscritos[4] = 19;
        inscritos[5] = 40;
        inscritos[6] = 12;
        inscritos[7] = 26;

        int usados = 8; // Elementos lógicamente usados

        System.out.print("Vector inicial: ");
        mostrarSoloUsados(inscritos, usados);

        int nuevoValor = 30; // Valor a insertar
        int posicion = 3;    // Posición indicada

        // Desplazamos hacia la derecha para abrir espacio
        for (int i = usados; i > posicion; i--) {
            inscritos[i] = inscritos[i - 1];
        }

        // Insertamos el nuevo valor en la posición
        inscritos[posicion] = nuevoValor;
        usados++;

        System.out.print("Después de insertar " + nuevoValor + " en posición " + posicion + ": ");
        mostrarSoloUsados(inscritos, usados);
    }

    // 4. Algoritmo de ordenamiento para organizar de menor a mayor, Bubblesort, lo vimos en la última clase.
    public static void Punto4OrdenarVector() {
        System.out.println("\n-- PUNTO 4: ORDENAR DE MENOR A MAYOR --");

        int[] inscritos = {28, 15, 34, 21, 19, 40, 12, 26};

        System.out.println("Antes: " + Arrays.toString(inscritos));

        for (int i = 0; i < inscritos.length - 1; i++) {
            for (int j = 0; j < inscritos.length - 1 - i; j++) {
                if (inscritos[j] > inscritos[j + 1]) {
                    int temporal = inscritos[j];
                    inscritos[j] = inscritos[j + 1];
                    inscritos[j + 1] = temporal;
                }
            }
        }

        System.out.println("Después: " + Arrays.toString(inscritos));
    }

    // 5. Explicar el costo del ordenamiento en el mejor y peor caso
    public static void Punto5ExplicarCosto() {
        System.out.println("\n- PUNTO 5: COSTO APROXIMADO DEL ORDENAMIENTO -");
        System.out.println("El algoritmo de ordenamiento utilizado es Ordenamiento por Burbuja (Bubble Sort).");
        System.out.println("- Peor Caso: O(n^2). Ocurre si el vector está ordenado al revés.");
        System.out.println("  Se requieren realizar casi (n * n) / 2 comparaciones e intercambios.");
        System.out.println("- Mejor Caso: O(n^2). Como se implementó con dos bucles 'for' fijos,");
        System.out.println("  el programa realiza exactamente las mismas comparaciones aunque el vector ya estuviera ordenado.");
    }

    public static void mostrarSoloUsados(int[] datos, int usados) {
        System.out.print("[");
        for (int i = 0; i < usados; i++) {
            System.out.print(datos[i]);
            if (i < usados - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}