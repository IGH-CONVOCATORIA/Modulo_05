package com.convocatoria.mod05.problema02;

public class Servicios {

  public double calcComision(int mes, double ventas) {
    double comision;

    comision = 0;
    if (0 < mes && mes < 4) {
      comision = 80000 * 0.10;
    } else if (3 < mes && mes < 7) {
      comision = 60000 * 0.12;
    } else if (6 < mes && mes < 10) {
      comision = 70000 * 0.15;
    } else if (9 < mes && mes < 13) {
      comision = 100000 * 0.16;
    }

    return comision;
  }

  public double calcBono(int mes, double ventas) {
    double bono;

    bono = 0;
    if (0 < mes && mes < 4) {
      bono = (ventas - 80000) * 0.03;
    } else if (3 < mes && mes < 7) {
      bono = (ventas - 60000) * 0.05;
    } else if (6 < mes && mes < 10) {
      bono = (ventas - 70000) * 0.07;
    } else if (9 < mes && mes < 13) {
      bono = (ventas - 100000) * 0.08;
    }

    return bono;
  }

  public double calcPagoTotal(double comision, double bono) {
    double pagoTotal;

    pagoTotal = comision + bono;

    return pagoTotal;
  }
}
