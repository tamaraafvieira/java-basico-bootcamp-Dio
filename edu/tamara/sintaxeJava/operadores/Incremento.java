package edu.tamara.sintaxeJava.operadores;

public class Incremento {
    
    public static void main(String[] args) {

        int numero = 5;
        //x repeticao
        numero = numero +1; 
        System.out.println(numero); 

        numero++;        
        System.out.println(numero); 

        System.out.println(numero++);    

        System.out.println(numero);
        System.out.println("--------------------");

        int numero2 = 5;

        System.out.println(++ numero2);
        System.out.println(numero2);
        System.out.println("--------------------");
        System.out.println(numero2--);
        System.out.println(numero2);
        System.out.println(--numero2);
        System.out.println(numero2);
        System.out.println("--------------------");
    }


    
}
