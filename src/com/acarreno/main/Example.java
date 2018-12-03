package com.acarreno.main;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Example {

  public static void main(String args[]) {

    System.out.println(formatMoney("12345.123"));

  }

  private static String formatMoney(String number) {
    number = number.replace(",", "");
    DecimalFormat df = new DecimalFormat("#,##0.00");
    return df.format(new BigDecimal(number));
  }

}
