/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_project;

/**
 *
 * @author wikto
 */
public class PlantSuggestion {

    String area;
    Plant plant;

    public PlantSuggestion(String area, Plant plant) {
        this.area = area;
        this.plant = plant;
    }

    @Override
    public String toString() {
        return area + " -> " + plant.getName();
    }

}
