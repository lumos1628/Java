package org.example;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    ArrayList<Gasto> listaGastos = new ArrayList<>();
    int opcion;

    do {
        System.out.println("\n--- MY WALLET V2 (POO) ---");
        System.out.println("1. Registrar Gasto");
        System.out.println("2. Ver todos los gastos");
        System.out.println("3. Total y Promedio");
        System.out.println("4. Salier");
        opcion = leer.nextInt();
        leer.nextLine();
        switch (opcion){
            case 1:
                System.out.println("Registrando Dato");
                System.out.println("Concepto: ");
                String concepto = leer.nextLine();
                System.out.println(("Monto: "));
                double monto = leer.nextDouble();

                int nuevoId = listaGastos.size() + 1;
                Gasto nuevoGasto = new Gasto(nuevoId, concepto, monto);
                listaGastos.add(nuevoGasto);

                System.out.println("\n--- GASTO REGISTRADO ---");
                break;

            case 2:
                System.out.println("\n--- LISTA DE GASTOS ---");
                for (Gasto g : listaGastos){
                    g.mostrarInfo();
                }
                break;

            case 3:
                System.out.println("\n---  TOTAL PROMEDIO ---");
                double total = 0;
                for (Gasto g : listaGastos){
                    total = g.monto + total;
                }
                System.out.println("El total es: " + total + " y el promedio es; " + total / listaGastos.size());
                break;
        }
    } while (opcion != 4);
    
    }
}