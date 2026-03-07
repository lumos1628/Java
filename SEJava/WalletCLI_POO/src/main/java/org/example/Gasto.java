package org.example;

public class Gasto {
    public int id;
    public String concepto;
    public double monto;

    public Gasto(int id, String concepto, double monto){
        this.id = id;
        this.concepto = concepto;
        this.monto = monto;
    }
    public void mostrarInfo(){
        System.out.println("ID: " + id + " | " + concepto + " | $" + monto);
    }
}
