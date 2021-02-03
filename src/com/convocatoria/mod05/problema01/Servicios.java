package com.convocatoria.mod05.problema01;

public class Servicios {

  public double calcGastosTotales(int cantidadCajas, double precioCaja) {
    double gastosTotales;

    gastosTotales = cantidadCajas * precioCaja;
    if (cantidadCajas >= 200) {
      gastosTotales = cantidadCajas * precioCaja * (1.05);
    }

    return gastosTotales;
  }

  public double calcIngresosTotales(
    double gastosTotales,
    double porcentajeGanancia
  ) {
    double ingresosTotales;

    ingresosTotales = gastosTotales * (1 + porcentajeGanancia);

    return ingresosTotales;
  }

  public double calcGanancia(double gastosTotales, double ingresosTotales) {
    double ganancias;

    ganancias = ingresosTotales - gastosTotales;

    return ganancias;
  }

  public double calcPrecioVenta(double ingresosTotales, int cantidadCajas) {
    double precioVenta;

    precioVenta = ingresosTotales / cantidadCajas;

    return precioVenta;
  }
}
