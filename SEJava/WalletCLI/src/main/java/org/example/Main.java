package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    int[] ids = new int[100];
    String[] conceptos = new String[100];
    double[] montos = new double[100];
    int contador = 0;

    int opcion;

    do {
        System.out.println("\n--- MY WALLET CLI ---");
        System.out.println("1. Resgistrar Gasto");
        System.out.println("2. Ver todos los gastos");
        System.out.println("3. Calcular Total y Promedio");
        System.out.println("4. Buscar gasto por ID");
        System.out.println("5. Salir");
        System.out.println("Selecciona una opcion");
        opcion = leer.nextInt();
        leer.nextLine();
    switch (opcion) {
        case 1:
            System.out.println("Concepto: ");
            conceptos[contador] = leer.nextLine();
            System.out.println("Monto: ");
    }

    } while (opcion != 5);

    }
}