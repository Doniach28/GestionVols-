/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Vol;
import Model.Vol;
import configs.Crude;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Donia CHAOUCH
 */
public class VolController {

    private Crude crude = new Crude();

    public boolean insert(Vol vol) {
        //Check for unique login/pwd

        String sql
                = "INSERT INTO vol (datedepart, heuredepart, datearrive, heurearrive) VALUES ('"
                + vol.getDatedepart() + "',"
                + vol.getHeuredepart() + "','"
                + vol.getDatearrive() + "','"
                + vol.getHeurearrive() + "')";
        
        System.out.println(sql);
        return crude.exeCreate(sql);
    }

}
