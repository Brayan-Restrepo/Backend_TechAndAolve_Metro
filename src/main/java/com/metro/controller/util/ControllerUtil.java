package com.metro.controller.util;

public class ControllerUtil {
    public static boolean isNumeric(String cadena) {
       boolean resultado;
       try {
           Integer.parseInt(cadena);
           resultado = true;
       } catch (NumberFormatException excepcion) {
           resultado = false;
       }
       return resultado;
   }
}