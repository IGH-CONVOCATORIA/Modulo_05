package com.convocatoria.mod05.problema02;

import java.util.Scanner;

public class Problema02 {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int mes;
    double ventas;
    double comision, bono, pagoTotal;
    Servicios servicios;

    System.out.print("Ingrese el mes: ");
    mes = reader.nextInt();
    System.out.print("Ingrese ventas del mes: ");
    ventas = reader.nextDouble();
    String[] meses = {
      "",
      "Enero",
      "Febrero",
      "Marzo",
      "Abril",
      "Mayo",
      "Junio",
      "Julio",
      "Agosto",
      "Septiembre",
      "Octubre",
      "Noviembre",
      "Diciembre",
    };

    servicios = new Servicios();
    comision = servicios.calcComision(mes, ventas);
    bono = servicios.calcBono(mes, ventas);
    pagoTotal = servicios.calcPagoTotal(comision, bono);

    System.out.println("Mes:" + meses[mes]);
    System.out.println("Ventas: " + ventas);
    System.out.println("Comision: " + comision);
    System.out.println("Bono: " + bono);
    System.out.println("Pago Total: " + pagoTotal);
  }
}
