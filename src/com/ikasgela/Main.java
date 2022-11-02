package com.ikasgela;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String entrada;

        do {
            System.out.print("Ingrese el mensaje a convertir: ");
            entrada = br.readLine().toUpperCase();

            if (entrada.equals("**STOP**")) {

                System.out.println("Programa terminado");
            } else {

                System.out.println("El mensaje: " + entrada + ", equivale en morse a: " + morse(entrada));
                System.out.println();
            }

        } while (!entrada.equals("**STOP**"));


    }

    public static StringBuilder morse(String mensaje) {

        StringBuilder mensajeTraducido = new StringBuilder();
        Map<String, String> codMorse;
        codMorse = IndiceMorse();
        char[] caracteres = mensaje.toCharArray();
        int contador = 0;

        for (char caracter : caracteres) {
            String digito = String.valueOf(caracter);
            if (digito.equals("C")) {

                String proximodigito = String.valueOf(caracteres[contador + 1]);
                if (proximodigito.equals("H")) {
                    digito = codMorse.get("CH");
                } else {
                    digito = codMorse.get(digito);
                }


            } else if (digito.equals("H") && contador > 0) {
                String digitoAnterior = String.valueOf(caracteres[contador - 1]);
                if (digitoAnterior.equals("C")) {
                    continue;
                }

            } else {

                digito = codMorse.get(digito);

            }

            mensajeTraducido.append(digito);
            mensajeTraducido.append(" ");
            contador++;
        }

        return mensajeTraducido;
    }


    public static HashMap<String, String> IndiceMorse() {

        HashMap<String, String> morse = new HashMap<>();

        morse.put("A", "._");
        morse.put("B", "_...");
        morse.put("C", "_._.");
        morse.put("CH", "____");
        morse.put("D", "_..");
        morse.put("E", ".");
        morse.put("F", ".._.");
        morse.put("G", "__.");
        morse.put("H", "....");
        morse.put("I", "..");
        morse.put("J", "..");
        morse.put("K", "_._");
        morse.put("L", "._..");
        morse.put("M", "__");
        morse.put("N", "_.");
        morse.put("Ñ", "__.__");
        morse.put("O", "___");
        morse.put("P", ".__.");
        morse.put("Q", "__._");
        morse.put("R", "._.");
        morse.put("S", "...");
        morse.put("T", "_");
        morse.put("U", ".._");
        morse.put("V", "..._");
        morse.put("W", ".__");
        morse.put("X", "_.._");
        morse.put("Y", "_.__");
        morse.put("Z", "__..");
        morse.put("0", "_____");
        morse.put("1", ".____");
        morse.put("2", "..___");
        morse.put("3", "...__");
        morse.put("4", "...._");
        morse.put("5", ".....");
        morse.put("6", "_....");
        morse.put("7", "__...");
        morse.put("8", "___..");
        morse.put("9", "____.");
        morse.put(".", "._._._");
        morse.put(",", "__..__");
        morse.put("?", "..__..");
        morse.put("\"", "._.._.");
        morse.put("/", "_.._.");
        morse.put(" ", "/");

        return morse;

    }
}
