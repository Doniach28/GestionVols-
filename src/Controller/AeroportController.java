/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Aeroports;
import configs.Crude;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Donia CHAOUCHs
 */
public class AeroportController {
    private Crude crude = new Crude();
 
    public boolean insert(Aeroports e) {
        //Check for unique login/pwd
        
        String sql =
                "INSERT INTO aeroport (nom, pays) VALUES ('"
                + e.getNom()+ "','"+e.getPays()+ "')";
       System.out.println(sql);
        return crude.exeCreate(sql); 
    }

    public boolean update(Aeroports a , Integer id) {
        String sql;
        sql = "UPDATE aeroport SET nom='" + a.getNom() + "',  pays= '" + a.getPays() +  "' WHERE id=" + id;
        return crude.exeUpdate(sql);    
    }

    public boolean delete(Aeroports e) {
        String sql = "DELETE FROM aeroport WHERE id=" + e.getId();
        return crude.exeDelete(sql);    
    }

    public List<Aeroports> getAll() {
    try {
            String sql = "SELECT * FROM aeroport";
            ResultSet rs = crude.exeRead(sql);
            List<Aeroports> liste = new ArrayList<Aeroports>();
            while (rs.next()) {
                Aeroports user = new Aeroports();
                user.setId(rs.getInt(1));
                user.setNom(rs.getString(2));
                user.setPays(rs.getString(3));
              
                
                liste.add(user);
            }
            return liste;
        } catch (SQLException ex) {
                System.err.println(ex.getMessage());
             JOptionPane.showMessageDialog(null, "Erreur AdministratorDAO ", "Erreur ", JOptionPane.ERROR_MESSAGE);

            return null;
        }
    }

    public Aeroports findByID(int id) {
        try {
            String sql = "SELECT * FROM aeroport WHERE id = "+id;
            ResultSet rs = crude.exeRead(sql);
            Aeroports admin = new Aeroports();
            while (rs.next()) {
                admin.setId(rs.getInt(1));
                admin.setNom(rs.getString(2));
                admin.setPays(rs.getString(3));
                
            }
            return admin;
        } catch (SQLException ex) {
              System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur AdministratorDAO ", "Erreur ", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public Aeroports findByLoginPwd(String login, String pwd){
        Aeroports user = null;
        try {
            String sql = "SELECT * FROM aeroport WHERE login = '"+login+"' AND pwd = '"+pwd+"'";
            ResultSet rs = crude.exeRead(sql);
                while (rs.next()) {
                    user = new Aeroports();
                    user.setId(rs.getInt(1));
                    user.setNom(rs.getString(2));
                    user.setPays(rs.getString(3));
                    
                }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur AdministratorDAO ", "Erreur ", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return user;
    }
}
