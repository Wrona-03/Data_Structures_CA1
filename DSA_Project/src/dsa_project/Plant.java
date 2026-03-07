/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_project;

/**
 *
 * @author wikto
 */
abstract class Plant {
    protected String name;
    
    public Plant(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public abstract String getDescription();
    
    @Override
    public String toString(){
        return name;
    }
}
