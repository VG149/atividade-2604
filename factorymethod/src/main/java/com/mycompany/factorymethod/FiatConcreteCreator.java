/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author FATEC ZONA LESTE
 */
//retorna valores do ConcreteProductPalio(model,factory e category)
public class FiatConcreteCreator extends CarCreator{
    protected Car factoryMethod(){
        return new ConcreteProductPalio();
    }
}
