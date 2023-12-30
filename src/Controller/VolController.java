/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Aeroport;
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

    public boolean insert(Vol vol, Integer id_aeroport_depart, Integer id_aeroport_arrive) {
        //Check for unique login/pwd

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String sql
                = "INSERT INTO vol (datedepart, heuredepart, datearrive, heurearrive, reservable, id_aeroport_depart, id_aeroport_arrive) VALUES ("
                + "str_to_date('" + dateFormat.format(vol.getDatedepart()) + "', '%d/%m/%Y'),"
                + " str_to_date('" + vol.getHeuredepart() + "','%h:%i %p'),"
                + "str_to_date('" + dateFormat.format(vol.getDatearrive()) + "', '%d/%m/%Y'),"
                + " str_to_date('" + vol.getHeurearrive() + "','%h:%i %p'),"
                + vol.isReservable() + ","
                + id_aeroport_depart + ","
                + id_aeroport_arrive
                + ")";

        System.out.println(sql);
        return crude.exeCreate(sql);
    }

}
