/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.controlate.web.ejb;

import cl.controlate.web.clases.datos_login;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

/**
 *
 * @author dev
 */
@Stateless
@LocalBean
public class Ejb_login {
    
    
    
    @Resource(mappedName = "jdbc/Controlate")
    DataSource Ds;
    
    public datos_login login (String rut,String pas){
        int cont=1;
        try {
           
            Connection conexion = Ds.getConnection();
            
            CallableStatement oStm = conexion.prepareCall("{call LOGIN(?,?,?,?,?,?)}");
            
           
            
            oStm.setString(cont++, rut);
            oStm.setString(cont++, pas);
            oStm.registerOutParameter(cont++, Types.VARCHAR ); // Nombre
            oStm.registerOutParameter(cont++, Types.VARCHAR ); // Rut
            oStm.registerOutParameter(cont++, Types.INTEGER ); // Codigo de error
            oStm.registerOutParameter(cont++, Types.VARCHAR ); // Descripcion de error
           
            
            
            oStm.execute();
             
            cont = 3;
            String sName = oStm.getString(cont++);
            String sRut = oStm.getString(cont++);
            int iError = oStm.getInt(cont++);
            String sError = oStm.getString(cont++);
            
            
            oStm.close();
            conexion.close();
            
            datos_login datos= new datos_login(sName,sRut, iError, sError);
            return datos;
            
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        
        return null;
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
