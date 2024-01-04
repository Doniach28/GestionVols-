/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import org.joda.time.LocalTime;

/**
 *
 * @author Donia CHAOUCH
 */
public class Escale {
    private Integer Id;
    private String heurearrive;
    private String heuredepart;

    public Escale() {
    }

    public Escale(String heurearrive, String heuredepart) {
        this.heurearrive = heurearrive;
        this.heuredepart = heuredepart;
    }

    public Escale(Integer Id, String heurearrive, String heuredepart) {
        this.Id = Id;
        this.heurearrive = heurearrive;
        this.heuredepart = heuredepart;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getHeurearrive() {
        return heurearrive;
    }

    public void setHeurearrive(String heurearrive) {
        this.heurearrive = heurearrive;
    }

    public String getHeuredepart() {
        return heuredepart;
    }

    public void setHeuredepart(String heuredepart) {
        this.heuredepart = heuredepart;
    }

    @Override
    public String toString() {
        return "Escale{" + "Id=" + Id + ", heurearrive=" + heurearrive + ", heuredepart=" + heuredepart + '}';
    }

  
    
}
