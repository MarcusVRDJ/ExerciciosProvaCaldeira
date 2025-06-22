package org.example.PlataformaDeEstudos;

public class PlataformaDeEstudos{
    public static void main(String[] args) {
       int nota = 7;
       int peso = 2;
       double media = (nota * peso + 6 * 3) / 5.0;
        if (media >= 7.0) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}