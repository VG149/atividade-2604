/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author FATEC ZONA LESTE
 */
//utiliza o Set para colcoar os valores dentro das variaveis model,factory e Category
public class ConcreteProductGol extends Car{
    public ConcreteProductGol(){
        this.setModel("Gol");
        this.setFactory("Volka");
        this.setCategory("Hatch");
        this.showInformation();
    }
}
