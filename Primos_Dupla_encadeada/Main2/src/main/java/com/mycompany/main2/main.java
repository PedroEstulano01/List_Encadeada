/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main2;

class Elemento {
    int valor;
    Elemento proximo;
    Elemento anterior;
}

class ListaDupla {
    Elemento inicio;

    void adicionar(int valor) { //volta aq depois do vídeo. 
        Elemento novoElemento = new Elemento();
        novoElemento.valor = valor;
        novoElemento.proximo = null;
        novoElemento.anterior = null;

        if (inicio == null) {
            inicio = novoElemento;
        } else {
            Elemento temp = inicio;
            Elemento anterior = null;
            while (temp != null && temp.valor < valor) {
                anterior = temp;
                temp = temp.proximo;
            }
            if (temp == null) {
                anterior.proximo = novoElemento;
                novoElemento.anterior = anterior;
            } else if (temp == inicio) {
                novoElemento.proximo = inicio;
                inicio.anterior = novoElemento;
                inicio = novoElemento;
            } else {
                novoElemento.proximo = temp;
                novoElemento.anterior = anterior;
                anterior.proximo = novoElemento;
                temp.anterior = novoElemento;
            }
        }
    }

    void imprimirCrescente() { // este será para a impressão 
        Elemento temp = inicio;
        while (temp != null) {
            System.out.print(temp.valor + " ");
            temp = temp.proximo;
        }
                System.out.println(); //ponto
    }

    void imprimirDecrescente() { // Pesquisar: ImprimirDescrescente JAVA EXEMPLOS. 
        Elemento temp = inicio;
        if (temp == null) return;
        while (temp.proximo != null) {
            temp = temp.proximo;
        }
        while (temp != null) {
            System.out.print(temp.valor + " ");
            temp = temp.anterior;
        }
                 System.out.println();
    }

    void removerPrimos() { //remove pm
        Elemento temp = inicio;
        while (temp != null) {
            if (ehPrimo(temp.valor)) {
                if (temp == inicio) {
                    inicio = temp.proximo;
                    if (inicio != null) inicio.anterior = null;
                 } else {
                    temp.anterior.proximo = temp.proximo;
                    if (temp.proximo != null) temp.proximo.anterior = temp.anterior;
               }
           }
                temp = temp.proximo;
        }
    }

    boolean ehPrimo(int n) { //primolas
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0)   return false;
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0)             
                return false;
        }
        return true;
    }
}