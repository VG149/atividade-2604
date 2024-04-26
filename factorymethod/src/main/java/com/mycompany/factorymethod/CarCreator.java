/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author FATEC ZONA LESTE
 */

//cria a função build car e a variavel FactoryMethod
public abstract class CarCreator {
    public void buildCar(){
        Car carro = factoryMethod();
    }
    
    protected abstract Car factoryMethod();
}
