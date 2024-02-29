package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args){
        // Atribuição em tipos primitivos

        // Com tipo primitivo, copiamos o valor em memória

        int intA = 1;
        int intB = intA;

        System.out.println("intA= " + intA + " intB= " + intB);
        intA = 2;
        System.out.println("intA= " + intA + " intB= " + intB);

        // Atribuição em objetos
        // Com objetos copiamos o valor da referência em memória, sem duplicar o objeto

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("objA= " + objA + " objB= " + objB);

        objA.setNum(2);
        System.out.println("objA= " + objA + " objB= " + objB);
    }
}
