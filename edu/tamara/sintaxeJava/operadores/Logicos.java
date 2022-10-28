package edu.tamara.sintaxeJava.operadores;

public class Logicos {
    public static void main(String[] args){
        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");            
        }else{
            System.out.println("as duas condições são falsas"); 
        }
        System.out.println("--------------------");

        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeiras");            
        }
        System.out.println("--------------------");
        
        if(condicao1 && (7 > 4)){
            System.out.println("as duas condições são verdadeiras");            
        }else{
            System.out.println("as duas condições são falsas"); 
        }


    }
}
