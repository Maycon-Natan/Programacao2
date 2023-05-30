/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB1;

import java.util.ArrayList;
import java.util.EmptyStackException;


public class Fila<T> {
    private final ArrayList<T> arrey;
    
    public Fila(){
        arrey = new ArrayList();
    }
    
    public void enfileirar(T item){
        arrey.add(item);
        for(T elemento:arrey){
            System.out.println(elemento);
            
        }
    }
    
    public T encerrarAtendimento(){
        if(arrey.isEmpty()){
            System.out.println("A fila esta vazia");
            throw new EmptyStackException();
        }
        return arrey.remove(arrey.size()-1);
    }
}
