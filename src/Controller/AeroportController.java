/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Aeroports;
import Model.Aeroport;
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
 
    public boolean insert(Aeroport aeroport) {
        //Check for unique login/pwd
        
        String sql =
                "INSERT INTO aeroport (nom, pays) VALUES ('"
                + aeroport.getNom()+ "','"+aeroport.getPays()+ "')";
       System.out.println(sql);
        return crude.exeCreate(sql); 
    }

    
   
}
