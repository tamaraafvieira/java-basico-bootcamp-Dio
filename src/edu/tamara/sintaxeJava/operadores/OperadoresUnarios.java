package edu.tamara.sintaxeJava.operadores;

public class OperadoresUnarios {
    public static void main(String[] args){
        int numero = 5;

        numero = -numero;        
        System.out.println(numero); 


        numero = + numero;
        System.out.println(numero); // nao tornou o numero positivo, pois preciso fazer uma multiplicação

        numero = numero * -1;
        System.out.println(numero); //Agora sim o numero voltou a ser positivo

        

    }
}
