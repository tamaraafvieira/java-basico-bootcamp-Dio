package edu.tamara.sintaxeJava.tiposevariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
            double salarioMinimo = 2500;

            short numeroCurto = 1;
            int numeroNormal = numeroCurto;
            short numeroCurto2 = (short) numeroNormal; //aqui é um exemplo de cast ele pega um tipo curto e transforma em um tipo mais abrangente


            //exmplo de valor que nunca poderá mudar - Variável X Constantes
            // Constante deve estar em caixa alta e com final no inicio
            final double VALOR_DE_PI = 3.14; //é boa prática estar em caixa alta quando é final
            System.out.println(VALOR_DE_PI);          
    }

}
