package edu.tamara.anatomiadeclasses;
public class MinhaClasse {
    public static void main (String [] args) {

        String primeiroNome = "Tamara";
        String segundoNome = "Vieira";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
       return primeiroNome.concat(" ").concat(segundoNome);
       
    }
}
