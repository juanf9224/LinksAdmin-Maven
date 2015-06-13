/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsgroupsrl.linksadmin2_0.servicio;

/**
 *
 * @author Brey
 */

import com.adsgroupsrl.linksadmin2_0.modelo.Buscar;
import com.adsgroupsrl.linksadmin2_0.modelo.Subir;
import com.adsgroupsrl.linksadmin2_0.LinksAdmin;
import java.sql.SQLException;
import java.util.ArrayList;

public class Servicio {
    Subir sub;
    Buscar bus;
    LinksAdmin la;
    ArrayList<Object[]> datosT = new ArrayList<>();
    
    public Servicio(){
        
    }
    
    public Servicio(Subir sub, Buscar bus){
        this.sub = sub;
        this.bus = bus;
    }
    
    public void Subir(String video, String script, String analisis, String publisher, String fecha) throws SQLException{
    
        sub.subir(video, script, analisis, publisher, fecha);
    }
    
    public void buscar(String fromDate, String toDate, String findPublisher) throws SQLException{
        bus.buscar(fromDate, toDate, findPublisher);
    }
    
    public void llenarTabla(ArrayList<Object[]> datos) throws SQLException{
        this.datosT = datos;
        LinksAdmin.getInstance().llenarTablaL(datosT);
    }
    
}
