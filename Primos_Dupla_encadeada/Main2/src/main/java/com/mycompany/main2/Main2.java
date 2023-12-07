/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main2;

import java.util.Random;

public class Main2 {
  public static void main(String[] args) {
    Random aleatorio = new Random(); //randolas
    int[] vetor = new int[1000];
    ListaDupla lista = new ListaDupla();

    for (int i = 0; i < 1000; i++) {
      vetor[i] = aleatorio.nextInt(19999) - 9999; //vai jogar aleatorio um numero 
      System.out.print(vetor[i] + " ");
      lista.adicionar(vetor[i]);
    }
    System.out.println(); //resto para imprimir dps do código princiapl 

    System.out.println("Lista em ordem crescente:"); 
    lista.imprimirCrescente();

    System.out.println("Lista em ordem decrescente:");
    lista.imprimirDecrescente();

    lista.removerPrimos();

    System.out.println("Lista após remover números primos (em ordem crescente):");
    lista.imprimirCrescente();
  }
}
