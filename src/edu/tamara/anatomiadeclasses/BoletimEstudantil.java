package edu.tamara.anatomiadeclasses;
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if(mediaFinal < 6)
            System.out.println("Reprovado");
        else if (mediaFinal == 6)
            System.out.println("Prova de recuperacao");
        else
            System.out.println("Aprovado");

    }



}
