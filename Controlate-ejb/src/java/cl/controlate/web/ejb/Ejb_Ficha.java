/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.controlate.web.ejb;

import cl.controlate.web.clases.Citas;
import cl.controlate.web.clases.Controles;
import cl.controlate.web.clases.Medicamentos;
import cl.controlate.web.clases.Tutores;
import cl.controlate.web.clases.datos_login;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.sql.*;
import java.util.ArrayList;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.sql.DataSource;
import oracle.jdbc.*;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.oracore.OracleType;

/**
 *
 * @author Hector
 */
@Stateless
@LocalBean
public class Ejb_Ficha {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    //conexion a la bd
    @Resource(mappedName = "jdbc/Controlate")
    DataSource Ds;

    public ArrayList<Medicamentos> medicamentos(String rut) {
        int cont = 1;
        try {

            Connection conexion = Ds.getConnection();

            CallableStatement oStm = conexion.prepareCall("{call MEDICAMENTOS$.PROXIMOS_MEDICAMENTOS$(?,?,?,?)}");

            oStm.setString(cont++, rut);

            oStm.registerOutParameter(cont++, OracleTypes.CURSOR); // Nombre
            oStm.registerOutParameter(cont++, Types.INTEGER); // Codigo de error
            oStm.registerOutParameter(cont++, Types.VARCHAR); // Descripcion de error

            oStm.execute();

            cont = 2;
            ResultSet rs = (ResultSet) oStm.getObject(cont++);
            int iError = oStm.getInt(cont++);
            String sError = oStm.getString(cont++);
            // process result
            ArrayList<Medicamentos> med = new ArrayList<Medicamentos>();
            while (rs.next()) {
                Integer id = rs.getInt("ID_MEDICAMENTO");
                String name = rs.getString("NOMBRE");
                String sum = rs.getString("DOSIS");
                String fecha = rs.getDate("FECHA_HORA").toString();
                String alarma = rs.getDate("FECHA_HORA_AVISO").toString();
                String nameTratamiento = rs.getString("NOMBRE_TRATAMIENTO");
               // System.out.println("id "+id+"- name "+name+"- sum "+sum+"- fecha "+fecha+"- trat "+nameTratamiento);
                med.add(new Medicamentos(id.toString(),name,sum,fecha,alarma,nameTratamiento));
            }
//            
            oStm.close();
            conexion.close();

            return med;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
     public ArrayList<Citas> citas(String rut) {
        int cont = 1;
        try {

            Connection conexion = Ds.getConnection();

            CallableStatement oStm = conexion.prepareCall("{call CITAS$.CITAS_PROXIMAS$(?,?,?,?)}");

            oStm.setString(cont++, rut);

            oStm.registerOutParameter(cont++, OracleTypes.CURSOR); // Nombre
            oStm.registerOutParameter(cont++, Types.INTEGER); // Codigo de error
            oStm.registerOutParameter(cont++, Types.VARCHAR); // Descripcion de error

            oStm.execute();

            cont = 2;
            ResultSet rs = (ResultSet) oStm.getObject(cont++);
            int iError = oStm.getInt(cont++);
            String sError = oStm.getString(cont++);
            // process result
            ArrayList<Citas> citas = new ArrayList<Citas>();
            if(iError == 0){
            while (rs.next()) {
                Integer id = rs.getInt("ID_CITA");
                String name = rs.getString("NOMBRE_DOCTOR");
                String sum = rs.getString("ESPECIALIDAD_DOCTOR");
                String fecha = rs.getTimestamp("FECHA_HORA").toString();
                String alarma = rs.getTimestamp("FECHA_HORA_AVISO").toString();
                
               // System.out.println("id "+id+"- name "+name+"- sum "+sum+"- fecha "+fecha+"- trat "+nameTratamiento);
                citas.add(new Citas(id.toString(),name,sum,fecha,alarma));
            }
//            
            }
            oStm.close();
            conexion.close();

            return citas;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
     
      public ArrayList<Controles> controles(String rut) {
        int cont = 1;
        try {

            Connection conexion = Ds.getConnection();

            CallableStatement oStm = conexion.prepareCall("{call CONTROLES$.CONTROLES_PROXIMOS$(?,?,?,?)}");

            oStm.setString(cont++, rut);

            oStm.registerOutParameter(cont++, OracleTypes.CURSOR); // Nombre
            oStm.registerOutParameter(cont++, Types.INTEGER); // Codigo de error
            oStm.registerOutParameter(cont++, Types.VARCHAR); // Descripcion de error

            oStm.execute();

            cont = 2;
            ResultSet rs = (ResultSet) oStm.getObject(cont++);
            int iError = oStm.getInt(cont++);
            String sError = oStm.getString(cont++);
            // process result
            ArrayList<Controles> ctr = new ArrayList<Controles>();
            if(iError == 0){
            while (rs.next()) {
                Integer id = rs.getInt("ID_CONTROL");
                String name = rs.getString("NOMBRE");
                String trat = rs.getString("NOMBRE_TRATAMIENTO");
                String fecha = rs.getTimestamp("FECHA_HORA").toString();
                String alarma = rs.getTimestamp("FECHA_HORA_AVISO").toString();
                
               // System.out.println("id "+id+"- name "+name+"- sum "+sum+"- fecha "+fecha+"- trat "+nameTratamiento);
                ctr.add(new Controles(id.toString(),name,fecha,trat,alarma));
            }
//            
            }
            oStm.close();
            conexion.close();

            return ctr;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
      
      
      public ArrayList<Tutores> tutores(String rut) {
        int cont = 1;
        try {

            Connection conexion = Ds.getConnection();

            CallableStatement oStm = conexion.prepareCall("{call TUTORES$.MOSTRAR_TUTORES$(?,?,?,?)}");

            oStm.setString(cont++, rut);

            oStm.registerOutParameter(cont++, OracleTypes.CURSOR); // Nombre
            oStm.registerOutParameter(cont++, Types.INTEGER); // Codigo de error
            oStm.registerOutParameter(cont++, Types.VARCHAR); // Descripcion de error

            oStm.execute();

            cont = 2;
            ResultSet rs = (ResultSet) oStm.getObject(cont++);
            int iError = oStm.getInt(cont++);
            String sError = oStm.getString(cont++);
            // process result
            ArrayList<Tutores> tutor = new ArrayList<Tutores>();
            if(iError == 0){
            while (rs.next()) {
                Integer id = rs.getInt("ID_RELACION_TUTOR");
                String name = rs.getString("NOMBRE");
                String trat = "sdadfadfas";//rs.getString("PARENTESCO");
               
                
               // System.out.println("id "+id+"- name "+name+"- sum "+sum+"- fecha "+fecha+"- trat "+nameTratamiento);
                tutor.add(new Tutores(id.toString(),name,trat));
            }
//            
            }
            oStm.close();
            conexion.close();

            return tutor;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
    
     public ArrayList<Tutores> tutorados(String rut) {
        int cont = 1;
        try {

            Connection conexion = Ds.getConnection();

            CallableStatement oStm = conexion.prepareCall("{call TUTORES$.MOSTRAR_TUTORADOS$(?,?,?,?)}");

            oStm.setString(cont++, rut);

            oStm.registerOutParameter(cont++, OracleTypes.CURSOR); // Nombre
            oStm.registerOutParameter(cont++, Types.INTEGER); // Codigo de error
            oStm.registerOutParameter(cont++, Types.VARCHAR); // Descripcion de error

            oStm.execute();

            cont = 2;
            ResultSet rs = (ResultSet) oStm.getObject(cont++);
            int iError = oStm.getInt(cont++);
            String sError = oStm.getString(cont++);
            // process result
            ArrayList<Tutores> tutor = new ArrayList<Tutores>();
            if(iError == 0){
            while (rs.next()) {
                Integer id = rs.getInt("ID_RELACION_TUTOR");
                String name = rs.getString("NOMBRE");
                String trat = "sdadfadfas";//rs.getString("PARENTESCO");
               
                
               // System.out.println("id "+id+"- name "+name+"- sum "+sum+"- fecha "+fecha+"- trat "+nameTratamiento);
                tutor.add(new Tutores(id.toString(),name,trat));
            }
//            
            }
            oStm.close();
            conexion.close();

            return tutor;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
