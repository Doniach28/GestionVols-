/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Donia CHAOUCH
 */
public class Vol {
    private Integer id ; 
    private String numVol;

    public Vol() {
    }

    public Vol(String numVol) {
        this.numVol = numVol;
    }

    public Vol(Integer id, String numVol) {
        this.id = id;
        this.numVol = numVol;
    }

    public Integer getId() {
        return id;
    }

    public String getNumVol() {
        return numVol;
    }
    

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumVol(String numVol) {
        this.numVol = numVol;
    }

    @Override
    public String toString() {
        return "Vol{" + "id=" + id + ", numVol=" + numVol + '}';
    }
    
    
}
