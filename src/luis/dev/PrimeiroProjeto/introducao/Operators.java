package luis.dev.PrimeiroProjeto.introducao;

import java.sql.SQLOutput;

public class Operators {
    public static void main (String [] args) {
        // + - / *
        // o resultado da operação de dois números inteiros é igual a um número inteiro
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);

        // %
        int resto = 20 / 2;
        System.out.println(resto);
        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("IsDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("IsDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("IsDezIgualVinte "+isDezIgualVinte);
        System.out.println("IsDezIgualDez "+isDezIgualDez);
        System.out.println("IsDezDiferenteVinte "+isDezDiferenteVinte);
    }
}
