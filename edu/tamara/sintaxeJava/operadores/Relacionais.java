package edu.tamara.sintaxeJava.operadores;

public class Relacionais {

    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;


        boolean simNao = numero1 == numero2;
        System.out.println("Numero1 é igual ao numero2? " + simNao);
        System.out.println("-----------------------------------");

        simNao = numero1 != numero2;
        System.out.println("Numero1 é diferente de numero2? " + simNao);
        System.out.println("-----------------------------------");

        simNao = numero1 > numero2;
        System.out.println("Numero1 é maior que o numero2? " + simNao);
        System.out.println("-----------------------------------");

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }else{
            System.out.println("a nossa condição é falsa");
        }
        System.out.println("-----------------------------------");
        System.out.println("                                    ");

        String nomeUm = "Tamara";
        String nomeDois = "Tamara";

        System.out.println( "nomeUm é igual ao nomeDois? " + (nomeUm == nomeDois));
        System.out.println("-----------------------------------");

        String nome3 = "Tamara";
        String nome4 = new String("Tamara" ); 
        //aqui da falso, pois criei um objeto. Os números vao para um espaço na memória, já com objetos é diferente.
        // para objetos usa-se o métido equals.

        System.out.println( "nome3 é igual ao nome4? " + (nome3 == nome4));
        System.out.println("-----------------------------------");

        String nome5 = "Tamara";
        String nome6 = new String("Tamara" );         

        System.out.println( "nome5 é igual ao nome6? " + (nome5.equals(nome6)));
        //utilizando o equals para objetos o resultado é true.

    }

    
}
