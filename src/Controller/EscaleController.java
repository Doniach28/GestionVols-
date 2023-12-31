/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Escale;

import configs.Crude;

/**
 *
 * @author Donia CHAOUCH
 */
public class EscaleController {

    private Crude crude = new Crude();

    public boolean insert(Escale escale , Integer id_vol, Integer id_aeroport) {
        //Check for unique login/pwd

        String sql
                = "INSERT INTO escale (id_vol , id_aeroport ) VALUES ("
                + id_vol + ","
                + id_aeroport + ")";

        System.out.println(sql);
        return crude.exeCreate(sql);
    }

}
