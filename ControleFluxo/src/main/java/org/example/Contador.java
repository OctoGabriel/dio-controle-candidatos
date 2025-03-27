package org.example;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int parametroUm = scan.nextInt();
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }


    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm < parametroDois){
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }

        int contagem = parametroUm - parametroDois;
        for(int i=contagem; i>=0; i--){
            System.out.println("Contagem: " + contagem);
            contagem--;
        }
    }
}
