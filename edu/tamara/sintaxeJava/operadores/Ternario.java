package edu.tamara.sintaxeJava.operadores;

public class Ternario {
    public static void main(String[] args) {
        int a, b;

        a= 6;
        b= 6;
        String resultado = "";

        //Exemplo de condicionnal utilizando if/else
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println(resultado);
        
        System.out.println("Agora utilizando o operador ternário");

        resultado = a==b ?"verdadeiro" : "falso";

        System.out.println(resultado);
        
        int resultado2 = a == b ? 1 : 0;
        System.out.println(resultado2);
    }
}
