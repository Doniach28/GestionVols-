/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Donia CHAOUCH
 */
public class Aeroport {

    private Integer id_aeroport;

    
    private String nom, pays;

    public Aeroport() {
    }

    public Aeroport(String nom, String pays) {
        this.nom = nom;
        this.pays = pays;
    }

    public Aeroport(Integer id_aeroport, String nom, String pays) {
        this.id_aeroport = id_aeroport;
        this.nom = nom;
        this.pays = pays;
    }

    public Integer getId_aeroport() {
        return id_aeroport;
    }

    public void setId_aeroport(Integer id_aeroport) {
        this.id_aeroport = id_aeroport;
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public String toString() {
        return "Aeroport{" + "id_aeroport=" + id_aeroport + ", nom=" + nom + ", pays=" + pays + '}';
    }
    
}
