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
    private LocalTime heurearrive;
    private LocalTime heuredepart;

    public Escale() {
    }

    public Escale(LocalTime heurearrive, LocalTime heuredepart) {
        this.heurearrive = heurearrive;
        this.heuredepart = heuredepart;
    }

    public Escale(Integer Id, LocalTime heurearrive, LocalTime heuredepart) {
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

    public LocalTime getHeurearrive() {
        return heurearrive;
    }

    public void setHeurearrive(LocalTime heurearrive) {
        this.heurearrive = heurearrive;
    }

    public LocalTime getHeuredepart() {
        return heuredepart;
    }

    public void setHeuredepart(LocalTime heuredepart) {
        this.heuredepart = heuredepart;
    }

    @Override
    public String toString() {
        return "Escale{" + "Id=" + Id + ", heurearrive=" + heurearrive + ", heuredepart=" + heuredepart + '}';
    }
    
    
    
}
