/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Escale;
import Model.Vol;

import configs.Crude;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Donia CHAOUCH
 */
public class EscaleController {

    private Crude crude = new Crude();

    public boolean insert(Escale escale) {
        //Check for unique login/pwd

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String sql
                = "INSERT INTO escale ( heurearrive ,heuredepart) VALUES ("
                + " str_to_date('" + escale.getHeurearrive() + "','%h:%i %p'),"
                + " str_to_date('" + escale.getHeuredepart() + "','%h:%i %p'),"
                + ")";

        System.out.println(sql);
        return crude.exeCreate(sql);
    }

}
