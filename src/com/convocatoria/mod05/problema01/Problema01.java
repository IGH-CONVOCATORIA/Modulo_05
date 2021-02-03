package com.convocatoria.mod05.problema01;

import java.util.Scanner;

public class Problema01 {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int cantidadCajas;
    double precioCaja, porcentajeGanancia;
    double gastosTotales, ingresosTotales, ganancia, precioVenta;
    Servicios servicios;

    System.out.print("Ingrese Cantidad de cajas de fresa: ");
    cantidadCajas = reader.nextInt();
    System.out.print("Ingrese Precio de compra de la caja: ");
    precioCaja = reader.nextDouble();
    System.out.print("Ingrese Porcentaje de ganancia deseado: ");
    porcentajeGanancia = reader.nextDouble();

    servicios = new Servicios();
    gastosTotales = servicios.calcGastosTotales(cantidadCajas, precioCaja);
    ingresosTotales =
      servicios.calcIngresosTotales(gastosTotales, porcentajeGanancia);
    ganancia = servicios.calcGanancia(gastosTotales, ingresosTotales);
    precioVenta = servicios.calcPrecioVenta(ingresosTotales, cantidadCajas);

    System.out.println("Gastos totales: " + gastosTotales);
    System.out.println("Ingresos totales: " + ingresosTotales);
    System.out.println("Ganancia: " + ganancia);
    System.out.println("Precio de venta por caja: " + precioVenta);
  }
}
