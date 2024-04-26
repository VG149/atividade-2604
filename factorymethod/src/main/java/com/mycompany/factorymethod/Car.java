/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author FATEC ZONA LESTE
 */
//cria a classe Carro e print informações sobre ela
public abstract class Car {
    private String model;
    private String factory;
    private String category;
    
    public void showInformation() {
        System.out.print("Model:" + this.getModel() + "\nFactory:" + this.getFactory() + "/nCategory:" + this.getCategory());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
}
