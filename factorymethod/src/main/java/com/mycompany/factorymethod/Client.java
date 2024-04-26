/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author FATEC ZONA LESTE
 */

//constroi 2 carros utilizando a função build car e usa os paraemtros do return do FiatConcreteCreator
public class Client {
    public static void main(String [] args){
     
        CarCreator creator1 = new FiatConcreteCreator();
        creator1.buildCar();
        
        CarCreator creator2 = new VolksConcreteCreator();
        creator2.buildCar();
    }
}
