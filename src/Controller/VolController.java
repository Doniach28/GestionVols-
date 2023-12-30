/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Vol;
import Model.Vol;
import configs.Crude;
import java.sql.Date;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
      //INSERT INTO `vol`( `datedepart`, `heuredepart`, `datearrive`, `heurearrive`, `reservable`) VALUES (str_to_date('11/20/2020', '%m/%d/%Y'),str_to_date('09:00 AM','%h:%i %p'),str_to_date('10/20/2022', '%m/%d/%Y'),str_to_date('10:00 PM','%h:%i %p'),1);
      DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
      
        
      String sql
                = "INSERT INTO vol (datedepart, heuredepart, datearrive, heurearrive, reservable) VALUES ("
              + "str_to_date('"+dateFormat.format(vol.getDatedepart())+"', '%d/%m/%Y'),"
                //+dateFormat.format(vol.getDatedepart())  + "',"
             +" str_to_date('"+vol.getHeuredepart()+"','%h:%i %p'),"
                //+vol.getHeuredepart() + "',"
              + "str_to_date('"+dateFormat.format(vol.getDatearrive())+"', '%d/%m/%Y'),"
                //+dateFormat.format(vol.getDatearrive()) + "','"
              +" str_to_date('"+vol.getHeurearrive()+"','%h:%i %p'),"
                //+vol.getHeurearrive() + "',"
                + vol.isReservable()+")";
        
        System.out.println(sql);
        return crude.exeCreate(sql);
    }

}
